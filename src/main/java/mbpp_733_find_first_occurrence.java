package mbpp_733_find_first_occurrence;

public class mbpp_733_find_first_occurrence {

    
    public static int findFirstOccurrence_Problem_2_fef1fce7_e503_4446_bd86_1bda7db290ad(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = -1;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c03e1349_286e_4c13_8881_2fc63d8f2b41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_251360f1_031e_41db_ad48_b6d201cca377(ArrayList<Integer> A, int x) {
        // Write your code here
        int index = -1;
        
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_ba6c93ef_6bb4_43a0_8bf0_a6ce844a34c8(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_caf605d6_96b8_4cd5_8a4d_be7aed1753ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e167d92a_5dfd_4065_adce_18f1ac8a7d23(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_efc1c736_39be_47b9_8ab4_ccf74a25abad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_50a9788e_a46b_4593_aa25_91b44140711a(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_b11069cb_e401_411d_9636_34fd1c30972a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f77b2a6a_4e64_4898_ae28_3121e5199de1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_35037186_dbb7_4e1a_89fb_6306d539a38b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_26c45cf5_84ca_4cf3_9261_d2ccb6112612(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3fa606fd_da99_47f2_abc3_a9c1b375706f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_35037186_dbb7_4e1a_89fb_6306d539a38b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_95026eac_1811_408d_9f28_1c4669b8662f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7b1fbe1e_151d_4e93_8da7_912b696310bb(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_c607b90b_eb4f_4713_9b48_4218464a505f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_fef1fce7_e503_4446_bd86_1bda7db290ad(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = -1;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_66331285_2d48_4783_81e7_8da341cea695(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_624f6a6c_4c79_4d4e_bead_0442cfbb5712(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_853e4688_d7b5_4f71_a3c5_56021aa575c6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e60edba1_05d8_4a73_8e04_c1328c19d713(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_fa303480_ebe7_44f3_aa4e_402e06d4fe43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_0a674801_7682_4fe4_b571_45dc063c98b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ebdc652f_1587_42cb_8751_410f2d78ed67(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_c03e1349_286e_4c13_8881_2fc63d8f2b41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2d2cf387_0af7_40b8_9a31_7dd0d69ca8b3(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3309e2ff_4ac9_4a18_ae7f_bd4cefefa002(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_fef6feed_1b72_4d68_b113_a445bc50f2f5(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_0_9dd67970_6e7d_4c66_b949_e324484d8fd7(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index >= 0) {
            index = findFirstOccurrence_Problem_0_9dd67970_6e7d_4c66_b949_e324484d8fd7(A, x);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_30974ab4_863b_408f_a80e_b165e5256037(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_6374c109_6f89_4c64_994a_a31d6a9f6907(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_73a84fd9_75f5_4004_bf84_9126daa3cd09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c07d320b_20e3_4e70_beec_9f190441c284(ArrayList<Integer> A, int x) {
        // TODO: Your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b08815ae_b07e_4460_8a74_46b0a884eb02(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7da1d56a_6169_4416_9bb9_c14b8eb0c276(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size() ; i++) {
            if(A.get(i) == x) { index = i; }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_7e6fde82_54e3_4375_9f50_72f5ea5188ae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2819ca5b_a100_40c7_a8b7_51b5ab5357eb(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size()-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(A.get(mid) == x){
                result = mid;
                high = mid-1;
            }
            else if(A.get(mid) > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_54e3cd00_bba0_4b39_96dd_c91810d4cee4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ac44b60d_62fd_4109_b531_495148d78d15(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_869a754b_f33a_4277_8599_533c4e872f94(ArrayList<Integer> A, int x) {
        int low=0;
        int high=A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f2cae02c_3bc3_43d6_8be2_49aad9a568f0(ArrayList<Integer> A, int x) {
        return A.stream().filter((n) -> n.intValue() == x).findFirst().get();
    }

    
    public static int findFirstOccurrence_Problem_2_6012c006_ccd9_4f32_9743_8be0f2ef281e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d5168e27_01a8_4b8f_9404_fb94028e6711(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                indexOfFirstOccurrence = i;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_2_e2bd3ad0_bdf4_4deb_9299_aea6e24d051d(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e9e67b2f_26e0_4eac_8d0c_affb09ad01c9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_22feccb8_82b4_4535_acba_ad0784b5a0a2(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3a16b9c3_8a33_40f2_9cce_5eb03ba87643(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3cecfefa_1a34_4d78_a01c_c2100956daf1(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index != -1) return index;
        else {
            int low=0;
            int high=A.size();
            while (low<high) {
                int mid = (low+high)/2;
                if (A.get(mid)<x) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int findFirstOccurrence_Problem_2_d626e359_0cd4_49f7_a365_80cbe2aba923(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3a03808e_b570_466d_82ad_24105c519733(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_94140c80_19fb_4863_8d01_31373b3c90e6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_92ed4a7d_26b3_4d75_88bd_dcacc7d891fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1265e4f5_18a4_4714_8d33_7738ebfcaff7(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_02074117_76de_40aa_a5df_002b2d766974(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_570d1ba1_3b5c_439f_87c1_f5f9dbc6bb26(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence > x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence < x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
        }
        if(lastOccurrence == -1) {
            return -1;
        }
        else {
            return index;
        }
    }

    
    public static int findFirstOccurrence_Problem_0_f865c6e3_acf0_4e27_8f6c_a841eb23e049(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_225f19d3_3ba1_437a_86a8_67e0341b50d1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            Integer midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b4de3648_586b_455c_a272_565b6513aa5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_2b1377c5_8c92_4066_841a_e6f4055914f0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ec9dc551_3889_4fdc_9577_dae5f83b1c19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e81e617f_a0a5_4e05_8782_33a36711fd02(ArrayList<Integer> A, int x) {
        int idx = -1;
        int i = 0;
        
        while(i < A.size()) {
            idx = i;
            if(A.get(i) >= x)
                break;
            i++;
        }
        
        return idx;
    }

    
    public static int findFirstOccurrence_Problem_1_96ad941e_de5a_4e69_9168_17cbb9562b0f(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ed442b1d_373c_4fdf_8ea1_7d279a24ff3e(ArrayList<Integer> A, int x) {
        // Return the position of the first occurrence of x in A
        if(A.isEmpty())
            return -1;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x)
                return i;
        }

        // If x is not present in array list, return -1
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_04906336_f1a8_405d_bca7_3ecddf467ecd(ArrayList<Integer> A, int x) {
        int firstIndex = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_1_00aeab65_3a47_47bd_bca3_5506662c55b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8858ed70_be45_407a_b362_0fe1ff925b4c(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ceed78e6_522f_4313_a8f7_69dcb119c10c(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_02042576_48e5_491c_ab0c_4b3f9d93aa08(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            }
            else if(A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_d39c3723_9cb6_4fa4_a622_a459e4ab5b91(ArrayList<Integer> A, int x) {
        
        int result = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_426ca3ae_e31a_4d35_b467_9138257e6693(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_28f824bd_96f8_4da7_a389_ac50607e40b5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b85fd35a_fe30_4fca_bf1f_c185a3a58562(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_74f5698f_361a_4f2c_b0db_2ce67af45402(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8b961b5e_67cd_44d7_8c9a_ad80b9633ea0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_65e397bf_8307_42ce_b555_ff7460c39d25(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) > x) {
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9fe0f1dd_862d_4c3b_a80b_fe7c99359f41(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2d333671_9709_43eb_99b9_a698383e67d1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_bf2b3437_5566_4118_ac93_a0770ddb1270(ArrayList<Integer> A, int x) {
        for (int a : A) {
            if (a == x) {
                return A.indexOf(a);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ea012a2e_e2f4_4b13_8f13_f5c65a562102(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_4e840c3c_0ec1_427c_8b64_a74ed68e7167(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_caaabb67_c1a8_4968_b61f_37e14ad0021a(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_ec36c00b_8d65_4e57_a072_eb381316fdbf(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3b247087_fb3b_435a_8169_5cc0545df155(ArrayList<Integer> A, int x) {
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3fccbcf4_3fc0_4f00_a28a_e5454e3d085b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_c79069aa_5dbe_44e2_8567_f54a79e0b5f5(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if (A.get(j) == x) {
                return j;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f3cffbb5_0d30_4fe9_9749_36181b0cec12(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_34286c14_50d2_4e75_9493_66938b2ada9e(ArrayList<Integer> A, int x) {
        // write your code
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7a01014d_3fe9_42f0_bb81_57a4fcf04073(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0) {
                    return mid;
                }
                if (A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_30974ab4_863b_408f_a80e_b165e5256037(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7a054a4f_83db_4e23_96ef_015b8b7d0278(ArrayList<Integer> A, int x) {
        // write your logic here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_eaddd582_21b3_468d_aa19_e06a01c7ae28(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_95026eac_1811_408d_9f28_1c4669b8662f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_2d333671_9709_43eb_99b9_a698383e67d1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_673140dd_9a35_44a8_af23_cf9521002d23(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b521a1ad_7c28_4af3_b957_21343fbf731c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_efb37230_b6af_4d95_b07a_a6540b270ee6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_c31ae65b_30d6_4101_8663_fbd3fbab7cc3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_570d1ba1_3b5c_439f_87c1_f5f9dbc6bb26(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence > x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence < x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
        }
        if(lastOccurrence == -1) {
            return -1;
        }
        else {
            return index;
        }
    }

    
    public static int findFirstOccurrence_Problem_0_7709d15e_44e6_44df_aadf_cf3168c4d118(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid-1) != x) {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(A.get(mid) > x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7bd8b23b_6f16_452a_8f0f_c0effcf9451a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_189f9203_1f17_4f83_9ba9_88abf2c0d594(ArrayList<Integer> A, int x) {
        // Your code here
        int start = 0;
        int end = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (A.get( mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get( mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_14f9b52d_baba_4fee_9165_3ee9a2a540da(ArrayList<Integer> A, int x) {
        if (A.isEmpty()) {
            return -1;
        }

        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);

            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b7a20c62_3569_48b4_af07_faea37f7f331(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_30e8e639_8fcc_461e_b9d2_29f1157c60d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_00989554_9bf5_4115_8010_0a81b03ed787(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_0e16751b_2156_45d3_a8e2_074ae2123f5b(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_31a45a9c_883f_4a43_8dc0_b46b22879cc3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7a7797c3_e6d1_4bc4_b2d1_e77f631b5916(ArrayList<Integer> A, int x) {
        int index;
        for(index = 0; index < A.size(); index++) {
            if(A.get(index) == x) {
                return index;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_967baf98_001a_43a5_bbda_6694e87e80ca(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_cd6ae7f1_726f_49d0_837f_cdc6042ba0ac(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b521a1ad_7c28_4af3_b957_21343fbf731c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_722285e5_be31_48dc_a730_5c7d07b3b716(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_722285e5_be31_48dc_a730_5c7d07b3b716(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e881ed6a_735f_42d7_a7c4_b91c5fba0ce9(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_182ebb91_dbea_4e0f_8e1c_3432abfcd346(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1a2c274e_2703_44b3_8c96_33b3371f7474(ArrayList<Integer> A, int x) {
        // Write your code here
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_ad36e8fe_9a36_42e6_b6c5_5427280b1781(ArrayList<Integer> A, int x) {
        if (A.size() == 0) return -1;
        // Ask the array list to find it
        int index = A.indexOf(x);
        // If it's not found, return the answer
        if (index == -1) return -1;
        // Otherwise move the pointer
        return index + 1;
    }

    
    public static int findFirstOccurrence_Problem_1_28a6fd62_dcf4_4095_8e81_cb2db5249a0f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_99789992_5e25_4dbe_9abc_6af430bf577e(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if(A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_13fd4e38_48be_4886_b755_d1e94510ded1(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_09c7874b_3e43_4621_a062_7a4b13237fc4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8bb64f1f_a637_457e_b01e_fb28d904f127(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f865c6e3_acf0_4e27_8f6c_a841eb23e049(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b1b2c98a_da44_43ae_9d49_c59e8a23fb2b(ArrayList<Integer> A, int x) {
        
        // Your code here
        int i=0,j=0;
        while(i<A.size() && j<A.size()){
            if(A.get(i)<=x)
                i++;
            else
            {
                if(A.get(j)<x)
                    return i;
                else
                    return j;
            }
        }
        return -1;
        
    }

    
    public static int findFirstOccurrence_Problem_2_21e426f7_7cb4_440e_acb7_70b5d8bd7721(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_2b60ff46_fe87_4c73_a7fc_2eb09e157e76(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7c509caf_2f37_4ddf_a633_3df6283bb613(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( (mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_881d575d_c7d1_4867_b1e1_d84ff4b17b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_165f483b_aafe_4d67_b538_c4895d2d09bf(ArrayList<Integer> A, int x) {
        int result = -1;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) > x)
            i--;
        if (i > -1)
            result = i;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_548608be_44fd_4d7e_980b_2d38ae3bdb37(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_961eb8f5_8816_4bb6_9c4c_71d006bb9587(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6823514f_e736_48d4_b5b9_d4bfa84082fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_0_94140c80_19fb_4863_8d01_31373b3c90e6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1a0dfe48_44c4_49ad_b4f7_6a4ceae8b211(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_50a9788e_a46b_4593_aa25_91b44140711a(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_e81e617f_a0a5_4e05_8782_33a36711fd02(ArrayList<Integer> A, int x) {
        int idx = -1;
        int i = 0;
        
        while(i < A.size()) {
            idx = i;
            if(A.get(i) >= x)
                break;
            i++;
        }
        
        return idx;
    }

    
    public static int findFirstOccurrence_Problem_2_ce28de52_cba0_4231_a5f5_9e5c2b3c53a3(ArrayList<Integer> A, int x) {
        int firstOcc = -1;
        for(int i=0; i< A.size(); i++) {
            if(A.get(i) == x) {
                firstOcc = i;
                break;
            }
        }
        return firstOcc;
    }

    
    public static int findFirstOccurrence_Problem_2_5c3981ff_86ac_4a54_93a2_9433d0ff6443(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_09c7874b_3e43_4621_a062_7a4b13237fc4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_caaabb67_c1a8_4968_b61f_37e14ad0021a(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_3edb2f94_5bec_481d_b9ca_1a001ae44690(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_11507c5d_72d9_42a5_859d_f8fd87f01803(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_0b64df7b_e415_4441_a73b_268bae1ff1f8(ArrayList<Integer> A, int x) {
        int i = 0, n = A.size();
        while (i < n) {
            if (A.get(i) == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7da1d56a_6169_4416_9bb9_c14b8eb0c276(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size() ; i++) {
            if(A.get(i) == x) { index = i; }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_63054dd1_9ff9_45b5_b639_f67bfdd4b1fb(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_6f607376_1944_435a_a788_e90c1b62f0a0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_68b09b80_8d35_4ff4_85ec_d72843ed4403(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b9adc9e4_cc4f_4cab_a102_30c94f8f0978(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_22feccb8_82b4_4535_acba_ad0784b5a0a2(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2b1377c5_8c92_4066_841a_e6f4055914f0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7a01014d_3fe9_42f0_bb81_57a4fcf04073(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0) {
                    return mid;
                }
                if (A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e6d8742c_726a_497a_be2f_3deb30ff5089(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a96ebcca_9bb9_4a1b_b77c_065c86600caf(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ab41fa17_d067_424d_91b6_8da4de7859d4(ArrayList<Integer> A, int x) {
        int index = 0;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) <= x) {
            index++;
            i--;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_c5e76721_2212_4d99_a906_139f53dbc10b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9e276638_48b8_4c49_99d0_30837ce81747(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_2104f1ee_137b_4ea0_b2bd_5bc8d04d0481(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b0af17cb_832d_4c99_abb5_de8726b07546(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3fccbcf4_3fc0_4f00_a28a_e5454e3d085b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ceac88f1_23d6_472b_b622_073bfca534a5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_03580f70_660b_4b7d_9eaf_3f27b5057b92(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_4b50885b_1779_492b_961c_41725b369da1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_95026eac_1811_408d_9f28_1c4669b8662f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_81b382b5_6774_4bfa_9229_794f02ad3a26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_93535649_a1b6_4d3a_b970_845ac87e80b1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_97c886ee_faac_4bea_a374_f01d77f7c334(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_31a64c37_32b8_4881_9e1b_6199ca63468b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ab41fa17_d067_424d_91b6_8da4de7859d4(ArrayList<Integer> A, int x) {
        int index = 0;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) <= x) {
            index++;
            i--;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_5b5d7709_2413_4069_88c1_0d67e57d5ff5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_881d575d_c7d1_4867_b1e1_d84ff4b17b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_37a35932_db6d_41f0_9f15_a0589481e0cd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9be93537_ae4c_4bdb_b9d3_42765209d38d(ArrayList<Integer> A, int x) {
        // Returns the index of the first occurrence of x in array A, or -1 if x is not in A.
        // Binary search.
        int low = 0;
        int high = A.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_517a8cee_89b7_4b8a_aa12_c199f5b8e885(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2e2b38bf_2f43_4182_82de_b9a5979e02b2(ArrayList<Integer> A, int x) {
        if (A == null || A.size() < 1) {
            return -1;
        }
        int firstIndex = 0;
        for (int i : A) {
            if (i == x) {
                break;
            }
            firstIndex += 1;
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_0_79eb8caa_168d_4ee4_aa50_79daeb19f047(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f77b2a6a_4e64_4898_ae28_3121e5199de1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_5c6ca631_9a68_4f17_b556_eab1fb8f7008(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7e6fde82_54e3_4375_9f50_72f5ea5188ae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_14d2fa57_b3c3_4563_b266_68c6d392595e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_004f3a1f_1e21_473d_b50c_fb7f9212a92e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_93504de0_00f2_4da5_9fbd_9afbdf23feb9(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) < x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_33cfadb1_fe3f_4c92_bf0f_fcd800b5ff9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            int midValue = A.get(mid);
            if(midValue==x){
                return mid;
            }
            else if(midValue>x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9be93537_ae4c_4bdb_b9d3_42765209d38d(ArrayList<Integer> A, int x) {
        // Returns the index of the first occurrence of x in array A, or -1 if x is not in A.
        // Binary search.
        int low = 0;
        int high = A.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7eb8a1f1_242c_4905_b43b_29a15f327280(ArrayList<Integer> A, int x) {
        boolean flag = False;
        int count = 0;
        for (int y : A) {
            if (flag == False) {
                if (y == x) {
                    flag = True;
                } else {
                    count++;
                }
            }
        }
        int result = count - 1;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e42e0543_4a04_420d_9622_bcf801cf6fb2(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index < 0) {
            index = -index - 1;
        }
        if (index < 0 || index >= A.size() - 1) {
            return -1;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_2608d407_1a40_41ac_9b8a_2ef81f8a8567(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e74bae4c_0994_44fd_98bf_39154670877e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f47aee72_d81d_41e5_9883_36d3d415ea8f(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_d86403cd_34e4_49c1_aaaa_ced6edad5fae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5eb271ef_07a3_422d_b250_be314f8d8552(ArrayList<Integer> A, int x) {
        int n = A.size();
        int firstOccurence = 0;
        int lastOccurence = n - 1;
        int currentOccurence = -1;
        int i = 0;
        boolean found = False;
        while (i <= lastOccurence && !found) {
            currentOccurence = A.get(i);
            if (currentOccurence == x) {
                found = True;
                firstOccurence = i;
                break;
            }
            if (currentOccurence > x) {
                lastOccurence = i;
            } else {
                i++;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_1_e42e0543_4a04_420d_9622_bcf801cf6fb2(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index < 0) {
            index = -index - 1;
        }
        if (index < 0 || index >= A.size() - 1) {
            return -1;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_3b130185_45d6_4cdb_b555_a19bb4e4162e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_341ff466_d0ba_4142_8048_cae67e12d434(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e27711e3_ce3c_424b_b8cb_9ec3864bddcf(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_fcfe0626_49d6_4081_bf33_9e53201b74cd(ArrayList<Integer> A, int x) {
        int index = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > x) {
                break;
            }
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_b4bd33a7_2d5c_4344_883b_7f218e5a2b24(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f2cae02c_3bc3_43d6_8be2_49aad9a568f0(ArrayList<Integer> A, int x) {
        return A.stream().filter((n) -> n.intValue() == x).findFirst().get();
    }

    
    public static int findFirstOccurrence_Problem_1_d7c8c1c8_5954_4994_ac78_1ab8a1154c41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c141c3e3_638e_43d5_af41_c5f7f3876036(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if(index < 0)
            return -1;
        else if(index == 0)
            return 0;
        else
            return index-1;
    }

    
    public static int findFirstOccurrence_Problem_0_0f7813f5_67cd_4f3f_ac1b_e4f9e9939445(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_0_497225b8_4421_40dd_8184_597e51979794(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7b263c9f_7603_41f8_a5f7_2d46b834ea61(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e70176d3_5d0d_4419_b69f_7d86024d7783(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_847fe911_e616_4a05_9eab_009cc6d9f2f5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_cf2226d2_d904_443f_b1c1_9b54b3588216(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ce3dd082_c780_45d4_88c6_e21a845db377(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_bb8014c9_bcbc_437a_89e7_130d3bfbcfc4(ArrayList<Integer> A, int x) {
        return IntStream.range(0, A.size()).filter(i -> A.get(i) == x).findFirst().orElse(-1);
    }

    
    public static int findFirstOccurrence_Problem_1_79eb8caa_168d_4ee4_aa50_79daeb19f047(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8232608d_ca97_4f95_814d_dcde26e1466b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d074fcd2_99a7_4e2f_9fe6_6cfd8eea5ca8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_c61e904f_6928_434e_abab_e6c8e9a4b57b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_c761b763_d4cb_46f3_b5bc_3278c821e6b6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8025ff9a_4629_4a11_aa31_850d76471587(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x)
                index = i;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_6823514f_e736_48d4_b5b9_d4bfa84082fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_1_2817a559_598d_4feb_a2c6_397b9489f757(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7e9b399f_cf9e_41d3_965b_78e3e3c2e78e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;

        while (low < high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_913ed3d4_9c73_41f8_8092_6304ce452ba5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5aece756_745f_4312_a4e5_ce40a49ddfe0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_ea335a0c_d0ee_4831_8812_f129ddcada84(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1df97f4e_47dd_4381_8b96_28edb6aa67d0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_a9b743c4_37ff_481f_9a09_6d6db68cef70(ArrayList<Integer> A, int x) {
        // Your code goes here
        int low = 0;
        int high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_198243f2_e6e3_435c_a3d4_730d6277ae27(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b74c0150_a335_462f_a6f7_e69d72b33140(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0408f920_d866_4efa_959d_9d9d0a32db8c(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_673140dd_9a35_44a8_af23_cf9521002d23(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_54111574_ba7a_4edb_86bd_1cc0be425e9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_818a9e3a_ab16_4b2b_b98d_622d83641d92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e167d92a_5dfd_4065_adce_18f1ac8a7d23(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7a01014d_3fe9_42f0_bb81_57a4fcf04073(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0) {
                    return mid;
                }
                if (A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e167d92a_5dfd_4065_adce_18f1ac8a7d23(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_273e7006_5255_4cf1_b045_aa9b4c7ec564(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b9adc9e4_cc4f_4cab_a102_30c94f8f0978(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_182ebb91_dbea_4e0f_8e1c_3432abfcd346(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_38c30b20_aca6_4fa0_943f_10aee02e2e26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_2104f1ee_137b_4ea0_b2bd_5bc8d04d0481(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            else if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_14adde95_3c9d_418b_a23a_d4a7da735663(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            }
            else if (x < A.get(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_48478595_ad56_4f24_b0a3_c9ad9925b8b2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a87ca98c_08c0_4a16_ae03_8bd9ed434179(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_655128c4_4c27_458a_9949_d6db2801f862(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5b1a69d8_e254_43f0_8a97_473757c5c07d(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_37c83b8c_17d9_4736_a992_eec3ce904e3d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5204d031_626c_4e61_8eaa_7cee88ef9b63(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_763705b8_220c_4c7b_8e05_1ba1669de1da(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7b8a7074_054c_48cb_af2a_c4460fc873dd(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_8dfc532d_d318_495f_9733_bd1de930aefd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3beb8f93_bf03_4254_9644_5bc5b6bde209(ArrayList<Integer> A, int x) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_780553cb_8e1f_426b_b955_9221a4fabefb(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_e42e0543_4a04_420d_9622_bcf801cf6fb2(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index < 0) {
            index = -index - 1;
        }
        if (index < 0 || index >= A.size() - 1) {
            return -1;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_e6833606_f06f_49f9_a761_cf15e92c301d(ArrayList<Integer> A, int x) {
        // TODO Auto-generated method stub
        int low = 0;
        int high = A.size()-1;
        while(high>=low){
            int mid = low+((high-low)/2);
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)<x){
                high=mid-1;
            }
            else if(A.get(mid)>x){
                low=mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8f075f16_15b4_47c4_b272_06a22683079f(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i : A) {
            if (i == x) {
                indexOfFirstOccurrence = i;
                break;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_0_27540340_4e3c_45af_807b_098759ebb566(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (A.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int findFirstOccurrence_Problem_1_459e12c0_ec89_4275_bb61_a1c72d678558(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ce9b87ec_1979_4cec_8c25_fb910ef680b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f889ff3e_3c5a_4f63_8b40_fb7595f058c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_dbef191b_b50c_472d_ba74_34ce09ec9a5b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_0408f920_d866_4efa_959d_9d9d0a32db8c(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_96ad941e_de5a_4e69_9168_17cbb9562b0f(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_68b09b80_8d35_4ff4_85ec_d72843ed4403(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_772fc63b_918c_4abd_84dc_a3a72a927ed5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e8828902_bb34_4a22_a23b_06646078ed17(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_0a674801_7682_4fe4_b571_45dc063c98b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_eb50211b_5bc1_4657_9c67_e036fead04af(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_875c784e_7a29_4ed3_9cac_b9b95a6a7243(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        int result = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_73ec0741_fa02_4085_a2cc_3a24b6027f91(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6d9931ac_4503_4d75_9b04_5ffe4ee465e3(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index >= 0) {
            return index;
        }
        return -index - 1;
    }

    
    public static int findFirstOccurrence_Problem_1_457e30ae_0bf9_437a_ae7d_2ae543dc0e4f(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f3c5220c_3411_4119_9584_284b5eb8b799(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_27037c1e_e648_432b_bda4_e0feb2d66939(ArrayList<Integer> A, int x) {
        int l = A.indexOf(x);
        return l;
    }

    
    public static int findFirstOccurrence_Problem_0_80cfd262_7747_440a_8a0e_ee475fbf0348(ArrayList<Integer> A, int x) {
        int size = A.size();
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_d90a1285_41f5_40ed_bb1e_4cad01119865(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_dcad16de_d00d_4791_96fc_df5bf0391576(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b11069cb_e401_411d_9636_34fd1c30972a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_34286c14_50d2_4e75_9493_66938b2ada9e(ArrayList<Integer> A, int x) {
        // write your code
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b13d3c31_3e53_413b_8690_620304826d65(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_251360f1_031e_41db_ad48_b6d201cca377(ArrayList<Integer> A, int x) {
        // Write your code here
        int index = -1;
        
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_97ef5f14_f5f1_403a_8937_97b2d2ff7c5e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a134ede9_c272_4f9b_b0b2_35b5ce907b45(ArrayList<Integer> A, int x) {
        if (A == null || A.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < A.get(mid)) {
                high = mid - 1;
            } else if (x > A.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e99b1833_cb7b_48d5_8b65_f7822f2f2340(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_cf4b15ff_a15d_4d3b_963c_1fab896eb5d2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e7094ccd_6c20_486f_9b4f_b0a4aeaeac04(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2108423b_8b3d_436e_b7e6_3d4b56c0cd97(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2d16585c_b5b5_4a36_b625_f34d9f9f10b8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3c4f007f_c134_46e8_b374_0a4ffb902fbc(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return A.get(lo) == x ? lo : -1;
    }

    
    public static int findFirstOccurrence_Problem_2_65f0823c_d9e1_4a3d_ab52_b59a64cc75c2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b49dce93_bd16_4659_8342_b707cc5774cc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5efadfcf_e8f1_46d4_bcf7_41f7f369e4a3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5b1a69d8_e254_43f0_8a97_473757c5c07d(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5acaf94a_24ca_4bd2_8774_ce3e5d18683b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_bb8014c9_bcbc_437a_89e7_130d3bfbcfc4(ArrayList<Integer> A, int x) {
        return IntStream.range(0, A.size()).filter(i -> A.get(i) == x).findFirst().orElse(-1);
    }

    
    public static int findFirstOccurrence_Problem_2_d90a1285_41f5_40ed_bb1e_4cad01119865(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_763705b8_220c_4c7b_8e05_1ba1669de1da(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_875c784e_7a29_4ed3_9cac_b9b95a6a7243(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        int result = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_778be081_fd77_4ca7_b872_b0bbd004005f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8e2d7300_a20b_4564_a088_171eb101d2ff(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_21666810_e0fd_438f_bbb7_29f419aa26dc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_1_65f0823c_d9e1_4a3d_ab52_b59a64cc75c2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1eb0ec70_d07b_413c_8b19_0e02fc442492(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_bf2b3437_5566_4118_ac93_a0770ddb1270(ArrayList<Integer> A, int x) {
        for (int a : A) {
            if (a == x) {
                return A.indexOf(a);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_6d9931ac_4503_4d75_9b04_5ffe4ee465e3(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if (index >= 0) {
            return index;
        }
        return -index - 1;
    }

    
    public static int findFirstOccurrence_Problem_2_28992aee_b7c0_4989_be8d_bdb007a3e0fb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_f3c5220c_3411_4119_9584_284b5eb8b799(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ae6f8984_6580_44d7_ac1d_62010dbc42ff(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get( mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get( left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5204d031_626c_4e61_8eaa_7cee88ef9b63(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5b932afc_9ecc_4624_85e1_507b11933a9a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_af85e61a_483a_4bb1_a753_cad13a952a55(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_20064dcd_2e3f_4bb8_968b_fcf698dfc814(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0)
                    return mid;
                if (A.get( mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_762f8436_cef6_48af_9d2b_82fb58fcec8c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_76cac237_27a3_4953_a87e_fc44750373e0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7c2c4c16_adfd_410d_ae66_f3a7f568194f(ArrayList<Integer> A, int x) {
        int first = 1;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                count++;
            }
            if (A.get(i) < x) {
                if (count == 1) {
                    first = i;
                }
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_0_a8bdbc1a_815f_483c_b9f8_4e64a888c61d(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_805c7c03_9763_4c15_833f_1a1e68e58c9c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_60d7cdcf_1f2d_4809_b422_1d4bfc2730f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_4b211cac_bd28_47c0_bca8_6c04e0aed6e5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1df97f4e_47dd_4381_8b96_28edb6aa67d0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_cc9f5860_9559_4ee9_b2b9_c2bfb2c0df1c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8025ff9a_4629_4a11_aa31_850d76471587(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x)
                index = i;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_6a268f0f_9e2a_47d5_b9a5_cf0b6e83b11e(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                result = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e1c641c1_fa60_4b94_b914_c914de12a960(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_72523e9e_8f18_40ce_be5b_a9b113e81526(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_cf2226d2_d904_443f_b1c1_9b54b3588216(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1b1123ea_35f7_4b3a_bcaf_d6ef79256332(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_26c45cf5_84ca_4cf3_9261_d2ccb6112612(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9d52cad2_e233_48fc_a70e_aed623eb3210(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3c64e59d_5a52_48d3_8387_ef26325cb248(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_28a6fd62_dcf4_4095_8e81_cb2db5249a0f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_eae5d8fa_de55_4636_971e_7a7b3cbb03b2(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_04906336_f1a8_405d_bca7_3ecddf467ecd(ArrayList<Integer> A, int x) {
        int firstIndex = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_1_7dc34c7b_71d2_4246_9ea3_16792aef9cff(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b0af17cb_832d_4c99_abb5_de8726b07546(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_99789992_5e25_4dbe_9abc_6af430bf577e(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if(A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_6cd7d705_8b7d_4e0a_9d92_2ee86a58c2eb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e7094ccd_6c20_486f_9b4f_b0a4aeaeac04(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f08ce104_6fed_48cf_8006_7dd82e71c2f7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_27540340_4e3c_45af_807b_098759ebb566(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (A.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int findFirstOccurrence_Problem_0_b1d63838_4ed0_4cc1_99f1_536df3d23ae7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b28f08c7_60db_44c7_9011_4304734c6b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_6f607376_1944_435a_a788_e90c1b62f0a0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_225f19d3_3ba1_437a_86a8_67e0341b50d1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            Integer midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1dcbba9d_2b36_4548_a96b_f39795aa9350(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_fcfe0626_49d6_4081_bf33_9e53201b74cd(ArrayList<Integer> A, int x) {
        int index = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > x) {
                break;
            }
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_a8bdbc1a_815f_483c_b9f8_4e64a888c61d(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e1c641c1_fa60_4b94_b914_c914de12a960(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_9e276638_48b8_4c49_99d0_30837ce81747(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_bb8014c9_bcbc_437a_89e7_130d3bfbcfc4(ArrayList<Integer> A, int x) {
        return IntStream.range(0, A.size()).filter(i -> A.get(i) == x).findFirst().orElse(-1);
    }

    
    public static int findFirstOccurrence_Problem_1_a5e11b92_777f_46cd_8057_a8d8baa623ae(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3b4c67c4_1fd3_47af_88f8_2eea69231df9(ArrayList<Integer> A, int x) {
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                lastIndex = i;
                break;
            }
            if (A.get(i) < x) {
                lastIndex = i;
            } else {
                firstIndex = i;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_0_531074c7_33a1_480d_9ec0_19e7cd435143(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_4e02ec8d_2c03_4b90_b6ea_b6178efca794(ArrayList<Integer> A, int x) {
        int foundIndex = -1;
        for (int i = 0; i < A.size(); i++)
            if (A.get(i) == x) {
                foundIndex = i;
                break;
            }
        return foundIndex;
    }

    
    public static int findFirstOccurrence_Problem_2_77bf9cd5_5a58_42cf_ad7b_6c1048b69885(ArrayList<Integer> A, int x) {
        int index = -1;
        int j;
        for (j=0; j<A.size(); j++){
            if(A.get(j)==x){
                index=j;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_3fccbcf4_3fc0_4f00_a28a_e5454e3d085b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_21666810_e0fd_438f_bbb7_29f419aa26dc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_1_3f3d8001_dda0_4ca3_bbfe_0e59d41f563b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d8530e44_9374_4eb4_ae4b_11ae777ff88d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_869a754b_f33a_4277_8599_533c4e872f94(ArrayList<Integer> A, int x) {
        int low=0;
        int high=A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9e49c1e3_06e5_4024_82ea_ed630aa668e5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_97c886ee_faac_4bea_a374_f01d77f7c334(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3a5c3bae_186a_45d5_9ed4_37e6f339ee3e(ArrayList<Integer> A, int x) {
        int first = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                first = i;
                break;
            } else if (A.get(i) == x) {
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_2_8e9c45da_6235_4055_88e5_144d348c3e30(ArrayList<Integer> A, int x) {
        boolean first = True;
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                first = False;
                index = i;
            }
            if (first)
                break;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_30f15bf4_aebf_401a_a866_e55c1d2971df(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_0cc4e201_16e7_4e86_a8de_5acfe6a2fd4d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_459e12c0_ec89_4275_bb61_a1c72d678558(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1df0777a_5d5c_4696_83fb_bbf59fac1bcc(ArrayList<Integer> A, int x) {
        for (int num : A) {
            if (num == x) {
                return A.indexOf(x);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_31a45a9c_883f_4a43_8dc0_b46b22879cc3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_cf2226d2_d904_443f_b1c1_9b54b3588216(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_20064dcd_2e3f_4bb8_968b_fcf698dfc814(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0)
                    return mid;
                if (A.get( mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_655128c4_4c27_458a_9949_d6db2801f862(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2e2b38bf_2f43_4182_82de_b9a5979e02b2(ArrayList<Integer> A, int x) {
        if (A == null || A.size() < 1) {
            return -1;
        }
        int firstIndex = 0;
        for (int i : A) {
            if (i == x) {
                break;
            }
            firstIndex += 1;
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_2_341ff466_d0ba_4142_8048_cae67e12d434(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_20a4ad86_8a3a_4ca9_acbd_14e16b778930(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_961eb8f5_8816_4bb6_9c4c_71d006bb9587(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_189f9203_1f17_4f83_9ba9_88abf2c0d594(ArrayList<Integer> A, int x) {
        // Your code here
        int start = 0;
        int end = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (A.get( mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get( mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_58e9479a_3dfa_42de_9c08_9e19b34d4e7a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1eb0ec70_d07b_413c_8b19_0e02fc442492(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_572826d7_3a93_4920_90fe_6dbc80e4c0fd(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_65000b25_2e2e_4644_83f3_9dc1266fbda9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_12f03182_9430_481a_9577_1776d57f2c6a(ArrayList<Integer> A, int x) {
        // Runtime: O(log n)
        // Space: O(1)
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_b49dce93_bd16_4659_8342_b707cc5774cc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f72ddab5_82f0_419c_9814_b9931dd12e50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_879a0b2e_668b_4575_a736_5e8bac42e4ba(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_585bee2d_7ddd_4dca_ae51_a3fa707286c1(ArrayList<Integer> A, int x) {
        int left = 0, right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get(left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6f607376_1944_435a_a788_e90c1b62f0a0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_de5bf634_f1a4_46ab_899a_9b687ffd0a96(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_74f5698f_361a_4f2c_b0db_2ce67af45402(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_24965591_ea6d_48f3_9375_85e6e7006e09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_570d1ba1_3b5c_439f_87c1_f5f9dbc6bb26(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence > x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
            else if(currentOccurrence < x) {
                index = i;
                lastOccurrence = currentOccurrence;
            }
        }
        if(lastOccurrence == -1) {
            return -1;
        }
        else {
            return index;
        }
    }

    
    public static int findFirstOccurrence_Problem_0_273e7006_5255_4cf1_b045_aa9b4c7ec564(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_426ca3ae_e31a_4d35_b467_9138257e6693(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9303830c_c5b3_4e6f_81b0_cae89324167c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ff427168_6bde_4dc8_ba9a_c9be6d885b6e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_65e397bf_8307_42ce_b555_ff7460c39d25(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) > x) {
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_487d25ce_ac3a_4ea1_9217_c8d5c3efc01a(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if(A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_80cfd262_7747_440a_8a0e_ee475fbf0348(ArrayList<Integer> A, int x) {
        int size = A.size();
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_86199f3f_673c_461c_8f63_2d10435c47d4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_fd7cff7c_4edd_45fd_b177_2f9eed9bf33d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_925cfc65_c00a_41cb_bf41_bdbeb3864709(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_dcad16de_d00d_4791_96fc_df5bf0391576(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_12cb62d1_7196_41bd_a6ae_0e97ce94653c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f889ff3e_3c5a_4f63_8b40_fb7595f058c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_26c45cf5_84ca_4cf3_9261_d2ccb6112612(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_32eabe5d_b166_4f36_9be2_fb2c5147e47b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d074fcd2_99a7_4e2f_9fe6_6cfd8eea5ca8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6a625ffa_a777_4924_bfc8_5d81c4bd2563(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e64422d4_3782_469f_8aa1_3fdc60792e60(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_94ad84ba_f257_4fd2_b9a0_3cc1b09f9c1f(ArrayList<Integer> A, int x) {
        // Use binary search to find the first occurence of the number in the list
        int low = 0;
        int high = A.size()-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            int midVal = A.get(mid);
            if (midVal == x)
                return mid;
            if (midVal < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f2f09d6f_a5ec_4414_b5ea_ca2b78b5f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b547198e_6dae_4aeb_8a7a_3e46bd86694e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1df0777a_5d5c_4696_83fb_bbf59fac1bcc(ArrayList<Integer> A, int x) {
        for (int num : A) {
            if (num == x) {
                return A.indexOf(x);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_345da0b3_0f34_47eb_88bc_e6eb13dd29c3(ArrayList<Integer> A, int x) {
        int res = -1;
        for(int i=0; i<A.size(); i++) {
            if (A.get(i) == x) {
                res = i;
                break;
            }
        }
        return res;
    }

    
    public static int findFirstOccurrence_Problem_1_f6f9d5e1_e2b5_462f_a1ed_813427b011cd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_a87ca98c_08c0_4a16_ae03_8bd9ed434179(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8bb64f1f_a637_457e_b01e_fb28d904f127(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0c20ac4e_a78b_42b8_b60d_2bb1cf5291c7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_20a4ad86_8a3a_4ca9_acbd_14e16b778930(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_b314d390_f600_4c9c_bb98_32a2bcc3e565(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7dc34c7b_71d2_4246_9ea3_16792aef9cff(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_4b19012a_4220_4459_bc62_f95d41db9952(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7ae70577_cf9e_4f40_a55d_f49d200ad842(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_eff0d365_6772_493d_9d62_bf372027f439(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_da833948_6f9b_4b92_a31d_e45df21143ee(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get( m) >= x) {
                result = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d39c3723_9cb6_4fa4_a622_a459e4ab5b91(ArrayList<Integer> A, int x) {
        
        int result = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5ddc43ed_6538_42b7_a2a0_61eac0aba5d7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_24965591_ea6d_48f3_9375_85e6e7006e09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_739fdd5a_edf8_4da8_8021_2ff493091c61(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_f818fd59_d9be_4619_9603_bd4d1dba8f4b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e70176d3_5d0d_4419_b69f_7d86024d7783(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_559d2b12_7256_447c_abd7_99a8efe8929f(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_ae6f8984_6580_44d7_ac1d_62010dbc42ff(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get( mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get( left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b183fa73_252b_4544_85ae_c836800a41d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9d52cad2_e233_48fc_a70e_aed623eb3210(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_34286c14_50d2_4e75_9493_66938b2ada9e(ArrayList<Integer> A, int x) {
        // write your code
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_567df155_8022_429e_97c6_6c5d42988598(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e253870e_b537_4037_b647_cb49f689ef24(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8f970750_4f9a_4002_9354_0db75a3bde92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_42084409_d4e0_475c_af36_612651d67070(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if (lo < A.size() && A.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_317e19e4_fd70_483f_95ea_f98e8f2e864e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e74bae4c_0994_44fd_98bf_39154670877e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_cd6ae7f1_726f_49d0_837f_cdc6042ba0ac(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_464eb54f_3f13_4f6d_9fe7_f886bc1ff7ea(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_28f824bd_96f8_4da7_a389_ac50607e40b5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5b932afc_9ecc_4624_85e1_507b11933a9a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5e73b0bd_ceb5_47be_bc01_a952e462d0ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7709d15e_44e6_44df_aadf_cf3168c4d118(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid-1) != x) {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(A.get(mid) > x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_805c7c03_9763_4c15_833f_1a1e68e58c9c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f7d03024_1326_47dd_936a_5840d557d701(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ea119ebc_805a_4516_82b1_ff0eb9815193(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_31a45a9c_883f_4a43_8dc0_b46b22879cc3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1390867a_d51d_44c1_8167_b424f988f0be(ArrayList<Integer> A, int x) {
        int index = Arrays.asList(A).indexOf(x);
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_98d3487e_43c1_4c59_865d_1a8047bfdc79(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (A.get(mid) < x)
                low = mid + 1;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_de5bf634_f1a4_46ab_899a_9b687ffd0a96(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f55768a9_403b_49b9_999c_5492645b1907(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_cbfa69bc_b426_40d5_be03_760480c8fffd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a68ea5d0_c318_40b2_b1be_fc550c560c69(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        int last = A.get(i);
        for (; i < A.size(); i++) {
            int curr = A.get(i);
            if (curr < x) {
                index = i;
                last = curr;
            }
            if (curr > x) {
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_42084409_d4e0_475c_af36_612651d67070(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if (lo < A.size() && A.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_c11b3331_1c5a_4ba2_b030_ea33f7e77ed6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (A.get(l) == x)
            return l;
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_78429e4f_575a_4365_8196_a9a22855e939(ArrayList<Integer> A, int x) {
        int firstOccur = -1;
        int j = 0;
        // for (int i=0; i<A.size(); i++) {
        for (; j<A.size(); j++)
            if (A.get(j) == x)
                break;
        if (firstOccur==-1)
            firstOccur = j;
        return firstOccur;
    }
    public static void main(String[] args) {
    assert(findFirstOccurrence_Problem_2_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 5, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (1));
    assert(findFirstOccurrence_Problem_2_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 3, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (2));
    assert(findFirstOccurrence_Problem_2_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 4, 1, 5, 6, 6, 8, 9, 9, 9))), (6)) == (4));
    }

}

    
    public static int findFirstOccurrence_Problem_1_925cfc65_c00a_41cb_bf41_bdbeb3864709(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_083a47b5_78de_4868_97db_9b9c057bbfe1(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3a16b9c3_8a33_40f2_9cce_5eb03ba87643(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b28f08c7_60db_44c7_9011_4304734c6b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5b932afc_9ecc_4624_85e1_507b11933a9a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ceed78e6_522f_4313_a8f7_69dcb119c10c(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b0a03263_3370_4424_9da7_34ab882b5f84(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x)
                    return m;
                else
                    r = m - 1;
            } else if (A.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_16742416_58ca_47d0_887e_5245ed09e5e1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_12bf0544_cf81_4665_a2c2_81aba6006369(ArrayList<Integer> A, int x) {
        // Write your code here
        int firstOccurence = 0, lastOccurence = 0;
        int size = A.size();
        for(int i = 0; i<size; i++){
            if(A.get(i) == x){
                lastOccurence = i;
            }
            if(A.get(i) < x){
                firstOccurence = i;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_0_c9f2af3d_e3bd_42fd_b2ea_4b5e621cc708(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                lastOccurrence = currentOccurrence;
                firstOccurrence = i;
            }
            if(currentOccurrence > x) {
                break;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_1_fa303480_ebe7_44f3_aa4e_402e06d4fe43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3beb8f93_bf03_4254_9644_5bc5b6bde209(ArrayList<Integer> A, int x) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_eaddd582_21b3_468d_aa19_e06a01c7ae28(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9303830c_c5b3_4e6f_81b0_cae89324167c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5eb271ef_07a3_422d_b250_be314f8d8552(ArrayList<Integer> A, int x) {
        int n = A.size();
        int firstOccurence = 0;
        int lastOccurence = n - 1;
        int currentOccurence = -1;
        int i = 0;
        boolean found = False;
        while (i <= lastOccurence && !found) {
            currentOccurence = A.get(i);
            if (currentOccurence == x) {
                found = True;
                firstOccurence = i;
                break;
            }
            if (currentOccurence > x) {
                lastOccurence = i;
            } else {
                i++;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_0_e74bae4c_0994_44fd_98bf_39154670877e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e9e67b2f_26e0_4eac_8d0c_affb09ad01c9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_772fc63b_918c_4abd_84dc_a3a72a927ed5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5c3981ff_86ac_4a54_93a2_9433d0ff6443(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3ce275f9_401e_4e93_97a1_fe61568c0912(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_6a268f0f_9e2a_47d5_b9a5_cf0b6e83b11e(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                result = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ec9dc551_3889_4fdc_9577_dae5f83b1c19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b8fff524_b0b7_4849_a3f1_ec78ba428113(ArrayList<Integer> A, int x) {
        int start = 0; //Start from first index
        int end = A.size()-1; //End at last index
        while(start < end) {
            int mid = (start+end)/2;
            if(A.get(mid) == x) return mid;
            if(A.get(mid) < x) end = mid - 1; else start = mid + 1;
        }
        return -1L; //Return value of -1 if x not found.
    }

    
    public static int findFirstOccurrence_Problem_2_1eb0ec70_d07b_413c_8b19_0e02fc442492(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_879a0b2e_668b_4575_a736_5e8bac42e4ba(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_c331ed52_a53c_4eb4_8aa5_60ddc36c8feb(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if(index >= 0) {
            return index;
        }
        else {
            int smallest = A.get(0);
            int i = 0;
            while(A.size() > 0 && A.get(i) <= smallest) {
                i++;
            }
            index = i;
            return A.indexOf(smallest);
        }
    }

    
    public static int findFirstOccurrence_Problem_1_2779bbaf_7cd4_4929_b768_7641c3787f87(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a4468dc8_50e2_469d_87bc_22aae246e2e4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e15b2ddc_81bc_4192_a5c0_4bb3430cb498(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f1464485_7943_4b82_b1ef_326d6713f074(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8bb64f1f_a637_457e_b01e_fb28d904f127(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7eb8a1f1_242c_4905_b43b_29a15f327280(ArrayList<Integer> A, int x) {
        boolean flag = False;
        int count = 0;
        for (int y : A) {
            if (flag == False) {
                if (y == x) {
                    flag = True;
                } else {
                    count++;
                }
            }
        }
        int result = count - 1;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ceac88f1_23d6_472b_b622_073bfca534a5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f7d03024_1326_47dd_936a_5840d557d701(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_87cda437_6b99_4a12_a24d_7d68b65cb139(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e60edba1_05d8_4a73_8e04_c1328c19d713(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_11507c5d_72d9_42a5_859d_f8fd87f01803(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7a7797c3_e6d1_4bc4_b2d1_e77f631b5916(ArrayList<Integer> A, int x) {
        int index;
        for(index = 0; index < A.size(); index++) {
            if(A.get(index) == x) {
                return index;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_818a9e3a_ab16_4b2b_b98d_622d83641d92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_6222fd01_178b_43d5_ac71_340ac4e42f1e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_31c51b04_9b4f_48e8_b77d_7678ad4955f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d626e359_0cd4_49f7_a365_80cbe2aba923(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_9fef1fcb_60be_4651_ae1b_b8a9ca83502e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f865c6e3_acf0_4e27_8f6c_a841eb23e049(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f6f9d5e1_e2b5_462f_a1ed_813427b011cd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_6e910605_4609_4d73_b222_9dc2bc0a398e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_14adde95_3c9d_418b_a23a_d4a7da735663(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            }
            else if (x < A.get(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_fd7cff7c_4edd_45fd_b177_2f9eed9bf33d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_310c2ff1_fd68_4c0f_82a8_63e724c455e8(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int currentOccurrence = 0;
        int lastOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                firstOccurrence = i;
                break;
            }
            if(currentOccurrence < x) {
                lastOccurrence = i;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_2_ce0f72e8_ff06_48e5_902e_983075735c5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_da2ac4e8_2709_4e17_9787_638776be7d1c(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_1_a68ea5d0_c318_40b2_b1be_fc550c560c69(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        int last = A.get(i);
        for (; i < A.size(); i++) {
            int curr = A.get(i);
            if (curr < x) {
                index = i;
                last = curr;
            }
            if (curr > x) {
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_16ecc39d_55ee_4a42_8b33_4920e1ddb4e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1a161f7a_c3b9_452d_83e1_0391877cfdb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_0cc4e201_16e7_4e86_a8de_5acfe6a2fd4d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2819ca5b_a100_40c7_a8b7_51b5ab5357eb(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size()-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(A.get(mid) == x){
                result = mid;
                high = mid-1;
            }
            else if(A.get(mid) > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_4b19012a_4220_4459_bc62_f95d41db9952(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_c5e76721_2212_4d99_a906_139f53dbc10b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_77bf9cd5_5a58_42cf_ad7b_6c1048b69885(ArrayList<Integer> A, int x) {
        int index = -1;
        int j;
        for (j=0; j<A.size(); j++){
            if(A.get(j)==x){
                index=j;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_d7aa9e17_4326_4931_b516_8ebe0ef30ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_887ce1fa_ed95_4431_ac6a_59577322c9f3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d90a1285_41f5_40ed_bb1e_4cad01119865(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_94ad84ba_f257_4fd2_b9a0_3cc1b09f9c1f(ArrayList<Integer> A, int x) {
        // Use binary search to find the first occurence of the number in the list
        int low = 0;
        int high = A.size()-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            int midVal = A.get(mid);
            if (midVal == x)
                return mid;
            if (midVal < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_22aa398f_1632_4e16_a12c_c1fa2be3a085(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_4b211cac_bd28_47c0_bca8_6c04e0aed6e5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_cfe0d0cb_9425_42f3_b901_9936725707cb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5b1a69d8_e254_43f0_8a97_473757c5c07d(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e1c641c1_fa60_4b94_b914_c914de12a960(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_53345b58_ab13_4e3a_b0bc_c2d683e57991(ArrayList<Integer> A, int x) {
        return A.indexOf(A.get( Math.floorDiv(A.size() - 1, x)));
    }

    
    public static int findFirstOccurrence_Problem_0_60d7cdcf_1f2d_4809_b422_1d4bfc2730f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_54111574_ba7a_4edb_86bd_1cc0be425e9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f1463a92_bfee_46bb_a8e6_47223960e407(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7709d15e_44e6_44df_aadf_cf3168c4d118(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid-1) != x) {
                    return mid;
                }
                else {
                    high = mid-1;
                }
            }
            else if(A.get(mid) > x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ab41fa17_d067_424d_91b6_8da4de7859d4(ArrayList<Integer> A, int x) {
        int index = 0;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) <= x) {
            index++;
            i--;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_c31ae65b_30d6_4101_8663_fbd3fbab7cc3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ec9dc551_3889_4fdc_9577_dae5f83b1c19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_83e385de_ace3_4370_af0b_36c602288071(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d5168e27_01a8_4b8f_9404_fb94028e6711(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                indexOfFirstOccurrence = i;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_1_564c4c0a_0ea9_49b6_a392_6282c0775935(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_559d2b12_7256_447c_abd7_99a8efe8929f(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_9afc5e32_0dfa_4bcd_8c44_61b3b8b035fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9210636c_05e9_4918_8239_b4a083090449(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b1b2c98a_da44_43ae_9d49_c59e8a23fb2b(ArrayList<Integer> A, int x) {
        
        // Your code here
        int i=0,j=0;
        while(i<A.size() && j<A.size()){
            if(A.get(i)<=x)
                i++;
            else
            {
                if(A.get(j)<x)
                    return i;
                else
                    return j;
            }
        }
        return -1;
        
    }

    
    public static int findFirstOccurrence_Problem_2_17ec0f9c_d2b4_4fbb_af3b_7d3997da94a5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ce28de52_cba0_4231_a5f5_9e5c2b3c53a3(ArrayList<Integer> A, int x) {
        int firstOcc = -1;
        for(int i=0; i< A.size(); i++) {
            if(A.get(i) == x) {
                firstOcc = i;
                break;
            }
        }
        return firstOcc;
    }

    
    public static int findFirstOccurrence_Problem_1_2b1377c5_8c92_4066_841a_e6f4055914f0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e2dfc515_07dd_4b6a_a605_188fa66448b1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_2b60ff46_fe87_4c73_a7fc_2eb09e157e76(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_79df92ef_5bfe_4159_aecd_728e909e11dd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7da1d56a_6169_4416_9bb9_c14b8eb0c276(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size() ; i++) {
            if(A.get(i) == x) { index = i; }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_30f15bf4_aebf_401a_a866_e55c1d2971df(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_ae6f8984_6580_44d7_ac1d_62010dbc42ff(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get( mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get( left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_05ce8b2f_edf4_48c6_b13e_2cc8c0a055c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7a7eb96e_4b83_4200_9d38_f0b746eeea19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3d2b9259_c751_4bac_ad2f_bb31982e197f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_94140c80_19fb_4863_8d01_31373b3c90e6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_dcad16de_d00d_4791_96fc_df5bf0391576(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_24ad9e48_1e88_4e17_986f_a9f910665535(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_572826d7_3a93_4920_90fe_6dbc80e4c0fd(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_2fe63b1d_009b_4ccf_ba25_7aad9c374788(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7b53a3b7_92b5_42ad_8155_c586d14a96ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_24965591_ea6d_48f3_9375_85e6e7006e09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_9b8951cc_f3db_4fe1_8db8_fa7d2dfee8b1(ArrayList<Integer> A, int x) {
        int n = A.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_cfe0d0cb_9425_42f3_b901_9936725707cb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_4032a219_2ef9_4c43_a5b7_9083b4f86e63(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_21e426f7_7cb4_440e_acb7_70b5d8bd7721(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_423058d8_24a8_4650_b423_8f9f363f490a(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_dca75944_5c44_44cb_a418_d8d38ef7c71c(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_ba85b088_96e2_4988_a3a5_1be95bdf8696(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ed442b1d_373c_4fdf_8ea1_7d279a24ff3e(ArrayList<Integer> A, int x) {
        // Return the position of the first occurrence of x in A
        if(A.isEmpty())
            return -1;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x)
                return i;
        }

        // If x is not present in array list, return -1
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_966a7ade_7088_47ce_83de_e84c09c8f68b(ArrayList<Integer> A, int x) {
        if(A == null)
            throw new IllegalArgumentException("Cannot find A");
        int i = 0;
        for(int j : A) {
            if(j == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_13fd4e38_48be_4886_b755_d1e94510ded1(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_fc8bc993_c57f_4d69_b026_d493941a5010(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_81b475c6_9096_48da_9ed5_ae2ba018e492(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_30f584ee_8aa9_4c27_86a6_7bc3317e7f77(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_341ff466_d0ba_4142_8048_cae67e12d434(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_65f0823c_d9e1_4a3d_ab52_b59a64cc75c2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a7f62cae_9250_4798_b044_6ebe1487574e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_f08ce104_6fed_48cf_8006_7dd82e71c2f7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2819ca5b_a100_40c7_a8b7_51b5ab5357eb(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size()-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(A.get(mid) == x){
                result = mid;
                high = mid-1;
            }
            else if(A.get(mid) > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_111c3c62_fc8b_4516_bb45_3c435815a1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b1d63838_4ed0_4cc1_99f1_536df3d23ae7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_c9f2af3d_e3bd_42fd_b2ea_4b5e621cc708(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                lastOccurrence = currentOccurrence;
                firstOccurrence = i;
            }
            if(currentOccurrence > x) {
                break;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_1_31a64c37_32b8_4881_9e1b_6199ca63468b(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1a0dfe48_44c4_49ad_b4f7_6a4ceae8b211(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_0fa3ef6b_f707_40f1_86bc_73de7e006ab0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_65000b25_2e2e_4644_83f3_9dc1266fbda9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_567df155_8022_429e_97c6_6c5d42988598(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9afc5e32_0dfa_4bcd_8c44_61b3b8b035fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_d626e359_0cd4_49f7_a365_80cbe2aba923(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e2678a26_86fa_4743_9bb3_4092ff061e29(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i : A) {
            if (i == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_567df155_8022_429e_97c6_6c5d42988598(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1d5c6062_fe1b_4c58_92af_c11226921708(ArrayList<Integer> A, int x) {
        for(int i=0; i<A.size(); i++){
            int y = A.get(i);
            if(y == x)
                return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3c4f007f_c134_46e8_b374_0a4ffb902fbc(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return A.get(lo) == x ? lo : -1;
    }

    
    public static int findFirstOccurrence_Problem_1_39074188_22ca_4bef_b132_7d77f652792d(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3b247087_fb3b_435a_8169_5cc0545df155(ArrayList<Integer> A, int x) {
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a68ea5d0_c318_40b2_b1be_fc550c560c69(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        int last = A.get(i);
        for (; i < A.size(); i++) {
            int curr = A.get(i);
            if (curr < x) {
                index = i;
                last = curr;
            }
            if (curr > x) {
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_f3cffbb5_0d30_4fe9_9749_36181b0cec12(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b4de3648_586b_455c_a272_565b6513aa5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f08ce104_6fed_48cf_8006_7dd82e71c2f7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5aece756_745f_4312_a4e5_ce40a49ddfe0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_51454a07_7301_40e6_a0ac_5074358df2e6(ArrayList<Integer> A, int x) {
        int pos = 0;
        int i = 0;
        int found;
        while (i != A.size() - 1) {
            found =  A.get(i++);
            if (x == found) {
                return pos;
            }
            if (x > found) {
                pos = 0;
            } else {
                pos++;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ba85b088_96e2_4988_a3a5_1be95bdf8696(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8470f3cc_755a_4e34_8a4b_dbb818235a7a(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_0_2873c4ed_32b4_4fe6_85f5_ed0b4bd90923(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_86199f3f_673c_461c_8f63_2d10435c47d4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_8f075f16_15b4_47c4_b272_06a22683079f(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i : A) {
            if (i == x) {
                indexOfFirstOccurrence = i;
                break;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_1_eb50211b_5bc1_4657_9c67_e036fead04af(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3c4f007f_c134_46e8_b374_0a4ffb902fbc(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return A.get(lo) == x ? lo : -1;
    }

    
    public static int findFirstOccurrence_Problem_1_dca75944_5c44_44cb_a418_d8d38ef7c71c(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_a050b3ff_38c4_402e_b66f_4f048e7988ad(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_98d3487e_43c1_4c59_865d_1a8047bfdc79(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (A.get(mid) < x)
                low = mid + 1;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3d9bb08c_a13c_4683_be5b_deb36ef50478(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_0f7813f5_67cd_4f3f_ac1b_e4f9e9939445(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_2_111c3c62_fc8b_4516_bb45_3c435815a1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ea335a0c_d0ee_4831_8812_f129ddcada84(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ae510d87_502d_4297_8679_57a10a9944ef(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_00989554_9bf5_4115_8010_0a81b03ed787(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_17ec0f9c_d2b4_4fbb_af3b_7d3997da94a5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9fef1fcb_60be_4651_ae1b_b8a9ca83502e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_c61e904f_6928_434e_abab_e6c8e9a4b57b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f942c6c1_24d7_4a7b_8f39_8c4b19034fd6(ArrayList<Integer> A, int x) {
        int size = A.size();
        int firstOccupancy = 0;
        for(int i = 0; i < (size-1); i++) {
            if(A.get(i) == x)
                firstOccupancy = i;
        }
        return firstOccupancy;
    }

    
    public static int findFirstOccurrence_Problem_2_2d2cf387_0af7_40b8_9a31_7dd0d69ca8b3(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_04906336_f1a8_405d_bca7_3ecddf467ecd(ArrayList<Integer> A, int x) {
        int firstIndex = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_1_16742416_58ca_47d0_887e_5245ed09e5e1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0c63e7b9_d7d5_4884_8046_63edc9e292be(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_86199f3f_673c_461c_8f63_2d10435c47d4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_cd6ae7f1_726f_49d0_837f_cdc6042ba0ac(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8ff0751d_9e38_485a_bde0_518b523d09ad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7b263c9f_7603_41f8_a5f7_2d46b834ea61(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_0b64df7b_e415_4441_a73b_268bae1ff1f8(ArrayList<Integer> A, int x) {
        int i = 0, n = A.size();
        while (i < n) {
            if (A.get(i) == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1390867a_d51d_44c1_8167_b424f988f0be(ArrayList<Integer> A, int x) {
        int index = Arrays.asList(A).indexOf(x);
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_7b1fbe1e_151d_4e93_8da7_912b696310bb(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ac44b60d_62fd_4109_b531_495148d78d15(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_031572c0_3b36_4834_9aa6_12dea483d272(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_9dd67970_6e7d_4c66_b949_e324484d8fd7(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index >= 0) {
            index = findFirstOccurrence_Problem_2_9dd67970_6e7d_4c66_b949_e324484d8fd7(A, x);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_b13d3c31_3e53_413b_8690_620304826d65(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8e9c45da_6235_4055_88e5_144d348c3e30(ArrayList<Integer> A, int x) {
        boolean first = True;
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                first = False;
                index = i;
            }
            if (first)
                break;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_b4bd33a7_2d5c_4344_883b_7f218e5a2b24(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5eb271ef_07a3_422d_b250_be314f8d8552(ArrayList<Integer> A, int x) {
        int n = A.size();
        int firstOccurence = 0;
        int lastOccurence = n - 1;
        int currentOccurence = -1;
        int i = 0;
        boolean found = False;
        while (i <= lastOccurence && !found) {
            currentOccurence = A.get(i);
            if (currentOccurence == x) {
                found = True;
                firstOccurence = i;
                break;
            }
            if (currentOccurence > x) {
                lastOccurence = i;
            } else {
                i++;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_2_310c2ff1_fd68_4c0f_82a8_63e724c455e8(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int currentOccurrence = 0;
        int lastOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                firstOccurrence = i;
                break;
            }
            if(currentOccurrence < x) {
                lastOccurrence = i;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_0_4a9a714e_f63d_4688_8568_f42133d961ba(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9409b7a3_58c0_4d9d_96cd_7f0f99239d43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a028bae7_7169_4098_9b8c_b91aff975652(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0fa3ef6b_f707_40f1_86bc_73de7e006ab0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_961eb8f5_8816_4bb6_9c4c_71d006bb9587(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_b547198e_6dae_4aeb_8a7a_3e46bd86694e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_12bf0544_cf81_4665_a2c2_81aba6006369(ArrayList<Integer> A, int x) {
        // Write your code here
        int firstOccurence = 0, lastOccurence = 0;
        int size = A.size();
        for(int i = 0; i<size; i++){
            if(A.get(i) == x){
                lastOccurence = i;
            }
            if(A.get(i) < x){
                firstOccurence = i;
            }
        }
        return firstOccurence;
    }

    
    public static int findFirstOccurrence_Problem_0_d28658d8_db51_4ee2_9c2f_54bb6f9e7ec5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_2_42f3fbb8_e773_4561_b458_15715c030785(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_37a35932_db6d_41f0_9f15_a0589481e0cd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_80cfd262_7747_440a_8a0e_ee475fbf0348(ArrayList<Integer> A, int x) {
        int size = A.size();
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_d86403cd_34e4_49c1_aaaa_ced6edad5fae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b11069cb_e401_411d_9636_34fd1c30972a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_869a754b_f33a_4277_8599_533c4e872f94(ArrayList<Integer> A, int x) {
        int low=0;
        int high=A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f942c6c1_24d7_4a7b_8f39_8c4b19034fd6(ArrayList<Integer> A, int x) {
        int size = A.size();
        int firstOccupancy = 0;
        for(int i = 0; i < (size-1); i++) {
            if(A.get(i) == x)
                firstOccupancy = i;
        }
        return firstOccupancy;
    }

    
    public static int findFirstOccurrence_Problem_2_cebb1121_6859_4f77_bff5_437c91fdda7e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9922fafe_270e_4afe_a754_352ab03dd282(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9b8951cc_f3db_4fe1_8db8_fa7d2dfee8b1(ArrayList<Integer> A, int x) {
        int n = A.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_16ecc39d_55ee_4a42_8b33_4920e1ddb4e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_25b36351_d254_4426_9f68_d4f92341b1b7(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_0639849e_47be_4a6a_8705_1ab43820d2d5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ea119ebc_805a_4516_82b1_ff0eb9815193(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5d4aabb9_b13e_40b0_9f56_2eba7fe457e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7bd8b23b_6f16_452a_8f0f_c0effcf9451a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_24c87c24_27b7_4acc_a5f1_b4328410943d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a028bae7_7169_4098_9b8c_b91aff975652(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5acaf94a_24ca_4bd2_8774_ce3e5d18683b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_28a6fd62_dcf4_4095_8e81_cb2db5249a0f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_09c7874b_3e43_4621_a062_7a4b13237fc4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_031572c0_3b36_4834_9aa6_12dea483d272(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_9b5a263c_a0cb_48ac_8230_33beb8f29701(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x))
                return mid;
            else if (A.get(mid) >= x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_487d25ce_ac3a_4ea1_9217_c8d5c3efc01a(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if(A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_517a8cee_89b7_4b8a_aa12_c199f5b8e885(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_c03e1349_286e_4c13_8881_2fc63d8f2b41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f636b0d2_d488_4f02_9148_e49b270bcaa9(ArrayList<Integer> A, int x) {
        // TODO: Implement this function.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9e276638_48b8_4c49_99d0_30837ce81747(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_4b50885b_1779_492b_961c_41725b369da1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_85a424c9_e1d8_4881_8b1a_369eadee0b00(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_24c87c24_27b7_4acc_a5f1_b4328410943d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0a674801_7682_4fe4_b571_45dc063c98b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5c6ca631_9a68_4f17_b556_eab1fb8f7008(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_27037c1e_e648_432b_bda4_e0feb2d66939(ArrayList<Integer> A, int x) {
        int l = A.indexOf(x);
        return l;
    }

    
    public static int findFirstOccurrence_Problem_2_183833bd_ba8a_4a9c_92fb_b30de602924d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_eae5d8fa_de55_4636_971e_7a7b3cbb03b2(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_df639a31_16de_4c35_9700_0595636a7d81(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ebd98f9e_f37a_4084_aa4d_9ae8545e7b8f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_cbfa69bc_b426_40d5_be03_760480c8fffd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_4032a219_2ef9_4c43_a5b7_9083b4f86e63(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b9adc9e4_cc4f_4cab_a102_30c94f8f0978(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3a6a4482_a8e2_4fed_93c6_4117379fc1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a9b743c4_37ff_481f_9a09_6d6db68cef70(ArrayList<Integer> A, int x) {
        // Your code goes here
        int low = 0;
        int high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_e1bd2a82_b10b_48bc_b228_4c1d837608f9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ef700317_8918_45d1_b94c_40c481d13975(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 1; j < A.size(); j++) {
            if (A.get(j) == x) {
                return i;
            }
            i = j;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_345da0b3_0f34_47eb_88bc_e6eb13dd29c3(ArrayList<Integer> A, int x) {
        int res = -1;
        for(int i=0; i<A.size(); i++) {
            if (A.get(i) == x) {
                res = i;
                break;
            }
        }
        return res;
    }

    
    public static int findFirstOccurrence_Problem_2_ac44b60d_62fd_4109_b531_495148d78d15(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_4a9a714e_f63d_4688_8568_f42133d961ba(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1ed7ad14_4d0f_4223_99b6_bd863c3ee28a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_50a9788e_a46b_4593_aa25_91b44140711a(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_423058d8_24a8_4650_b423_8f9f363f490a(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_fd7cff7c_4edd_45fd_b177_2f9eed9bf33d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_0639849e_47be_4a6a_8705_1ab43820d2d5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a5e11b92_777f_46cd_8057_a8d8baa623ae(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_12cb62d1_7196_41bd_a6ae_0e97ce94653c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_25b36351_d254_4426_9f68_d4f92341b1b7(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_de5bf634_f1a4_46ab_899a_9b687ffd0a96(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ce3dd082_c780_45d4_88c6_e21a845db377(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_00aeab65_3a47_47bd_bca3_5506662c55b4(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_c331ed52_a53c_4eb4_8aa5_60ddc36c8feb(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if(index >= 0) {
            return index;
        }
        else {
            int smallest = A.get(0);
            int i = 0;
            while(A.size() > 0 && A.get(i) <= smallest) {
                i++;
            }
            index = i;
            return A.indexOf(smallest);
        }
    }

    
    public static int findFirstOccurrence_Problem_1_37c83b8c_17d9_4736_a992_eec3ce904e3d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_531074c7_33a1_480d_9ec0_19e7cd435143(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_762f8436_cef6_48af_9d2b_82fb58fcec8c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_531074c7_33a1_480d_9ec0_19e7cd435143(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2108423b_8b3d_436e_b7e6_3d4b56c0cd97(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f3cffbb5_0d30_4fe9_9749_36181b0cec12(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_a787cfdf_4f73_4606_a942_fc352c9a9875(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_93535649_a1b6_4d3a_b970_845ac87e80b1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ebd98f9e_f37a_4084_aa4d_9ae8545e7b8f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_004f3a1f_1e21_473d_b50c_fb7f9212a92e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7e6fde82_54e3_4375_9f50_72f5ea5188ae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3ce275f9_401e_4e93_97a1_fe61568c0912(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b314d390_f600_4c9c_bb98_32a2bcc3e565(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_6012c006_ccd9_4f32_9743_8be0f2ef281e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ebd98f9e_f37a_4084_aa4d_9ae8545e7b8f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5ddc43ed_6538_42b7_a2a0_61eac0aba5d7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_91bcdcaa_e0ef_4b18_9008_25c57e325223(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_925cfc65_c00a_41cb_bf41_bdbeb3864709(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e2678a26_86fa_4743_9bb3_4092ff061e29(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i : A) {
            if (i == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_743c4fc3_707e_41d9_a440_a7c78897d560(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9e49c1e3_06e5_4024_82ea_ed630aa668e5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f2b351ec_85dc_4fe1_b27e_54d510427d50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_0f5820ce_4134_4c74_82d2_14a01915cbb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_a96ebcca_9bb9_4a1b_b77c_065c86600caf(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7b53a3b7_92b5_42ad_8155_c586d14a96ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_48478595_ad56_4f24_b0a3_c9ad9925b8b2(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5d538ae3_4510_48eb_8bf9_cd6be8cd7516(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_2d16585c_b5b5_4a36_b625_f34d9f9f10b8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_083a47b5_78de_4868_97db_9b9c057bbfe1(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_913ed3d4_9c73_41f8_8092_6304ce452ba5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_dc0a082e_57a2_4ae7_8039_bb565d083c0b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7b53a3b7_92b5_42ad_8155_c586d14a96ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_fe171dba_1037_42ed_bdd5_c5aaf954d414(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d5d845cf_9bc0_4c4e_a559_a8491f2a1ba5(ArrayList<Integer> A, int x) {
        int i = 0;
        int first = 0;
        int last = A.get(0) - 1;
        while ((i <= A.size()) && (first <= last)) {
            if (A.get(i) == x) {
                return i;
            }
            i++;
            first++;
            last--;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f942c6c1_24d7_4a7b_8f39_8c4b19034fd6(ArrayList<Integer> A, int x) {
        int size = A.size();
        int firstOccupancy = 0;
        for(int i = 0; i < (size-1); i++) {
            if(A.get(i) == x)
                firstOccupancy = i;
        }
        return firstOccupancy;
    }

    
    public static int findFirstOccurrence_Problem_0_8eaeed3e_00e6_4ecf_8aed_923d5da8cb22(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1a161f7a_c3b9_452d_83e1_0391877cfdb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_853e4688_d7b5_4f71_a3c5_56021aa575c6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e6c2bf27_f428_4b5f_8a69_7c6f138763c6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (high >= low) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal == x) {
                return mid;
            }
            else if (midVal < x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8025ff9a_4629_4a11_aa31_850d76471587(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x)
                index = i;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_743c4fc3_707e_41d9_a440_a7c78897d560(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ccc286ad_a67f_4791_a26f_5e831ff77034(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_881d575d_c7d1_4867_b1e1_d84ff4b17b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_24c87c24_27b7_4acc_a5f1_b4328410943d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_25b36351_d254_4426_9f68_d4f92341b1b7(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0 ; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_225f19d3_3ba1_437a_86a8_67e0341b50d1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            Integer midVal = A.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8e2d7300_a20b_4564_a088_171eb101d2ff(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1afdc8a6_64f1_4d9e_9da9_0bea2e4b040c(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_cebb1121_6859_4f77_bff5_437c91fdda7e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5c3981ff_86ac_4a54_93a2_9433d0ff6443(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8dfc532d_d318_495f_9733_bd1de930aefd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_efc1c736_39be_47b9_8ab4_ccf74a25abad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9b5a263c_a0cb_48ac_8230_33beb8f29701(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x))
                return mid;
            else if (A.get(mid) >= x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_762f8436_cef6_48af_9d2b_82fb58fcec8c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6374c109_6f89_4c64_994a_a31d6a9f6907(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_dbef191b_b50c_472d_ba74_34ce09ec9a5b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_12ed1297_b875_4e86_b765_160801a10f3d(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_f48cc607_c35e_4a27_8394_c5d21a07cea1(ArrayList<Integer> A, int x) {
        // return -1 if not found
        int index = -1;
        // iterate through all numbers in the array
        for(int i = 0; i < A.size(); i++) {
            // if the current number is equal to the number to be found
            if(A.get(i) == x) {
                // stop the iteration
                break;
            }
            // if any other number is found
            else {
                // iterate through all numbers after the current number
                for(int j = i+1; j < A.size(); j++) {
                    // if the current number is greater than the number to be found
                    if(A.get(j) > x) {
                        // stop the iteration
                        break;
                    }
                    // if any other number is found
                    else {
                        // the current number is not greater than the number to be found
                        // set the current index to be the index of that other number
                        index = j;
                        // stop the iteration
                        break;
                    }
                }
            }
        }
        // return the index where the first occurrence occurred
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_f2cae02c_3bc3_43d6_8be2_49aad9a568f0(ArrayList<Integer> A, int x) {
        return A.stream().filter((n) -> n.intValue() == x).findFirst().get();
    }

    
    public static int findFirstOccurrence_Problem_1_c11b3331_1c5a_4ba2_b030_ea33f7e77ed6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (A.get(l) == x)
            return l;
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b74c0150_a335_462f_a6f7_e69d72b33140(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_b390788d_ab83_4cae_933f_884cf6665397(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_efb37230_b6af_4d95_b07a_a6540b270ee6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_4b50885b_1779_492b_961c_41725b369da1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_27037c1e_e648_432b_bda4_e0feb2d66939(ArrayList<Integer> A, int x) {
        int l = A.indexOf(x);
        return l;
    }

    
    public static int findFirstOccurrence_Problem_2_22aa398f_1632_4e16_a12c_c1fa2be3a085(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d8530e44_9374_4eb4_ae4b_11ae777ff88d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_564c4c0a_0ea9_49b6_a392_6282c0775935(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a87ca98c_08c0_4a16_ae03_8bd9ed434179(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_cbfa69bc_b426_40d5_be03_760480c8fffd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_46287fb7_fa01_4e6b_b9e1_dba0c337b0b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5d4aabb9_b13e_40b0_9f56_2eba7fe457e0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_31c51b04_9b4f_48e8_b77d_7678ad4955f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_54e3cd00_bba0_4b39_96dd_c91810d4cee4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ed442b1d_373c_4fdf_8ea1_7d279a24ff3e(ArrayList<Integer> A, int x) {
        // Return the position of the first occurrence of x in A
        if(A.isEmpty())
            return -1;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x)
                return i;
        }

        // If x is not present in array list, return -1
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_bfce2605_c633_4ae5_9d80_210917e4834d(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_0c63e7b9_d7d5_4884_8046_63edc9e292be(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_72523e9e_8f18_40ce_be5b_a9b113e81526(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_24ad9e48_1e88_4e17_986f_a9f910665535(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_30f15bf4_aebf_401a_a866_e55c1d2971df(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_28992aee_b7c0_4989_be8d_bdb007a3e0fb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_a69d0a27_faed_44fd_8d52_4fbbc003ca0a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_46287fb7_fa01_4e6b_b9e1_dba0c337b0b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5cbeda81_67a9_44f3_a7e1_d0abe909c69b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_92ed4a7d_26b3_4d75_88bd_dcacc7d891fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_6a625ffa_a777_4924_bfc8_5d81c4bd2563(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ceed78e6_522f_4313_a8f7_69dcb119c10c(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ef700317_8918_45d1_b94c_40c481d13975(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 1; j < A.size(); j++) {
            if (A.get(j) == x) {
                return i;
            }
            i = j;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1bc6a917_2a1f_4822_b5b3_0e0edb5fa67e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_cb9775e8_306a_4c01_b367_9d76bdb8d307(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e99b1833_cb7b_48d5_8b65_f7822f2f2340(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f1464485_7943_4b82_b1ef_326d6713f074(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_221015da_2028_4dcd_9349_fdea61a64d04(ArrayList<Integer> A, int x) {
        int index = A.stream().filter(i -> i == x).findFirst().get();
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_09c89001_58fe_488a_8a9c_2d974c16d2f8(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8e5886a4_b236_4aef_bc1e_19fb779167e2(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7c509caf_2f37_4ddf_a633_3df6283bb613(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( (mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f2b351ec_85dc_4fe1_b27e_54d510427d50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_f2b351ec_85dc_4fe1_b27e_54d510427d50(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_6222fd01_178b_43d5_ac71_340ac4e42f1e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b2652073_0973_4ec1_a9a2_b5fd5e27f161(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9210636c_05e9_4918_8239_b4a083090449(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_130186fd_ada6_4de5_81b0_201e77935657(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3d2b9259_c751_4bac_ad2f_bb31982e197f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5e73b0bd_ceb5_47be_bc01_a952e462d0ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1d5c6062_fe1b_4c58_92af_c11226921708(ArrayList<Integer> A, int x) {
        for(int i=0; i<A.size(); i++){
            int y = A.get(i);
            if(y == x)
                return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_caaabb67_c1a8_4968_b61f_37e14ad0021a(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_8470f3cc_755a_4e34_8a4b_dbb818235a7a(ArrayList<Integer> A, int x) {
        return A.indexOf(x);
    }

    
    public static int findFirstOccurrence_Problem_1_182ebb91_dbea_4e0f_8e1c_3432abfcd346(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_6cd7d705_8b7d_4e0a_9d92_2ee86a58c2eb(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a5e11b92_777f_46cd_8057_a8d8baa623ae(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a134ede9_c272_4f9b_b0b2_35b5ce907b45(ArrayList<Integer> A, int x) {
        if (A == null || A.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < A.get(mid)) {
                high = mid - 1;
            } else if (x > A.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_2779bbaf_7cd4_4929_b768_7641c3787f87(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_0b64df7b_e415_4441_a73b_268bae1ff1f8(ArrayList<Integer> A, int x) {
        int i = 0, n = A.size();
        while (i < n) {
            if (A.get(i) == x)
                return i;
            i += 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_464eb54f_3f13_4f6d_9fe7_f886bc1ff7ea(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_73ec0741_fa02_4085_a2cc_3a24b6027f91(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_79eb8caa_168d_4ee4_aa50_79daeb19f047(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7a7797c3_e6d1_4bc4_b2d1_e77f631b5916(ArrayList<Integer> A, int x) {
        int index;
        for(index = 0; index < A.size(); index++) {
            if(A.get(index) == x) {
                return index;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_198243f2_e6e3_435c_a3d4_730d6277ae27(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_fef6feed_1b72_4d68_b113_a445bc50f2f5(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_0_624f6a6c_4c79_4d4e_bead_0442cfbb5712(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7e9b399f_cf9e_41d3_965b_78e3e3c2e78e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;

        while (low < high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b08815ae_b07e_4460_8a74_46b0a884eb02(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_81b382b5_6774_4bfa_9229_794f02ad3a26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_32eabe5d_b166_4f36_9be2_fb2c5147e47b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_77661242_1ddd_4951_8294_fccb7f143ba5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b36b5bd7_2775_42eb_8c05_20ebce4d23bd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_20a4ad86_8a3a_4ca9_acbd_14e16b778930(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_788b89d3_2b3b_473c_a73c_95e758dcea01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_14c3f54c_28f7_4dce_b0e9_d7cf577339d7(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7bd8b23b_6f16_452a_8f0f_c0effcf9451a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_9922fafe_270e_4afe_a754_352ab03dd282(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_a028bae7_7169_4098_9b8c_b91aff975652(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5b5d7709_2413_4069_88c1_0d67e57d5ff5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8ca1577b_9bc5_4d9a_b9fb_bde8164fc86c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ec36c00b_8d65_4e57_a072_eb381316fdbf(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0639849e_47be_4a6a_8705_1ab43820d2d5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_673140dd_9a35_44a8_af23_cf9521002d23(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_65000b25_2e2e_4644_83f3_9dc1266fbda9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9b8951cc_f3db_4fe1_8db8_fa7d2dfee8b1(ArrayList<Integer> A, int x) {
        int n = A.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_37a35932_db6d_41f0_9f15_a0589481e0cd(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7c509caf_2f37_4ddf_a633_3df6283bb613(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( (mid - 1)) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_31c51b04_9b4f_48e8_b77d_7678ad4955f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ce3dd082_c780_45d4_88c6_e21a845db377(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_34629a8f_5eea_489d_8ba2_e93405e78764(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_739fdd5a_edf8_4da8_8021_2ff493091c61(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_1265e4f5_18a4_4714_8d33_7738ebfcaff7(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_1b786603_0429_44ee_80ee_fb7d580e4a55(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ccc286ad_a67f_4791_a26f_5e831ff77034(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1df0777a_5d5c_4696_83fb_bbf59fac1bcc(ArrayList<Integer> A, int x) {
        for (int num : A) {
            if (num == x) {
                return A.indexOf(x);
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3ac991c1_e079_4d4d_b711_bd5dc48b1f95(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_5d538ae3_4510_48eb_8bf9_cd6be8cd7516(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_497225b8_4421_40dd_8184_597e51979794(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3f3d8001_dda0_4ca3_bbfe_0e59d41f563b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a4468dc8_50e2_469d_87bc_22aae246e2e4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_805c7c03_9763_4c15_833f_1a1e68e58c9c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8232608d_ca97_4f95_814d_dcde26e1466b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_fef1fce7_e503_4446_bd86_1bda7db290ad(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = -1;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_05ce8b2f_edf4_48c6_b13e_2cc8c0a055c4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_30f584ee_8aa9_4c27_86a6_7bc3317e7f77(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2d2cf387_0af7_40b8_9a31_7dd0d69ca8b3(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3a5c3bae_186a_45d5_9ed4_37e6f339ee3e(ArrayList<Integer> A, int x) {
        int first = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                first = i;
                break;
            } else if (A.get(i) == x) {
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_2_d7c8c1c8_5954_4994_ac78_1ab8a1154c41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d8530e44_9374_4eb4_ae4b_11ae777ff88d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_847fe911_e616_4a05_9eab_009cc6d9f2f5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_cb9775e8_306a_4c01_b367_9d76bdb8d307(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_14adde95_3c9d_418b_a23a_d4a7da735663(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            }
            else if (x < A.get(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e64422d4_3782_469f_8aa1_3fdc60792e60(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1ed7ad14_4d0f_4223_99b6_bd863c3ee28a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3f3d8001_dda0_4ca3_bbfe_0e59d41f563b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_accfd095_2a88_49c9_8f8e_3a1dc4bb2038(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f3c5220c_3411_4119_9584_284b5eb8b799(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3ac991c1_e079_4d4d_b711_bd5dc48b1f95(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_4032a219_2ef9_4c43_a5b7_9083b4f86e63(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_317e19e4_fd70_483f_95ea_f98e8f2e864e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_40dacfca_3aa9_4fb2_b4af_d686c0cb9fa4(ArrayList<Integer> A, int x) {
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e15b2ddc_81bc_4192_a5c0_4bb3430cb498(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_0f7813f5_67cd_4f3f_ac1b_e4f9e9939445(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_1_d074fcd2_99a7_4e2f_9fe6_6cfd8eea5ca8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_40dacfca_3aa9_4fb2_b4af_d686c0cb9fa4(ArrayList<Integer> A, int x) {
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2779bbaf_7cd4_4929_b768_7641c3787f87(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7355494f_b28d_4a3e_ace4_f6010e823e86(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_251360f1_031e_41db_ad48_b6d201cca377(ArrayList<Integer> A, int x) {
        // Write your code here
        int index = -1;
        
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_ea012a2e_e2f4_4b13_8f13_f5c65a562102(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e7094ccd_6c20_486f_9b4f_b0a4aeaeac04(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_688493bc_43ed_43da_a312_820e1b8764f3(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        while(i < A.size() && A.get(i) < x) {
            i++;
        }
        while(i < A.size() && A.get(i) == x) {
            index = i;
            i++;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_2fab2ade_a189_4901_a730_9190df700ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ad51bf7c_5fc5_401e_ba48_376d840b6394(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f10020a0_7fe9_45cb_b591_6a0e161d7b89(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5033bfec_61e6_4e54_80d2_ce9097a27a58(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_739fdd5a_edf8_4da8_8021_2ff493091c61(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_5033bfec_61e6_4e54_80d2_ce9097a27a58(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_af7ce5c0_d583_4cea_96a3_63b9d1128ad7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_63054dd1_9ff9_45b5_b639_f67bfdd4b1fb(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8f075f16_15b4_47c4_b272_06a22683079f(ArrayList<Integer> A, int x) {
        int indexOfFirstOccurrence = -1;
        for (int i : A) {
            if (i == x) {
                indexOfFirstOccurrence = i;
                break;
            }
        }
        return indexOfFirstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_0_559d2b12_7256_447c_abd7_99a8efe8929f(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_b85fd35a_fe30_4fca_bf1f_c185a3a58562(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_818a9e3a_ab16_4b2b_b98d_622d83641d92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_14f9b52d_baba_4fee_9165_3ee9a2a540da(ArrayList<Integer> A, int x) {
        if (A.isEmpty()) {
            return -1;
        }

        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);

            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b0a03263_3370_4424_9da7_34ab882b5f84(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x)
                    return m;
                else
                    r = m - 1;
            } else if (A.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1089e287_0b3f_432d_9ed6_48b4858e2ff0(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_19f0c19a_0262_4725_8264_b0c71eed231c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ec36c00b_8d65_4e57_a072_eb381316fdbf(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8eaeed3e_00e6_4ecf_8aed_923d5da8cb22(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e6833606_f06f_49f9_a761_cf15e92c301d(ArrayList<Integer> A, int x) {
        // TODO Auto-generated method stub
        int low = 0;
        int high = A.size()-1;
        while(high>=low){
            int mid = low+((high-low)/2);
            if(A.get(mid)==x){
                return mid;
            }
            else if(A.get(mid)<x){
                high=mid-1;
            }
            else if(A.get(mid)>x){
                low=mid+1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_d28658d8_db51_4ee2_9c2f_54bb6f9e7ec5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_1_8e5a844d_9579_4382_8aef_3c9b8c54a1f4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_6e910605_4609_4d73_b222_9dc2bc0a398e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_1b1123ea_35f7_4b3a_bcaf_d6ef79256332(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7b1fbe1e_151d_4e93_8da7_912b696310bb(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_30974ab4_863b_408f_a80e_b165e5256037(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ba6c93ef_6bb4_43a0_8bf0_a6ce844a34c8(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_004f3a1f_1e21_473d_b50c_fb7f9212a92e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_17ec0f9c_d2b4_4fbb_af3b_7d3997da94a5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_dc6f6edb_8025_43cf_8f29_ace8133ff710(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_d7c8c1c8_5954_4994_ac78_1ab8a1154c41(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a96ebcca_9bb9_4a1b_b77c_065c86600caf(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_16742416_58ca_47d0_887e_5245ed09e5e1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2608d407_1a40_41ac_9b8a_2ef81f8a8567(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d9b60ace_4553_402d_9f15_38099268ab1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2fab2ade_a189_4901_a730_9190df700ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3ac991c1_e079_4d4d_b711_bd5dc48b1f95(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_13fd4e38_48be_4886_b755_d1e94510ded1(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b2652073_0973_4ec1_a9a2_b5fd5e27f161(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_adbb4998_8ae8_4b7a_b909_264366ef238c(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e70176d3_5d0d_4419_b69f_7d86024d7783(ArrayList<Integer> A, int x) {
        // Write your code here.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_91bcdcaa_e0ef_4b18_9008_25c57e325223(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b308d977_ef34_406f_88db_3373ad085fee(ArrayList<Integer> A, int x) {
        int n = A.size();
        for(int i = 0; i < n; i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_02042576_48e5_491c_ab0c_4b3f9d93aa08(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            }
            else if(A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_426ca3ae_e31a_4d35_b467_9138257e6693(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_221015da_2028_4dcd_9349_fdea61a64d04(ArrayList<Integer> A, int x) {
        int index = A.stream().filter(i -> i == x).findFirst().get();
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_f9723ed1_c340_46e2_95a5_08b61a26ebdc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_c3a436d8_3050_4e72_b0b2_f023046f9bd2(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f2f09d6f_a5ec_4414_b5ea_ca2b78b5f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_65e397bf_8307_42ce_b555_ff7460c39d25(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) > x) {
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2fe63b1d_009b_4ccf_ba25_7aad9c374788(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_f47aee72_d81d_41e5_9883_36d3d415ea8f(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e253870e_b537_4037_b647_cb49f689ef24(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1dcbba9d_2b36_4548_a96b_f39795aa9350(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e6c2bf27_f428_4b5f_8a69_7c6f138763c6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (high >= low) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal == x) {
                return mid;
            }
            else if (midVal < x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_30e8e639_8fcc_461e_b9d2_29f1157c60d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_0c20ac4e_a78b_42b8_b60d_2bb1cf5291c7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a134ede9_c272_4f9b_b0b2_35b5ce907b45(ArrayList<Integer> A, int x) {
        if (A == null || A.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < A.get(mid)) {
                high = mid - 1;
            } else if (x > A.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3ce275f9_401e_4e93_97a1_fe61568c0912(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_fef6feed_1b72_4d68_b113_a445bc50f2f5(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_2_58e9479a_3dfa_42de_9c08_9e19b34d4e7a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e2678a26_86fa_4743_9bb3_4092ff061e29(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i : A) {
            if (i == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_53345b58_ab13_4e3a_b0bc_c2d683e57991(ArrayList<Integer> A, int x) {
        return A.indexOf(A.get( Math.floorDiv(A.size() - 1, x)));
    }

    
    public static int findFirstOccurrence_Problem_0_3a16b9c3_8a33_40f2_9cce_5eb03ba87643(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8858ed70_be45_407a_b362_0fe1ff925b4c(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5033bfec_61e6_4e54_80d2_ce9097a27a58(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_98d3487e_43c1_4c59_865d_1a8047bfdc79(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (A.get(mid) < x)
                low = mid + 1;
            else if (A.get(mid) > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1afdc8a6_64f1_4d9e_9da9_0bea2e4b040c(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_ff427168_6bde_4dc8_ba9a_c9be6d885b6e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3b247087_fb3b_435a_8169_5cc0545df155(ArrayList<Integer> A, int x) {
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_20064dcd_2e3f_4bb8_968b_fcf698dfc814(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                if (mid == 0)
                    return mid;
                if (A.get( mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3d9bb08c_a13c_4683_be5b_deb36ef50478(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_02042576_48e5_491c_ab0c_4b3f9d93aa08(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(A.get(mid) == x) {
                if(mid == 0 || A.get(mid - 1) != x)
                    return mid;
                else
                    high = mid - 1;
            }
            else if(A.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_39074188_22ca_4bef_b132_7d77f652792d(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_efb37230_b6af_4d95_b07a_a6540b270ee6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5d538ae3_4510_48eb_8bf9_cd6be8cd7516(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_57b61c83_1599_4486_b3e6_2f057551b12c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_c79069aa_5dbe_44e2_8567_f54a79e0b5f5(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if (A.get(j) == x) {
                return j;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_51454a07_7301_40e6_a0ac_5074358df2e6(ArrayList<Integer> A, int x) {
        int pos = 0;
        int i = 0;
        int found;
        while (i != A.size() - 1) {
            found =  A.get(i++);
            if (x == found) {
                return pos;
            }
            if (x > found) {
                pos = 0;
            } else {
                pos++;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7a7eb96e_4b83_4200_9d38_f0b746eeea19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f10020a0_7fe9_45cb_b591_6a0e161d7b89(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_0c63e7b9_d7d5_4884_8046_63edc9e292be(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_d7aa9e17_4326_4931_b516_8ebe0ef30ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_dc6f6edb_8025_43cf_8f29_ace8133ff710(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_74f5698f_361a_4f2c_b0db_2ce67af45402(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f7d03024_1326_47dd_936a_5840d557d701(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) < x) {
                low = mid + 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_19f0c19a_0262_4725_8264_b0c71eed231c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_0e16751b_2156_45d3_a8e2_074ae2123f5b(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( (m - 1)) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_42f3fbb8_e773_4561_b458_15715c030785(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1a161f7a_c3b9_452d_83e1_0391877cfdb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a257ee77_95b5_469a_a342_960d5ec0184d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7c7ae11b_0d83_459b_8b79_a197b36d640f(ArrayList<Integer> A, int x) {
        // TODO: Implement me!
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_4a9a714e_f63d_4688_8568_f42133d961ba(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8e5886a4_b236_4aef_bc1e_19fb779167e2(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1afdc8a6_64f1_4d9e_9da9_0bea2e4b040c(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_8e5a844d_9579_4382_8aef_3c9b8c54a1f4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_165f483b_aafe_4d67_b538_c4895d2d09bf(ArrayList<Integer> A, int x) {
        int result = -1;
        int i = A.size() - 1;
        while (i >= 0 && A.get(i) > x)
            i--;
        if (i > -1)
            result = i;
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2effa905_191e_4a12_88e4_bb5937ed5e9a(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_37b37a61_5e19_44d1_87f9_487098ce41c1(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8363a71c_caf1_49a3_b131_1a2d08af9363(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == A.get(mid)) {
                result = mid;
                end = mid - 1;
            } else if (x < A.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e27711e3_ce3c_424b_b8cb_9ec3864bddcf(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7355494f_b28d_4a3e_ace4_f6010e823e86(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5acaf94a_24ca_4bd2_8774_ce3e5d18683b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3309e2ff_4ac9_4a18_ae7f_bd4cefefa002(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3b130185_45d6_4cdb_b555_a19bb4e4162e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_22feccb8_82b4_4535_acba_ad0784b5a0a2(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_fac54be4_3acc_4776_bf1b_c4890d5c4af6(ArrayList<Integer> A, int x) {
        // Write your code here
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_7b263c9f_7603_41f8_a5f7_2d46b834ea61(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f77b2a6a_4e64_4898_ae28_3121e5199de1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9409b7a3_58c0_4d9d_96cd_7f0f99239d43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ebdc652f_1587_42cb_8751_410f2d78ed67(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c331ed52_a53c_4eb4_8aa5_60ddc36c8feb(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if(index >= 0) {
            return index;
        }
        else {
            int smallest = A.get(0);
            int i = 0;
            while(A.size() > 0 && A.get(i) <= smallest) {
                i++;
            }
            index = i;
            return A.indexOf(smallest);
        }
    }

    
    public static int findFirstOccurrence_Problem_0_ebfdfe25_0007_40a6_83e8_34309c950489(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_9e49c1e3_06e5_4024_82ea_ed630aa668e5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_f636b0d2_d488_4f02_9148_e49b270bcaa9(ArrayList<Integer> A, int x) {
        // TODO: Implement this function.
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9be93537_ae4c_4bdb_b9d3_42765209d38d(ArrayList<Integer> A, int x) {
        // Returns the index of the first occurrence of x in array A, or -1 if x is not in A.
        // Binary search.
        int low = 0;
        int high = A.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_dbef191b_b50c_472d_ba74_34ce09ec9a5b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f48cc607_c35e_4a27_8394_c5d21a07cea1(ArrayList<Integer> A, int x) {
        // return -1 if not found
        int index = -1;
        // iterate through all numbers in the array
        for(int i = 0; i < A.size(); i++) {
            // if the current number is equal to the number to be found
            if(A.get(i) == x) {
                // stop the iteration
                break;
            }
            // if any other number is found
            else {
                // iterate through all numbers after the current number
                for(int j = i+1; j < A.size(); j++) {
                    // if the current number is greater than the number to be found
                    if(A.get(j) > x) {
                        // stop the iteration
                        break;
                    }
                    // if any other number is found
                    else {
                        // the current number is not greater than the number to be found
                        // set the current index to be the index of that other number
                        index = j;
                        // stop the iteration
                        break;
                    }
                }
            }
        }
        // return the index where the first occurrence occurred
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_ea335a0c_d0ee_4831_8812_f129ddcada84(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                }
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a257ee77_95b5_469a_a342_960d5ec0184d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d86403cd_34e4_49c1_aaaa_ced6edad5fae(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_03580f70_660b_4b7d_9eaf_3f27b5057b92(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3b4c67c4_1fd3_47af_88f8_2eea69231df9(ArrayList<Integer> A, int x) {
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                firstIndex = i;
                lastIndex = i;
                break;
            }
            if (A.get(i) < x) {
                lastIndex = i;
            } else {
                firstIndex = i;
            }
        }
        return firstIndex;
    }

    
    public static int findFirstOccurrence_Problem_0_7c2c4c16_adfd_410d_ae66_f3a7f568194f(ArrayList<Integer> A, int x) {
        int first = 1;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                count++;
            }
            if (A.get(i) < x) {
                if (count == 1) {
                    first = i;
                }
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_1_b183fa73_252b_4544_85ae_c836800a41d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9fef1fcb_60be_4651_ae1b_b8a9ca83502e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_221015da_2028_4dcd_9349_fdea61a64d04(ArrayList<Integer> A, int x) {
        int index = A.stream().filter(i -> i == x).findFirst().get();
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_00989554_9bf5_4115_8010_0a81b03ed787(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1089e287_0b3f_432d_9ed6_48b4858e2ff0(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_3edb2f94_5bec_481d_b9ca_1a001ae44690(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_accfd095_2a88_49c9_8f8e_3a1dc4bb2038(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_345da0b3_0f34_47eb_88bc_e6eb13dd29c3(ArrayList<Integer> A, int x) {
        int res = -1;
        for(int i=0; i<A.size(); i++) {
            if (A.get(i) == x) {
                res = i;
                break;
            }
        }
        return res;
    }

    
    public static int findFirstOccurrence_Problem_0_e253870e_b537_4037_b647_cb49f689ef24(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_dc0a082e_57a2_4ae7_8039_bb565d083c0b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_caf605d6_96b8_4cd5_8a4d_be7aed1753ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_e27711e3_ce3c_424b_b8cb_9ec3864bddcf(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_7ae70577_cf9e_4f40_a55d_f49d200ad842(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_780553cb_8e1f_426b_b955_9221a4fabefb(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_eaddd582_21b3_468d_aa19_e06a01c7ae28(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_46287fb7_fa01_4e6b_b9e1_dba0c337b0b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_a368542c_5581_4fc2_b09e_6fee0390f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a368542c_5581_4fc2_b09e_6fee0390f7b6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_317e19e4_fd70_483f_95ea_f98e8f2e864e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_585bee2d_7ddd_4dca_ae51_a3fa707286c1(ArrayList<Integer> A, int x) {
        int left = 0, right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get(left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_3a6a4482_a8e2_4fed_93c6_4117379fc1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9afc5e32_0dfa_4bcd_8c44_61b3b8b035fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9303830c_c5b3_4e6f_81b0_cae89324167c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8e5a844d_9579_4382_8aef_3c9b8c54a1f4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e60edba1_05d8_4a73_8e04_c1328c19d713(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_9dd67970_6e7d_4c66_b949_e324484d8fd7(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index >= 0) {
            index = findFirstOccurrence_Problem_1_9dd67970_6e7d_4c66_b949_e324484d8fd7(A, x);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_c761b763_d4cb_46f3_b5bc_3278c821e6b6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6012c006_ccd9_4f32_9743_8be0f2ef281e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_5dfcda1a_035d_4df0_a3fd_d9e52cf54ff0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_14c3f54c_28f7_4dce_b0e9_d7cf577339d7(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_585bee2d_7ddd_4dca_ae51_a3fa707286c1(ArrayList<Integer> A, int x) {
        int left = 0, right = A.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A.get(left) == x) {
            return left;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_87cda437_6b99_4a12_a24d_7d68b65cb139(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e7b418e4_6435_4068_99e8_04cbfdf5b2a9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1dcbba9d_2b36_4548_a96b_f39795aa9350(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d9b60ace_4553_402d_9f15_38099268ab1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3309e2ff_4ac9_4a18_ae7f_bd4cefefa002(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A.get( m) == x) {
                if (m == 0 || A.get( m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_879a0b2e_668b_4575_a736_5e8bac42e4ba(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_32eabe5d_b166_4f36_9be2_fb2c5147e47b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_3a03808e_b570_466d_82ad_24105c519733(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_d7aa9e17_4326_4931_b516_8ebe0ef30ec8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a257ee77_95b5_469a_a342_960d5ec0184d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ea012a2e_e2f4_4b13_8f13_f5c65a562102(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_18b6cad1_1523_45ed_9e7b_0590d64e0f24(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_1_97ef5f14_f5f1_403a_8937_97b2d2ff7c5e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_12f03182_9430_481a_9577_1776d57f2c6a(ArrayList<Integer> A, int x) {
        // Runtime: O(log n)
        // Space: O(1)
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                ans = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_2_1bc6a917_2a1f_4822_b5b3_0e0edb5fa67e(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_58ab4625_067f_4e48_8811_ebc59028f8d3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
