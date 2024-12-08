package mbpp_793_last;

public class mbpp_793_last {

    
    public static int last_Problem_0_bb163659_7424_4139_a58f_52880aea7e12(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_b36fa17b_23a8_44f6_aa3b_4217b29a7e75(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_b36fa17b_23a8_44f6_aa3b_4217b29a7e75IndexOf(x);
    }

    
    public static int last_Problem_1_ade889e4_6c7b_45b1_b1c5_2bd19175be69(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_7676984e_b608_430d_8849_c5ebe156ab39(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        if(arr.get(i) == x) {
            return i;
        }
        while(arr.get(i) < x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_73a5d8a1_1787_4098_afb5_5ce348a6d982(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_11af1647_f5dc_4fa4_9b5a_dda76a925661(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int last_Problem_1_11af1647_f5dc_4fa4_9b5a_dda76a925661 = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                last_Problem_1_11af1647_f5dc_4fa4_9b5a_dda76a925661 = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return last_Problem_1_11af1647_f5dc_4fa4_9b5a_dda76a925661;
    }

    
    public static int last_Problem_1_71c81be1_aad1_4ca5_8a1e_26938cd93e7a(ArrayList<Integer> arr, int x) {
        // Binary search
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get( m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_2268d031_fb77_4d94_b1c5_589b5fa567c6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_0f7e91f2_e3a4_4b96_85bb_c94e3a62c1b3(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1) {
                    return mid;
                } else if (arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_863d9540_c999_465c_9ab1_d84e80606b1c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_dbbc166d_49b1_4edc_a651_7ead0e358677(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_18eae770_690c_4360_80e4_ae321571c23a(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) > x) {
                hi = mid - 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_c595c1a0_4b84_42c5_a4f0_8d2cb4444321(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e(ArrayList<Integer> arr, int x) {
        int last_Problem_0_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_0_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = i;
                break;
            }
        }
        return last_Problem_0_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e;
    }

    
    public static int last_Problem_2_8c651095_a50a_4fbf_9854_319248d87cc7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_fecb1b25_1dd3_4eb6_bb03_0d29e7897bca(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int p1 = size - 1;
        int p2 = size;
        while (p1 >= 0 && p2 >= 0) {
            if (x == arr.get(p1)) {
                return p1;
            }
            if (x == arr.get(p2)) {
                return p2;
            }
            p1--;
            p2++;
        }
        return -1;
    }

    
    public static int last_Problem_2_50474d07_1082_4508_ab72_5b4ddfe1b305(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ada59fc3_2093_4c4c_81d2_c13a9510bfe9(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        else {
            int n = arr.get(arr.size() - 1);
            if(n == x) return arr.size();
            else {
                int i = arr.size() - 1;
                while(i >= 0) {
                    if(arr.get(i) == x) return i;
                    else if(arr.get(i) > x) return -1;
                    i--;
                }
                return -1;
            }
        }
    }

    
    public static int last_Problem_0_9ddfce47_1d61_4125_a1ef_542162606ce4(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_b2656834_e839_4380_84ef_0738314f4f05(ArrayList<Integer> arr, int x) {
        int last_Problem_0_b2656834_e839_4380_84ef_0738314f4f05 = 0;
        int i = arr.size();
        while (i > 0) {
            i -= 1;
            if (arr.get(i) < x) {
                last_Problem_0_b2656834_e839_4380_84ef_0738314f4f05 = i;
            }
        }
        return last_Problem_0_b2656834_e839_4380_84ef_0738314f4f05;
    }

    
    public static int last_Problem_2_8ebe50bf_131f_40f4_8713_5807c7ab9369(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_bdfb290c_97ff_40cb_b658_3d15a764a505(ArrayList<Integer> arr, int x) {
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) return index;
            index--;
        }
        return -1;
    }

    
    public static int last_Problem_1_b0aba73a_c114_4fbc_908f_bed1690c698b(ArrayList<Integer> arr, int x) {
        int i = 0, j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                return arr.get(mid);
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_c2635a16_aaec_459a_b728_7f70757fafb5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_b5e8536f_dbcf_4a7c_a561_f3a9d498cfb0(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_378f1e95_43f4_420d_86ba_8dbde95b6426(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_1d88d339_f7b2_44e9_94ea_92f4c2b52787(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_bb75eba3_3fbc_4969_96fc_9dbcc9cf3ead(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( (m + 1)) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_53937142_08b6_400f_a5d1_84d90171de6a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_8b1c6961_1fc8_4cdc_8bc0_cf893588a787(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_2ac31c87_90dd_46e9_887c_ce14f3467050(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        int n = arr.size() - 1;
        int low = 0, high = arr.size() - 1, mid;
        while(low < high) {
            mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(arr.get(low) < x) return 0;
        if(arr.get(high) < x) return arr.size();
        int count = high - low;
        if(arr.get(low) == x) return low;
        if(arr.get(high) == x) return high;
        return count;
    }

    
    public static int last_Problem_1_d7fdc5b3_9f49_4149_8cf3_78b2d491f3c4(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_15eff960_3331_42d6_8f5b_163cc2329376(ArrayList<Integer> arr, int x) {
        int last_Problem_1_15eff960_3331_42d6_8f5b_163cc2329376 = 0;
        int prev = 0;
        int len = arr.size();
        for(int i = 0; i < len; i++){
            if(arr.get(i) == x){
                last_Problem_1_15eff960_3331_42d6_8f5b_163cc2329376 = i;
            }
            if(arr.get(i) > x){
                prev = i;
            }
        }
        return last_Problem_1_15eff960_3331_42d6_8f5b_163cc2329376;
    }

    
    public static int last_Problem_2_62a7d54c_0b5a_4016_a858_c0af9f800f80(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14ae(ArrayList<Integer> arr, int x) {
        int last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = 0;
        int last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = arr.get(0);
        int currentVal = arr.get(0);
        int last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = 0;
        for(int i = 1; i < arr.size(); i++) {
            currentVal = arr.get(i);
            if(currentVal < x) {
                last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = i;
                last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = currentVal;
                last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = i;
            }
        }
        return last_Problem_0_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos;
    }

    
    public static int last_Problem_2_10c30348_bf05_47d9_bdab_cd0d0267c69c(ArrayList<Integer> arr, int x) {
        // Your code here
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                if (mid + 1 < arr.size() && arr.get(mid + 1) == x) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_0c4af3eb_d781_4de6_b757_ba7595f363fb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        if (arr.get(r) == x) return r;
        else return -1;
    }

    
    public static int last_Problem_0_6471e48d_db97_467b_a4ee_e70c522b76ec(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        int last_Problem_2_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = 0;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        if (i >= 0) {
            last_Problem_2_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = i;
        }
        return last_Problem_2_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c;
    }

    
    public static int last_Problem_1_8db68208_c9e2_4553_985d_9ae0adf26462(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_f37c7494_010b_45c4_ae36_c55b62fc59fd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_e682aa4c_a2c6_4809_a56b_7ade637fa024(ArrayList<Integer> arr, int x) {
        // your code goes here
        int i = arr.size() - 1;
        while(arr.get(i) != x)
            i--;
        return i;
    }

    
    public static int last_Problem_1_8f254e0c_72df_4333_9de8_0472c49fe3e5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_1_000bc47d_c601_4e43_b47a_db037adbfc09(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_4f78bfb0_7bf4_430b_bfc4_93245edd3a62(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7712da0d_b592_492e_995c_6522d194e209(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3d68b9a9_e686_453a_b1c7_23f10769c158(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ade889e4_6c7b_45b1_b1c5_2bd19175be69(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d739413d_a6f6_4f50_b28b_6b0a204df703(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        return arr.size() - 1 - i;
    }

    
    public static int last_Problem_0_a7809d89_9172_4975_bc29_5cc5f739103b(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_70dec87b_fc95_4c40_9c3a_0d791e582322(ArrayList<Integer> arr, int x) {
        int index = arr.stream().mapToInteger(e -> e).max().orElse(-1);
        System.out.println(index);
        return index;
    }

    
    public static int last_Problem_0_90cc39e8_9bd9_4b10_b859_7382d4c4bc0f(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e97eae71_d9c0_4634_92b8_926512dda039(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m + 1 < arr.size() && arr.get(m + 1) == x) {
                    l = m + 1;
                } else {
                    return m;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_c036653c_7615_4099_b565_32629f612127(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_ee764ad5_f506_4631_8923_3d43196ddbfc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1a507574_4493_4ddf_b036_b3a1f73ddb56(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c4d49d66_709c_4d8a_897c_2fcf15492f66(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_ade889e4_6c7b_45b1_b1c5_2bd19175be69(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_47364b39_ce50_432a_b32f_1bc82e5bba14(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_72906c07_2dcd_4eb7_9547_239da3d9fe61(ArrayList<Integer> arr, int x) {
        // Complete this function
        int last_Problem_2_72906c07_2dcd_4eb7_9547_239da3d9fe61 = 0;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_2_72906c07_2dcd_4eb7_9547_239da3d9fe61 = i;
                break;
            }
        }
        return last_Problem_2_72906c07_2dcd_4eb7_9547_239da3d9fe61;
    }

    
    public static int last_Problem_2_836541d4_e3d0_4daa_b202_8338cdf9fe32(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_c9b13011_3687_43bc_a265_5365644c2bc9(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8b2007dd_6d0f_4cdb_8b83_27440321fb01(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_2_b6afb45c_1e25_4a8e_9c18_3ee7eb40038a(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_4f2004af_fdae_4e0d_ad59_41355fe0254a(ArrayList<Integer> arr, int x) {
        // Your code here
        int arrSize = arr.size();
        int low = 0, high = arrSize-1, mid;
        int index = arrSize-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr.get(mid)==x) {
                index = mid;
                break;
            } else if(arr.get(mid)<x) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return index;
    }

    
    public static int last_Problem_1_f37c7494_010b_45c4_ae36_c55b62fc59fd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_11492348_1fec_433e_9091_4b128de3ac59(ArrayList<Integer> arr, int x) {
        int i = arr.size();
        while (i > 0) {
            i--;
            if (arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_881aaa0f_b072_4b9d_bdb3_878ed9fb1c3d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_819c0ef1_724c_43e6_a101_f74ccee543e5(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int pos = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_0_7d44bc3f_4aa3_45b0_aa50_b49796d3e561(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x)
                l = m;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_1_07f56f39_373a_470e_a935_8251a46d5260(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_2d2e659b_6338_4fbe_9fc1_213eee228e72(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_04d3fa3b_8048_437b_a0e2_7926dc3e9f3e(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_04d3fa3b_8048_437b_a0e2_7926dc3e9f3eIndexOf(x);
    }

    
    public static int last_Problem_1_fad7e13b_4f68_44d2_a8a4_239667700699(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr.get(mid)) {
                ret = mid;
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ret;
    }

    
    public static int last_Problem_1_dea331c5_157b_4577_864d_dfa84eba43ea(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_4f1a3641_d721_4501_ba26_c05fe3956908(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_849fa70d_6b69_4afd_b663_f74e1ec9b90d(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_842dc179_4000_4d64_ae69_a9dc051a10b2(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_53225b9d_9f88_4f2d_890f_0acd94847fca(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_0_0633d219_742c_42e8_89c6_4af66335fced(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_1_70b3aa61_5034_4016_b53d_2fe2ff26a38f(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_d5d7f4db_d3c3_4569_96e9_a7b103b8215d(ArrayList<Integer> arr, int x) {
        int res = 0;
        for(int i = arr.size()-1; i >=0; i--) {
            if (arr.get(i) == x) {
                return i;
            }
        }
        return res;
    }

    
    public static int last_Problem_1_73a5d8a1_1787_4098_afb5_5ce348a6d982(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_200044cc_0af0_4d45_a585_ec8600d01a96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b21a466e_89ba_441c_aec8_eabfe1957841(ArrayList<Integer> arr, int x) {
        int index = 0;
        for(int i : arr) {
            if(i == x) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    
    public static int last_Problem_1_7d454a91_457d_46fc_bf51_8edb2ea0f6bb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_594855ac_4ebb_483d_b685_e3515833b3d9(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) return 0;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) high = mid - 1;
            else low = mid + 1;
        }
        if (arr.get(high) != x) return 0;
        else return high;
    }

    
    public static int last_Problem_1_5b7262e9_5a38_4712_8025_345b356250b6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) return mid;
                else l = mid + 1;
            }
            else if (arr.get(mid) > x) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_cb0ed624_ba32_4918_9713_ad40b429d49d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_8b91510f_35d6_4749_ab5f_015bb7033c12(ArrayList<Integer> arr, int x) {
        int last_Problem_1_8b91510f_35d6_4749_ab5f_015bb7033c12 = -1;
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                last_Problem_1_8b91510f_35d6_4749_ab5f_015bb7033c12 = i;
            }
            i++;
        }
        return last_Problem_1_8b91510f_35d6_4749_ab5f_015bb7033c12;
    }

    
    public static int last_Problem_2_6ec43528_9399_45ac_99e3_e3ddc9de9b0d(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int index = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            ret = arr.get(index);
        }
        return ret;
    }

    
    public static int last_Problem_0_f34a70d0_0d94_4992_9eca_35c19c23c3e9(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_5b7262e9_5a38_4712_8025_345b356250b6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) return mid;
                else l = mid + 1;
            }
            else if (arr.get(mid) > x) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_11492348_1fec_433e_9091_4b128de3ac59(ArrayList<Integer> arr, int x) {
        int i = arr.size();
        while (i > 0) {
            i--;
            if (arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_fb731f6e_ec22_45b1_b934_644350c74a31(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_5cb83a3e_4624_4d3f_966d_613eb4f54e3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_b61461a5_252d_4172_9eaa_3b6dce09364d(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a9573a48_999b_4a37_9d48_953029bae00b(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_6b93bae2_a328_4651_bb1e_e66622117115(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0)
            return -1;
        int left = 0, right = arr.size() - 1, mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr.get(mid) == x)
                return mid;
            if(arr.get(mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_f3e460eb_e03c_4942_9d1f_00f99f0cddc0(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_18eae770_690c_4360_80e4_ae321571c23a(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) > x) {
                hi = mid - 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_ff8c8cd4_ea24_4b2c_b18b_7d3df64ed250(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_57a03009_7155_4cec_929a_ddb040fbf689(ArrayList<Integer> arr, int x) {
        int last_Problem_1_57a03009_7155_4cec_929a_ddb040fbf689 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_1_57a03009_7155_4cec_929a_ddb040fbf689 = i;
            }
        }
        return last_Problem_1_57a03009_7155_4cec_929a_ddb040fbf689;
    }

    
    public static int last_Problem_0_c0bc5f31_6e48_478b_8ee0_8314b876f16a(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c323dad4_697c_4d2a_bf87_2372d7f4d327(ArrayList<Integer> arr, int x) {
        int last_Problem_2_c323dad4_697c_4d2a_bf87_2372d7f4d327 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_2_c323dad4_697c_4d2a_bf87_2372d7f4d327 = i;
            }
        }
        return last_Problem_2_c323dad4_697c_4d2a_bf87_2372d7f4d327;
    }

    
    public static int last_Problem_0_175d5f38_3c1f_43ab_8ca4_d0fa58be03ab(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_175d5f38_3c1f_43ab_8ca4_d0fa58be03abIndexOf(x);
    }

    
    public static int last_Problem_1_b5e8536f_dbcf_4a7c_a561_f3a9d498cfb0(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c0bc5f31_6e48_478b_8ee0_8314b876f16a(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_532c6d9b_6836_47ba_924d_e39a70eb05d8(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        return arr.get(size - 1);
    }

    
    public static int last_Problem_2_6b8bd222_ec56_4f1b_8787_d09b02b618b0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_588029d5_fd92_49a2_a622_56dbac1a7e1e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_bb86d6e6_170d_43d1_bc41_89cfee53e57f(ArrayList<Integer> arr, int x) {
        if(arr.isEmpty()){
            return -1;
        }
        int index = arr.indexOf(x);
        if(index == -1){
            return -1;
        }
        while(index > 0 && arr.get(index - 1) > x){
            index--;
        }
        return arr.get(index);
    }

    
    public static int last_Problem_1_e0d792e8_04fb_4511_bcd6_9f1b8c89ed2b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = 0;
        while (l <= r) {
            mid = (r - l) / 2 + l;
            if (x > arr.get(mid)) {
                l = mid + 1;
            } else if (x < arr.get(mid)) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_07f56f39_373a_470e_a935_8251a46d5260(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_deea75a0_f89f_4f2e_9df9_48629749a481(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }

    
    public static int last_Problem_2_cd1914aa_13d3_414a_8013_355f71bb784f(ArrayList<Integer> arr, int x) {
        // your code here
        return 0;
    }

    
    public static int last_Problem_1_14486463_b167_4aed_bec5_3e11e80b5175(ArrayList<Integer> arr, int x) {
        // your code here
        int i=0,j=arr.size();
        int r=-1,c=-1;
        while(i<=j){
            int k=arr.indexOf(x);
            if(k>0 && k<j){
                i=k+1;
                c=k;
                j=arr.last_Problem_1_14486463_b167_4aed_bec5_3e11e80b5175IndexOf(x);
                if(i>j){
                    r=k-1;
                }
            }else{
                i=j+1;
            }
        }
        return c;
    }

    
    public static int last_Problem_0_3b7af1a5_4a1b_4bb0_829c_57d4c4536a4e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_dc94c8fa_6eb4_49fd_80be_be75eb6da5fc(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size()-1;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(x > arr.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_0_ffd1b8da_b8a1_4fe9_bc3f_0fb1ef5ac256(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_ea0386e0_1646_4bef_947c_8bd45bece6d5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_ef52618e_f556_4a6a_959d_b625a1ad07e7(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_ef52618e_f556_4a6a_959d_b625a1ad07e7IndexOf(x);
    }

    
    public static int last_Problem_2_fc5b40e8_2102_47df_b738_e010697eba3c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c0bc5f31_6e48_478b_8ee0_8314b876f16a(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_1c13425e_2795_4ea8_b00e_079e41dd1177(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d7fdc5b3_9f49_4149_8cf3_78b2d491f3c4(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_b59df95b_b4f1_4973_ba44_99105fbf9a80(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        for(;i>=0;i--) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_a022d1c1_6c0b_4a9a_b48b_b6c215e21ef8(ArrayList<Integer> arr, int x) {
        int index = arr.indexOf(x);
        if(index == -1) {
            return -1;
        }
        int len = arr.size();
        while(index > 0 && arr.get(index-1) == x) {
            index--;
        }
        return index == -1 ? -1 : arr.get(index);
    }

    
    public static int last_Problem_1_875c39fb_6e4a_4182_a042_ffc2c35ba143(ArrayList<Integer> arr, int x) {
        int last_Problem_1_875c39fb_6e4a_4182_a042_ffc2c35ba143 = 0;
        for (int i : arr) {
            if (i == x) {
                last_Problem_1_875c39fb_6e4a_4182_a042_ffc2c35ba143 = arr.indexOf(i);
                break;
            }
        }
        return last_Problem_1_875c39fb_6e4a_4182_a042_ffc2c35ba143;
    }

    
    public static int last_Problem_2_a5daa8e8_2e66_4a15_a7a4_b2d35d203ef6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f08ce035_e2cd_4a69_ada3_8984296ca8cd(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x))
                return mid;
            else if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_3661323b_d253_46ef_8670_3743ad986b22(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_1_8f43ecc2_6bba_4b10_be12_5a13415d1b10(ArrayList<Integer> arr, int x) {
        int i = -1;
        for (int i1 = arr.size() - 1; i1 >= 0; i1--) {
            int num = arr.get(i1);
            if (num == x) {
                i = i1;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_0_5fd27f98_16cb_4ec3_83c8_d245dc88808b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid;
        }
        if (arr.get(l) == x)
            return l;
        return -1;
    }

    
    public static int last_Problem_2_daaf1587_ebbf_4933_8ac1_ad80e2ff0515(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_e23ecb91_f998_4d73_bbf2_22a2b0396074(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int size = arr.size();
        int i = size - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_c7923bd0_d9a2_4993_afcb_8e5a7398d632(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_c7923bd0_d9a2_4993_afcb_8e5a7398d632IndexOf(x);
    }

    
    public static int last_Problem_2_cfceb8da_1b24_4690_b440_cac46c720ab0(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1)-x;
    }

    
    public static int last_Problem_2_71c81be1_aad1_4ca5_8a1e_26938cd93e7a(ArrayList<Integer> arr, int x) {
        // Binary search
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get( m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_ee764ad5_f506_4631_8923_3d43196ddbfc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_bb86d6e6_170d_43d1_bc41_89cfee53e57f(ArrayList<Integer> arr, int x) {
        if(arr.isEmpty()){
            return -1;
        }
        int index = arr.indexOf(x);
        if(index == -1){
            return -1;
        }
        while(index > 0 && arr.get(index - 1) > x){
            index--;
        }
        return arr.get(index);
    }

    
    public static int last_Problem_2_ffd1b8da_b8a1_4fe9_bc3f_0fb1ef5ac256(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8f254e0c_72df_4333_9de8_0472c49fe3e5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_0_14486463_b167_4aed_bec5_3e11e80b5175(ArrayList<Integer> arr, int x) {
        // your code here
        int i=0,j=arr.size();
        int r=-1,c=-1;
        while(i<=j){
            int k=arr.indexOf(x);
            if(k>0 && k<j){
                i=k+1;
                c=k;
                j=arr.last_Problem_0_14486463_b167_4aed_bec5_3e11e80b5175IndexOf(x);
                if(i>j){
                    r=k-1;
                }
            }else{
                i=j+1;
            }
        }
        return c;
    }

    
    public static int last_Problem_0_b1f57407_f157_4239_ad34_287f476e2abc(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_900b848f_304b_473e_8ec4_1ffa13760f25(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_48d39480_10f8_40a4_8292_8b044bc0f2cf(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d5056366_3ba2_49bd_ac7e_2ed10a61028f(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_a4c9fac2_ae37_4c65_878f_a07fffc9434c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_6b93bae2_a328_4651_bb1e_e66622117115(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0)
            return -1;
        int left = 0, right = arr.size() - 1, mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr.get(mid) == x)
                return mid;
            if(arr.get(mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_614142f8_3f3f_4a7e_87ce_7fd522574a1c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_24df0526_fb40_4330_80b7_d5633e0a1216(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_cce1997d_278d_46b3_998b_72cd67f80ad1(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr.get(mid) > x) {
                right = mid - 1;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                left = right = mid;
            }
        }
        return left;
    }

    
    public static int last_Problem_1_01137d93_dccc_4628_91a5_7ba7ff58628e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_a0ad35b9_a13e_42d7_a093_390350a2e2ee(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_0b6312bc_bd72_4459_8b03_0d253220f6f8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_d33d4c4a_cac4_4332_b6d3_d99c871b59c5(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_0633d219_742c_42e8_89c6_4af66335fced(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_14e74fbb_fcc4_45c9_86bf_75ece4e400b8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int mid;
        while (start < end) {
            mid = (end + start) / 2;
            if (arr.get(mid) == x) {
                end = mid;
            }
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr.get(end);
    }

    
    public static int last_Problem_0_73a5d8a1_1787_4098_afb5_5ce348a6d982(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_bef5b4cd_0620_4909_8be8_7113d79e033e(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size()-1;
        int mid = (start+end)/2;
        while(arr.get(mid) < x) {
            mid = mid + 1;
        }
        if(x > arr.get(mid)) {
            return mid;
        } else {
            return mid - 1;
        }
    }

    
    public static int last_Problem_0_ea0386e0_1646_4bef_947c_8bd45bece6d5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_881aaa0f_b072_4b9d_bdb3_878ed9fb1c3d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_b49b1dd2_dfd2_473e_a0a4_b2425e2096b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_aa602647_8143_45b8_8688_7250f5b0aaab(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d3baf633_2652_4dbd_875b_960f358822e6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_a0d83a47_7b00_40a3_a9cf_7b0977c76c0a(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        return arr.stream().filter(l -> l == x).count();
    }

    
    public static int last_Problem_0_378f1e95_43f4_420d_86ba_8dbde95b6426(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_f9edbaa3_6e03_4d26_9e4c_235ead83c114(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_157408c7_a9aa_4d3f_aeaa_b91a10fea01a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_da043d39_96dc_4bf5_9c1b_2258489e1985(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int len = arr.size();
        return (arr.get(len - 1) == x) ? len - 1 : -1;
    }

    
    public static int last_Problem_1_b2656834_e839_4380_84ef_0738314f4f05(ArrayList<Integer> arr, int x) {
        int last_Problem_1_b2656834_e839_4380_84ef_0738314f4f05 = 0;
        int i = arr.size();
        while (i > 0) {
            i -= 1;
            if (arr.get(i) < x) {
                last_Problem_1_b2656834_e839_4380_84ef_0738314f4f05 = i;
            }
        }
        return last_Problem_1_b2656834_e839_4380_84ef_0738314f4f05;
    }

    
    public static int last_Problem_0_72110bfc_102c_4160_baf0_e39d539924f4(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_53225b9d_9f88_4f2d_890f_0acd94847fca(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_2_70b84021_3ce8_4fb7_9bdb_cbba601046e8(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_24df0526_fb40_4330_80b7_d5633e0a1216(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_c64897a9_dda1_4646_afd4_22398980ca78(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_bebae750_9b58_4880_b626_61cd509a2cd8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_eee27aba_fe70_4dd5_9dc4_4696d15af36b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_deea75a0_f89f_4f2e_9df9_48629749a481(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }

    
    public static int last_Problem_2_a9276bd2_d579_4c37_8007_7bd61ed4a0c3(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_2_e45ebd07_9081_4f02_baf0_71e47fdf3cde(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_5d8bb930_79c3_4f39_903b_f3e2afe6c825(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_8b8ec551_807a_4575_85a1_7730622f2b54(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_47658b04_75de_4fdd_b2c7_d7b0aa5b2955(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_353328fd_85e2_49ff_b087_2ce13ad8fecb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_cfceb8da_1b24_4690_b440_cac46c720ab0(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1)-x;
    }

    
    public static int last_Problem_1_c036653c_7615_4099_b565_32629f612127(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_175d5f38_3c1f_43ab_8ca4_d0fa58be03ab(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_175d5f38_3c1f_43ab_8ca4_d0fa58be03abIndexOf(x);
    }

    
    public static int last_Problem_2_01137d93_dccc_4628_91a5_7ba7ff58628e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8ebe50bf_131f_40f4_8713_5807c7ab9369(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_0fbc6f7e_73f4_42a4_b88a_637bbffb7b14(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                r = mid - 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            }
        }
        return arr.get(l);
    }

    
    public static int last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac(ArrayList<Integer> arr, int x) {
        int last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac = arr.size() - 1;
        int pos = 0;
        while (last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac >= 0) {
            int curr = arr.get(last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac);
            if (x == curr) {
                return arr.get(last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac);
            }
            else if (x > curr) {
                pos = last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac + 1;
            }
            else {
                last_Problem_0_8bc8c599_835e_417d_b079_eef4332c08ac--;
            }
        }
        return arr.get(pos);
    }

    
    public static int last_Problem_2_d85284dd_5f83_4e4f_8712_7e896314bb3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_742380df_0c67_4752_975c_888f1fb165c1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8b91510f_35d6_4749_ab5f_015bb7033c12(ArrayList<Integer> arr, int x) {
        int last_Problem_0_8b91510f_35d6_4749_ab5f_015bb7033c12 = -1;
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                last_Problem_0_8b91510f_35d6_4749_ab5f_015bb7033c12 = i;
            }
            i++;
        }
        return last_Problem_0_8b91510f_35d6_4749_ab5f_015bb7033c12;
    }

    
    public static int last_Problem_2_ead8a688_4052_4231_9573_f3c5f24219ff(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5d5f68d2_f0bd_474f_8421_29de191921d6(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_3661323b_d253_46ef_8670_3743ad986b22(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_1_56b9a794_fe76_4cac_9917_093d994a1681(ArrayList<Integer> arr, int x) {
        int last_Problem_1_56b9a794_fe76_4cac_9917_093d994a1681 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_1_56b9a794_fe76_4cac_9917_093d994a1681 = i;
            }
        }
        return last_Problem_1_56b9a794_fe76_4cac_9917_093d994a1681;
    }

    
    public static int last_Problem_0_febe6e87_bf03_4759_bda2_d0a6dff4cbef(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_ab8334e3_3528_454c_bcb6_388db3e97def(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_f3118d5a_2ca2_46fd_92a1_6821c2932f30(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i=arr.size()-1; i>=0; i--) {
            if(arr.get(i) == x) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_1_5b4df95f_e4ea_48d1_8d40_979810c67650(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e(ArrayList<Integer> arr, int x) {
        int last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e = 0;
        int last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e_index = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) < x) {
                last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e = arr.get(i);
                last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e_index = i;
            }
        }
        return last_Problem_2_c060952d_3789_4f94_9fbb_aa53278d113e_index;
    }

    
    public static int last_Problem_2_7d066944_4c57_42c6_9e2d_311e72905f15(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_480454da_1ed7_4fbf_b00d_4875c66b05e2(ArrayList<Integer> arr, int x) {
        int result = 0;
        for(int i = arr.size()-1;i>=0;i--) {
            if(arr.get(i)==x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_fad7e13b_4f68_44d2_a8a4_239667700699(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr.get(mid)) {
                ret = mid;
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ret;
    }

    
    public static int last_Problem_1_e9a71d42_6907_46f1_9e4c_b2de7ab206ab(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) {
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6(ArrayList<Integer> arr, int x) {
        int last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -1;
        int i = 0;
        for (Integer i1 : arr) {
            if (i1 == x) {
                last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6 = i1;
                break;
            }
            i++;
        }
        if (last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6 == -1) {
            last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -2;
        }
        return last_Problem_0_fb8cb9aa_7023_428e_aab1_97532cb193e6;
    }

    
    public static int last_Problem_2_353328fd_85e2_49ff_b087_2ce13ad8fecb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_bd111f30_61f9_4c72_a635_0233f531cfdc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_6677fdd7_e41e_4013_9d7e_67ee5b6420b6(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e6e6e140_4a20_4e99_a5bd_68c2f98202d7(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_a9573a48_999b_4a37_9d48_953029bae00b(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_c2635a16_aaec_459a_b728_7f70757fafb5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_4e368d4e_9c3d_42c4_b353_a5e36b70291f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_1932fb0e_214f_4c1a_b202_ea3d0ad73285(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_bce75abe_a813_4370_991a_51c2ed62d9ec(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6(ArrayList<Integer> arr, int x) {
        int last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -1;
        int i = 0;
        for (Integer i1 : arr) {
            if (i1 == x) {
                last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6 = i1;
                break;
            }
            i++;
        }
        if (last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6 == -1) {
            last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -2;
        }
        return last_Problem_1_fb8cb9aa_7023_428e_aab1_97532cb193e6;
    }

    
    public static int last_Problem_0_48b59d90_52b0_4b5b_9dcd_131d48bbc7a7(ArrayList<Integer> arr, int x) {
        int curr = 0;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                return curr;
            } else if (i > x) {
                prev = curr;
                curr++;
            }
        }
        return prev;
    }

    
    public static int last_Problem_0_7bac2d39_8429_4a71_b4f5_50ab437b2800(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_cb0ed624_ba32_4918_9713_ad40b429d49d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_cf51835d_5c7c_4d0f_a8b7_e710a6bd624e(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x && (mid == arr.size() - 1 || arr.get( mid + 1) != x)) {
                return mid;
            } else if (arr.get( mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_3548cf49_0558_463d_bb46_b0ea03405a5d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c7923bd0_d9a2_4993_afcb_8e5a7398d632(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_c7923bd0_d9a2_4993_afcb_8e5a7398d632IndexOf(x);
    }

    
    public static int last_Problem_1_0a3351c9_3314_41cd_8430_9263b4dd8b7a(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_0_af9d8e4a_a93e_4c45_9927_3aeb83b23e9e(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_821a0e7f_f65f_4deb_86fe_96b002f34e69(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size();
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (arr.get(mid) >= x) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return arr.get(hi);
    }

    
    public static int last_Problem_0_018ba840_3d5a_4c93_b4da_353f8f5afc25(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_22536d0c_a048_48dc_9418_9316eef29744(ArrayList<Integer> arr, int x) {
        int last_Problem_2_22536d0c_a048_48dc_9418_9316eef29744 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_2_22536d0c_a048_48dc_9418_9316eef29744 = i;
            }
        }
        return last_Problem_2_22536d0c_a048_48dc_9418_9316eef29744;
    }

    
    public static int last_Problem_0_a5daa8e8_2e66_4a15_a7a4_b2d35d203ef6(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_1d85980e_862c_4d8f_9273_144f47e8af3d(ArrayList<Integer> arr, int x) {
        // Your code here
        return 0;
    }

    
    public static int last_Problem_1_8ac69fbd_911d_4522_9621_9f695962a98d(ArrayList<Integer> arr, int x) {
        int s = 0;
        int e = arr.size() - 1;
        int m = -1;
        if(arr.get(0)==x)
            m = 0;
        else if(arr.get(e)==x)
            m = e;
        if(m==-1)
            return -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)==x){
                m = mid;
                break;
            }
            else if(arr.get(mid)<x)
                s = mid+1;
            else
                e = mid-1;
        }
        if(arr.get(m)==x)
            return m;
        else
            return -1;
    }

    
    public static int last_Problem_2_b59df95b_b4f1_4973_ba44_99105fbf9a80(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        for(;i>=0;i--) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_b5e8536f_dbcf_4a7c_a561_f3a9d498cfb0(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_836541d4_e3d0_4daa_b202_8338cdf9fe32(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_39fac3ed_28a3_43f5_886a_fecbab7e59ce(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_292c6064_1c74_4134_9df6_a1761dd89d39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d29d6a94_8968_43a6_892c_38cbd716c6b2(ArrayList<Integer> arr, int x) {
        int pos = 0;
        int temp = 0;
        boolean found = False;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                found = True;
                break;
            }
            if(arr.get(i) > x) {
                pos = i - 1;
                break;
            }
            if(arr.get(i) < x && found) {
                temp = arr.get(i);
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_c95b5b52_a29f_43ad_b8c2_e46c797746dd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_55203ee0_a8fa_43cb_a08a_199bfe07ca31(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(p -> p==x).mapToInteger(i -> i).max().orElse(0L);
    }

    
    public static int last_Problem_2_7b84b488_dd3c_4b09_811c_71a5ca4f43cc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b9aa6465_864c_4bb5_972d_0d6dd77fc6d6(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).count() - 1;
    }

    
    public static int last_Problem_0_11ae0026_3c8f_4d8d_9b2d_b5e6de87976e(ArrayList<Integer> arr, int x) {
        int result = -1;
        // Your code goes here
        int index = arr.size() - 1;
        while (index > -1) {
            if (x > arr.get(index)) {
                result = arr.get(index);
                index--;
            } else {
                result = arr.get(index);
                index--;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_3155d852_c240_4d02_9f02_85b76f498935(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        while (arr.get(j) != x && j < arr.size()) {
            j++;
        }
        return j;
    }

    
    public static int last_Problem_1_b61461a5_252d_4172_9eaa_3b6dce09364d(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_002fe08f_f25d_4005_ab9f_018b11df7f63(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return arr.get( l) == x ? l : -1;
    }

    
    public static int last_Problem_1_88c043f1_3f43_47b1_a5d3_9ee428b51f7a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_0a042d9a_de23_4820_ad46_7908714e47e1(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int last_Problem_0_16675bb1_66e5_4cf3_b9ad_884a0fb32267(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_72906c07_2dcd_4eb7_9547_239da3d9fe61(ArrayList<Integer> arr, int x) {
        // Complete this function
        int last_Problem_0_72906c07_2dcd_4eb7_9547_239da3d9fe61 = 0;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_0_72906c07_2dcd_4eb7_9547_239da3d9fe61 = i;
                break;
            }
        }
        return last_Problem_0_72906c07_2dcd_4eb7_9547_239da3d9fe61;
    }

    
    public static int last_Problem_2_79174da8_76a2_4d49_a56b_31a122513ff7(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_c2a920e5_1793_42b9_be34_903912abfffe(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_1c13425e_2795_4ea8_b00e_079e41dd1177(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e34589b5_707d_4756_8b71_05de9f87786a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_0_dea331c5_157b_4577_864d_dfa84eba43ea(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_dc94c8fa_6eb4_49fd_80be_be75eb6da5fc(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size()-1;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(x > arr.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_1_f2dc0ecf_84c1_4b5e_aa99_c4d97dc06095(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x && (m == arr.size() - 1 || arr.get(m + 1) != x)) {
                return m;
            } else if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d3249a2b_3a3f_43fe_89b8_f07a43444c65(ArrayList<Integer> arr, int x) {
        int result = 0;
        int len = arr.size();
        if(len == 0) {
            return result;
        }
        int i = len - 1;
        while(arr.get(i) != x) {
            i--;
        }
        return arr.get(i);
    }

    
    public static int last_Problem_0_5cb83a3e_4624_4d3f_966d_613eb4f54e3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_874c2813_a96c_4ede_8eed_ad4621c57d51(ArrayList<Integer> arr, int x) {
        // write your code here
        return arr.last_Problem_1_874c2813_a96c_4ede_8eed_ad4621c57d51IndexOf(x);
    }

    
    public static int last_Problem_1_337d53f0_f543_4e14_bbf7_d4ac788c16ce(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_b49b1dd2_dfd2_473e_a0a4_b2425e2096b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_309c0cc5_2866_4f6f_bc88_6b40ee019b7b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get( mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_d3c6a319_95b0_4730_9e61_6cfc8dd940b2(ArrayList<Integer> arr, int x) {
        int last_Problem_2_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 = arr.get(arr.size() - 1);
        if(last_Problem_2_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 == x)
            return arr.size() - 1;
        else {
            int low = 0, high = arr.size() - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(arr.get(mid) == x)
                    return mid;
                else if(arr.get(mid) < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_b19f654b_69c8_4179_88b7_a1720033fe07(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_60733e41_3ae3_4977_8915_1549e8483e37(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_1333f980_aba4_40ca_98d8_a5ec96fb4cbe(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i = 0; i < arr.size(); i++) {
            if (x < arr.get(i)) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_0_ee542cb8_f96f_4558_8793_2bcf1754e872(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_de15d18d_f4c6_44fe_92f2_8256783bbf26(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_62cbcdf4_4adc_4215_9e12_0c8ada8f314d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0;
        int r = arr.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_292c6064_1c74_4134_9df6_a1761dd89d39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_4a3962be_3d65_4a78_a813_685a92596f59(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_5e2ae708_58c2_4bf4_be6e_2aeac8585213(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_6b8bd222_ec56_4f1b_8787_d09b02b618b0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_6a1f68cd_ff1b_4b8b_a936_cb0af06adcc0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == n - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_20efe815_99db_4702_b3a2_b344e19e93df(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_d4b2945a_0fa9_4793_ab8b_8dfde2c93895(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_50474d07_1082_4508_ab72_5b4ddfe1b305(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_62eb0155_7a70_46c9_a2ce_1b327f8c1b47(ArrayList<Integer> arr, int x) {
        int last_Problem_0_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_0_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = i;
                break;
            }
        }
        return last_Problem_0_62eb0155_7a70_46c9_a2ce_1b327f8c1b47;
    }

    
    public static int last_Problem_1_a1a60e58_b0fd_4abd_a29a_93aa89502d5a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7a21ea0d_b86c_4168_a34c_0997f3eae4ae(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int last_Problem_0_8b8ec551_807a_4575_85a1_7730622f2b54(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3fc25ee6_d243_473f_ae7f_cd88ba8360b2(ArrayList<Integer> arr, int x) {
        // Your code here
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_c9b13011_3687_43bc_a265_5365644c2bc9(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_2403df6d_c244_4934_b055_2cadc63d3121(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l<=r) {
            int m = (l+r)/2;
            if(arr.get(m) == x) {
                return m;
            } else if(arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_d3249a2b_3a3f_43fe_89b8_f07a43444c65(ArrayList<Integer> arr, int x) {
        int result = 0;
        int len = arr.size();
        if(len == 0) {
            return result;
        }
        int i = len - 1;
        while(arr.get(i) != x) {
            i--;
        }
        return arr.get(i);
    }

    
    public static int last_Problem_2_61a40a10_5f2e_489d_b35b_5ddf42699040(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c724a76a_6742_4158_8a76_d50d0f2cef9e(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(element -> element == x).mapToInteger(element -> arr.indexOf(element)).max().orElse(-1);
    }

    
    public static int last_Problem_2_098f0446_08d6_4979_b742_62ee3ca9f3ef(ArrayList<Integer> arr, int x) {
        int last_Problem_2_098f0446_08d6_4979_b742_62ee3ca9f3ef = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_2_098f0446_08d6_4979_b742_62ee3ca9f3ef = i;
                break;
            }
            i--;
        }
        return last_Problem_2_098f0446_08d6_4979_b742_62ee3ca9f3ef;
    }

    
    public static int last_Problem_2_e682aa4c_a2c6_4809_a56b_7ade637fa024(ArrayList<Integer> arr, int x) {
        // your code goes here
        int i = arr.size() - 1;
        while(arr.get(i) != x)
            i--;
        return i;
    }

    
    public static int last_Problem_0_ec115ef7_4fbd_41ca_97cd_6e785f2bf111(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_b9daeb52_0a70_4825_8da9_ffa766d4e04b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d9cf8925_8756_4560_b17c_961d334c5eef(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if(size == 0) {
            return 0;
        }
        int index = arr.indexOf(x);
        return (index == size - 1)? (size - 1):(index + 1);
    }

    
    public static int last_Problem_0_f889c38d_9703_4378_bde9_95ac29e8f8a9(ArrayList<Integer> arr, int x) {
        // Complete this function
        int i = 0;
        while(arr.size() > 0) {
            i = arr.get(arr.size()-1);
            if(i < x) {
                arr.remove(arr.size()-1);
            }
            else {
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_0_002fe08f_f25d_4005_ab9f_018b11df7f63(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return arr.get( l) == x ? l : -1;
    }

    
    public static int last_Problem_2_b90e97e8_a764_42ec_9936_1de9b1e44bd0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_8233970c_dac1_47ba_b9f5_f4ca7a29fe90(ArrayList<Integer> arr, int x) {
        return arr.stream().max(Comparator.comparing(e -> -e)).get();
    }

    
    public static int last_Problem_0_c0a49c52_8f7e_4d87_9817_5e6e6d9789de(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_eea787a9_a489_43f1_9f81_682b7a6f5483(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e(ArrayList<Integer> arr, int x) {
        int last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e = 0;
        int last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e_index = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) < x) {
                last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e = arr.get(i);
                last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e_index = i;
            }
        }
        return last_Problem_0_c060952d_3789_4f94_9fbb_aa53278d113e_index;
    }

    
    public static int last_Problem_1_8ebe50bf_131f_40f4_8713_5807c7ab9369(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_f2dc0ecf_84c1_4b5e_aa99_c4d97dc06095(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x && (m == arr.size() - 1 || arr.get(m + 1) != x)) {
                return m;
            } else if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_a4c9fac2_ae37_4c65_878f_a07fffc9434c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f4e2583a_45f7_40f7_a136_b29d8e8a14f0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_1d7d7d28_a6a8_41f1_9e94_a27543cdccb0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_2ac31c87_90dd_46e9_887c_ce14f3467050(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        int n = arr.size() - 1;
        int low = 0, high = arr.size() - 1, mid;
        while(low < high) {
            mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(arr.get(low) < x) return 0;
        if(arr.get(high) < x) return arr.size();
        int count = high - low;
        if(arr.get(low) == x) return low;
        if(arr.get(high) == x) return high;
        return count;
    }

    
    public static int last_Problem_0_7d066944_4c57_42c6_9e2d_311e72905f15(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_53937142_08b6_400f_a5d1_84d90171de6a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_af7b7630_7432_4f16_af7c_e685536f988d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_bc58c357_8102_440e_a674_bc7bef78e5fd(ArrayList<Integer> arr, int x) {
        if(arr == null)
            throw new java.lang.NullPointerException();
        if(arr.size() < 1)
            throw new java.lang.IllegalArgumentException();
        int pos = arr.size() - 1;
        while(pos > -1 && arr.get(pos) != x) {
            pos--;
        }
        return pos;
    }

    
    public static int last_Problem_0_ff8c8cd4_ea24_4b2c_b18b_7d3df64ed250(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_22739e8b_0db7_41e1_9554_7dfae53860a2(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_f4e2583a_45f7_40f7_a136_b29d8e8a14f0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_50474d07_1082_4508_ab72_5b4ddfe1b305(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8db68208_c9e2_4553_985d_9ae0adf26462(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_57a03009_7155_4cec_929a_ddb040fbf689(ArrayList<Integer> arr, int x) {
        int last_Problem_0_57a03009_7155_4cec_929a_ddb040fbf689 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_0_57a03009_7155_4cec_929a_ddb040fbf689 = i;
            }
        }
        return last_Problem_0_57a03009_7155_4cec_929a_ddb040fbf689;
    }

    
    public static int last_Problem_2_4a3962be_3d65_4a78_a813_685a92596f59(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_84dc205f_f3f8_478f_b4eb_0995564a0ff5(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_74945b34_4155_4b6e_acfe_4ba577d9bcfb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_1_0d629ca2_9e26_4ada_ac0b_e3a93827bb90(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_18eae770_690c_4360_80e4_ae321571c23a(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) > x) {
                hi = mid - 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_842dc179_4000_4d64_ae69_a9dc051a10b2(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_eff4f6db_ec1f_4ead_812d_0fab92945004(ArrayList<Integer> arr, int x) {
        int pos = -1;
        int size = arr.size();
        for(int i = 0; i < size; ++i) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_daaf1587_ebbf_4933_8ac1_ad80e2ff0515(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_9ddfce47_1d61_4125_a1ef_542162606ce4(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_c724a76a_6742_4158_8a76_d50d0f2cef9e(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(element -> element == x).mapToInteger(element -> arr.indexOf(element)).max().orElse(-1);
    }

    
    public static int last_Problem_2_aa3ae3f8_a189_4f52_b850_25be7646697f(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len < 1) return -1;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_val = arr.get(mid);
            if (x == mid_val) return mid;
            if (x < mid_val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_cddae996_6bb9_4b13_bb64_41280946ff46(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).reduce((a, b) -> b).orElse(0);
    }

    
    public static int last_Problem_2_a7809d89_9172_4975_bc29_5cc5f739103b(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_2f8a7f23_4d75_499a_a89f_8a8edb6961d8(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_5587a248_5702_4b05_a300_f88aee138413(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return arr.get(lo) == x ? lo : -1;
    }

    
    public static int last_Problem_2_549238cb_4e59_4cb1_a4ab_0346d0ee056e(ArrayList<Integer> arr, int x) {
        int pos = arr.size();
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_c0a147e8_8ff3_4c86_86f6_a914351d13fe(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_13509cd6_14ac_48a7_9806_1f960b350f56(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_7d454a91_457d_46fc_bf51_8edb2ea0f6bb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_58d0056e_0008_4178_a7fc_94e735515c2e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_cb6273ff_3baa_4cd2_8b43_e071ee6ec4b5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b61461a5_252d_4172_9eaa_3b6dce09364d(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_cf51835d_5c7c_4d0f_a8b7_e710a6bd624e(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x && (mid == arr.size() - 1 || arr.get( mid + 1) != x)) {
                return mid;
            } else if (arr.get( mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_6fd3a496_3561_4dc9_bb9c_6eb443a40417(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_6fd3a496_3561_4dc9_bb9c_6eb443a40417IndexOf(x);
    }

    
    public static int last_Problem_2_bc85d3d9_1770_417e_9f29_c0e08490b45e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_502b50c0_c53c_41ed_a5da_0c36346ed3ca(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(high);
    }

    
    public static int last_Problem_1_7fa02dbf_7692_4164_a50d_09bbf869eb0a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_b90e97e8_a764_42ec_9936_1de9b1e44bd0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e97eae71_d9c0_4634_92b8_926512dda039(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m + 1 < arr.size() && arr.get(m + 1) == x) {
                    l = m + 1;
                } else {
                    return m;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_e2ecbe37_da6e_4ee6_abc8_1b92da4ed2d6(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_dc94c8fa_6eb4_49fd_80be_be75eb6da5fc(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size()-1;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(x > arr.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_2_7a21ea0d_b86c_4168_a34c_0997f3eae4ae(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int last_Problem_2_bcb50e18_2581_4679_b206_41c48fd1acba(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_679b115a_84fa_4d4e_ae46_b2e2a8a69f33(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1d85980e_862c_4d8f_9273_144f47e8af3d(ArrayList<Integer> arr, int x) {
        // Your code here
        return 0;
    }

    
    public static int last_Problem_0_bb75eba3_3fbc_4969_96fc_9dbcc9cf3ead(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( (m + 1)) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_7bac2d39_8429_4a71_b4f5_50ab437b2800(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_495975d8_e239_4c6c_a7a2_c157801b1fa1(ArrayList<Integer> arr, int x) {
        int result = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_47364b39_ce50_432a_b32f_1bc82e5bba14(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6aa0f7b2_dc5a_4016_a080_c3d4fd1cdfa6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_400c8a03_0144_440b_8af2_2eb8e7302043(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_2_df519f29_2d14_4ee4_80f1_13362e5e0c85(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_a14dc716_0f3a_4990_8e4a_5acf5b722194(ArrayList<Integer> arr, int x) {
        int last_Problem_0_a14dc716_0f3a_4990_8e4a_5acf5b722194 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_0_a14dc716_0f3a_4990_8e4a_5acf5b722194 = i;
            }
        }
        return last_Problem_0_a14dc716_0f3a_4990_8e4a_5acf5b722194;
    }

    
    public static int last_Problem_1_df3cd36b_efce_4cfe_9695_48ba8551c17e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_3c04ac97_cfd6_4261_aefb_32610d36ea39(ArrayList<Integer> arr, int x) {
        int l = arr.get(0);
        int r = arr.get(arr.size() - 1);
        int j = 0;
        while (j < arr.size() && arr.get(j) <= l) {
            j++;
        }
        int i = arr.size() - 1;
        while (j < arr.size() && arr.get(i) <= r) {
            i--;
        }
        return i < j ? -1 : i;
    }

    
    public static int last_Problem_0_8ac69fbd_911d_4522_9621_9f695962a98d(ArrayList<Integer> arr, int x) {
        int s = 0;
        int e = arr.size() - 1;
        int m = -1;
        if(arr.get(0)==x)
            m = 0;
        else if(arr.get(e)==x)
            m = e;
        if(m==-1)
            return -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)==x){
                m = mid;
                break;
            }
            else if(arr.get(mid)<x)
                s = mid+1;
            else
                e = mid-1;
        }
        if(arr.get(m)==x)
            return m;
        else
            return -1;
    }

    
    public static int last_Problem_1_2d2e659b_6338_4fbe_9fc1_213eee228e72(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        int last_Problem_0_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = 0;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        if (i >= 0) {
            last_Problem_0_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = i;
        }
        return last_Problem_0_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c;
    }

    
    public static int last_Problem_1_b90e97e8_a764_42ec_9936_1de9b1e44bd0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_3c6d5112_dcb7_4b2d_b7bc_5b3159e80626(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_2a443942_cf1e_4cec_b4c6_ad2eff8ece4a(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_2a443942_cf1e_4cec_b4c6_ad2eff8ece4aIndexOf(x);
    }

    
    public static int last_Problem_0_64fee577_02ec_4f94_880b_f38f72a384a5(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) > x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_53937142_08b6_400f_a5d1_84d90171de6a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_679b115a_84fa_4d4e_ae46_b2e2a8a69f33(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_ab51dff6_61ee_4fac_aa46_e1ec0c6d3279(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_588029d5_fd92_49a2_a622_56dbac1a7e1e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_87939d82_bdd5_4c79_a2c0_c814c33efe81(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e(ArrayList<Integer> arr, int x) {
        int last_Problem_1_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_1_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e = i;
                break;
            }
        }
        return last_Problem_1_ccf0aa43_c9bb_42dc_870c_4ced6bdcf36e;
    }

    
    public static int last_Problem_1_0c4af3eb_d781_4de6_b757_ba7595f363fb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        if (arr.get(r) == x) return r;
        else return -1;
    }

    
    public static int last_Problem_1_7f599edf_b38b_4e7a_8802_4d7582d19c24(ArrayList<Integer> arr, int x) {
        return (arr.get((arr.size() - 1) / 2) > x) ? arr.get((arr.size() - 1) / 2) : arr.get((arr.size() - 1) / 2);
    }

    
    public static int last_Problem_1_8c651095_a50a_4fbf_9854_319248d87cc7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_1d7d7d28_a6a8_41f1_9e94_a27543cdccb0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_000bc47d_c601_4e43_b47a_db037adbfc09(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_f34a70d0_0d94_4992_9eca_35c19c23c3e9(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_fecb1b25_1dd3_4eb6_bb03_0d29e7897bca(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int p1 = size - 1;
        int p2 = size;
        while (p1 >= 0 && p2 >= 0) {
            if (x == arr.get(p1)) {
                return p1;
            }
            if (x == arr.get(p2)) {
                return p2;
            }
            p1--;
            p2++;
        }
        return -1;
    }

    
    public static int last_Problem_1_550eae7d_a009_42b4_a5bc_f8f47ad3a184(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) {
            return -1;
        }
        int index = Arrays.binarySearch(arr.toArray(), x);
        if (index < 0) {
            index = -index - 1;
        }
        if (arr.get(index) == x) {
            return arr.get(index);
        }
        if (index == 0) {
            return arr.get(arr.size() - 1);
        }
        if (index == arr.size() - 1) {
            return arr.get(index - 1);
        }
        return arr.get(index - 1);
    }

    
    public static int last_Problem_2_7f3ebc3a_60b3_456d_bf23_ca3a6ae59b0b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int i = n - 1;
        while (arr.get(i) != x && i >= 0) {
            i--;
        }
        return i + 1;
    }

    
    public static int last_Problem_1_bef5b4cd_0620_4909_8be8_7113d79e033e(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size()-1;
        int mid = (start+end)/2;
        while(arr.get(mid) < x) {
            mid = mid + 1;
        }
        if(x > arr.get(mid)) {
            return mid;
        } else {
            return mid - 1;
        }
    }

    
    public static int last_Problem_2_a14dc716_0f3a_4990_8e4a_5acf5b722194(ArrayList<Integer> arr, int x) {
        int last_Problem_2_a14dc716_0f3a_4990_8e4a_5acf5b722194 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_2_a14dc716_0f3a_4990_8e4a_5acf5b722194 = i;
            }
        }
        return last_Problem_2_a14dc716_0f3a_4990_8e4a_5acf5b722194;
    }

    
    public static int last_Problem_1_60fc67ec_be6c_4b89_b1b4_9a059cb01db4(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int j = arr.size() - 1; j >= 0; --j) {
            if(arr.get(j) == x) {
                i = j;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_1_70dec87b_fc95_4c40_9c3a_0d791e582322(ArrayList<Integer> arr, int x) {
        int index = arr.stream().mapToInteger(e -> e).max().orElse(-1);
        System.out.println(index);
        return index;
    }

    
    public static int last_Problem_2_f5d76352_22a1_4fee_9fa4_cb5599530dca(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size() - 1) == x ? arr.size() - 1 : arr.last_Problem_2_f5d76352_22a1_4fee_9fa4_cb5599530dcaIndexOf(x);
    }

    
    public static int last_Problem_1_0b6312bc_bd72_4459_8b03_0d253220f6f8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_04b6d436_5396_4761_948c_4f7990b148a9(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_63db8319_d9cb_4d53_94c5_de17f1be1ba8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_ce19053b_5357_4ca6_9f29_e825bdd6baf2(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_0_e8255dc6_aedf_4350_993e_548713d3c22c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size()-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==x){
                ans = mid;
                low = mid+1;
            }
            else if(arr.get(mid)<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_a93a3a0d_2f44_489b_9fb3_046835c48003(ArrayList<Integer> arr, int x) {
        int pos = arr.size()-1;
        int index = arr.indexOf(x);
        if(index==-1)
            return pos;
        else
            return Math.min(arr.get(index), pos);
    }

    
    public static int last_Problem_0_b0aba73a_c114_4fbc_908f_bed1690c698b(ArrayList<Integer> arr, int x) {
        int i = 0, j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                return arr.get(mid);
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_842dc179_4000_4d64_ae69_a9dc051a10b2(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (x < arr.get(mid)) {
                high = mid - 1;
            } else if (x > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_e9a71d42_6907_46f1_9e4c_b2de7ab206ab(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) {
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_3fc25ee6_d243_473f_ae7f_cd88ba8360b2(ArrayList<Integer> arr, int x) {
        // Your code here
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_62eb0155_7a70_46c9_a2ce_1b327f8c1b47(ArrayList<Integer> arr, int x) {
        int last_Problem_1_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_1_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = i;
                break;
            }
        }
        return last_Problem_1_62eb0155_7a70_46c9_a2ce_1b327f8c1b47;
    }

    
    public static int last_Problem_0_6fd3a496_3561_4dc9_bb9c_6eb443a40417(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_6fd3a496_3561_4dc9_bb9c_6eb443a40417IndexOf(x);
    }

    
    public static int last_Problem_0_22739e8b_0db7_41e1_9554_7dfae53860a2(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_febe6e87_bf03_4759_bda2_d0a6dff4cbef(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d4b2945a_0fa9_4793_ab8b_8dfde2c93895(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c65d6b1c_1332_49f5_9e67_940755982c36(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if (size == 0) return 0;
        int lower = 0;
        int upper = size - 1;
        int mid = 0;
        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (arr.get(mid) < x) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return (lower == 0) ? arr.get(0) : arr.get(lower - 1);
    }

    
    public static int last_Problem_0_fad7e13b_4f68_44d2_a8a4_239667700699(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr.get(mid)) {
                ret = mid;
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ret;
    }

    
    public static int last_Problem_2_11af1647_f5dc_4fa4_9b5a_dda76a925661(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int last_Problem_2_11af1647_f5dc_4fa4_9b5a_dda76a925661 = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                last_Problem_2_11af1647_f5dc_4fa4_9b5a_dda76a925661 = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return last_Problem_2_11af1647_f5dc_4fa4_9b5a_dda76a925661;
    }

    
    public static int last_Problem_2_a6dcb9b4_82c1_4561_af7b_fda6dd689244(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_2_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_2_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = i;
            }
        }
        return last_Problem_2_a6dcb9b4_82c1_4561_af7b_fda6dd689244;
    }

    
    public static int last_Problem_0_2a443942_cf1e_4cec_b4c6_ad2eff8ece4a(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_2a443942_cf1e_4cec_b4c6_ad2eff8ece4aIndexOf(x);
    }

    
    public static int last_Problem_1_1a507574_4493_4ddf_b036_b3a1f73ddb56(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_2a588641_921e_4733_ad46_09a568b073cb(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_0d629ca2_9e26_4ada_ac0b_e3a93827bb90(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_019ee778_ff90_4a6a_8231_15254d318c3b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_2403df6d_c244_4934_b055_2cadc63d3121(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l<=r) {
            int m = (l+r)/2;
            if(arr.get(m) == x) {
                return m;
            } else if(arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_b6b2588d_38c1_483c_a406_e90064dce7bc(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_77b5d592_f21e_4852_acd5_b66df49a263a(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_8a033d42_2686_43e1_b30c_b642c4d972d7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_da043d39_96dc_4bf5_9c1b_2258489e1985(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int len = arr.size();
        return (arr.get(len - 1) == x) ? len - 1 : -1;
    }

    
    public static int last_Problem_2_fa3d7322_fcda_4f24_912c_8005ba4ee44d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_1_14e74fbb_fcc4_45c9_86bf_75ece4e400b8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int mid;
        while (start < end) {
            mid = (end + start) / 2;
            if (arr.get(mid) == x) {
                end = mid;
            }
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr.get(end);
    }

    
    public static int last_Problem_2_3155d852_c240_4d02_9f02_85b76f498935(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        while (arr.get(j) != x && j < arr.size()) {
            j++;
        }
        return j;
    }

    
    public static int last_Problem_0_e45ebd07_9081_4f02_baf0_71e47fdf3cde(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_bebae750_9b58_4880_b626_61cd509a2cd8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_461be40f_778e_42fe_8ef3_d187afb07870(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int last_Problem_1_6a83aefd_9a8b_448b_b635_f7dac531074b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_6677fdd7_e41e_4013_9d7e_67ee5b6420b6(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7999aea1_5b2b_4f54_97c8_0516408e2b68(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_827e8487_49b4_43de_bf08_31abff79738d(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int l = 0, r = size - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) < x) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_2_64fee577_02ec_4f94_880b_f38f72a384a5(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) > x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_fd845f86_2ae9_4002_8a03_d968fdb927dd(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_3d6c0276_cc50_4002_af7c_8835c982e5c8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_b9daeb52_0a70_4825_8da9_ffa766d4e04b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_4f163a4e_3dda_4c6f_ac36_cb6d4b0f9d9e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ddd9739e_ad5d_405f_92c7_b69c3a77d412(ArrayList<Integer> arr, int x) {
        int last_Problem_0_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_0_ddd9739e_ad5d_405f_92c7_b69c3a77d412 = i;
            }
        }
        return last_Problem_0_ddd9739e_ad5d_405f_92c7_b69c3a77d412;
    }

    
    public static int last_Problem_0_166b9c65_02ba_490a_89ad_847af87be89d(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while(i>=0 && arr.get(i)>x)
            i--;
        return i+1;
    }

    
    public static int last_Problem_2_ebbc1a0b_587d_4923_80e1_1c4aab5edb10(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_f80bf4b8_7798_441e_b06e_7e436b0de32b(ArrayList<Integer> arr, int x) {
        int last_Problem_2_f80bf4b8_7798_441e_b06e_7e436b0de32b = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_2_f80bf4b8_7798_441e_b06e_7e436b0de32b = i;
                break;
            }
            i--;
        }
        return last_Problem_2_f80bf4b8_7798_441e_b06e_7e436b0de32b;
    }

    
    public static int last_Problem_1_c83971f5_d6c4_48df_8782_04ff70305c3b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_74945b34_4155_4b6e_acfe_4ba577d9bcfb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_1_d7eafbc3_9ac6_4002_9dd7_80855ef6dbcb(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_ef8d799a_11f3_4b49_9a51_9bf5714bd4b6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return (l - 1);
    }

    
    public static int last_Problem_1_9b4b62f0_a5cd_4393_bded_1050c9add3f7(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_679b115a_84fa_4d4e_ae46_b2e2a8a69f33(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_0633b65a_910d_4893_a1fc_da0cc98fa359(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_0633b65a_910d_4893_a1fc_da0cc98fa359IndexOf(x);
    }

    
    public static int last_Problem_2_a022d1c1_6c0b_4a9a_b48b_b6c215e21ef8(ArrayList<Integer> arr, int x) {
        int index = arr.indexOf(x);
        if(index == -1) {
            return -1;
        }
        int len = arr.size();
        while(index > 0 && arr.get(index-1) == x) {
            index--;
        }
        return index == -1 ? -1 : arr.get(index);
    }

    
    public static int last_Problem_0_480454da_1ed7_4fbf_b00d_4875c66b05e2(ArrayList<Integer> arr, int x) {
        int result = 0;
        for(int i = arr.size()-1;i>=0;i--) {
            if(arr.get(i)==x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17(ArrayList<Integer> arr, int x) {
        int pos = arr.last_Problem_2_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17IndexOf(x);
        return arr.get(pos);
    }

    
    public static int last_Problem_1_31fc6182_0b76_4650_bc95_7f4212ea7093(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_88c043f1_3f43_47b1_a5d3_9ee428b51f7a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_571fa508_fb61_41e0_bbd1_7e4df5cb21e4(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_47fb6415_7c67_4792_a5d5_86a8ca0b7e3f(ArrayList<Integer> arr, int x) {
        if(arr.size() == 1) return arr.get(0);
        if(arr.size() == 0) return -1;
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while(low < high) {
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
            mid = (low + high) / 2;
        }
        if(arr.get(mid) < x) return mid;
        if(arr.get(mid) > x) return mid - 1;
        else return mid;
    }

    
    public static int last_Problem_0_2268d031_fb77_4d94_b1c5_589b5fa567c6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ea9692d9_2ee2_4893_b08f_8d09adcf761a(ArrayList<Integer> arr, int x) {
        int last_Problem_0_ea9692d9_2ee2_4893_b08f_8d09adcf761a = -1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_0_ea9692d9_2ee2_4893_b08f_8d09adcf761a = i;
                break;
            }
        }
        return last_Problem_0_ea9692d9_2ee2_4893_b08f_8d09adcf761a;
    }

    
    public static int last_Problem_1_deea75a0_f89f_4f2e_9df9_48629749a481(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }

    
    public static int last_Problem_1_3c04ac97_cfd6_4261_aefb_32610d36ea39(ArrayList<Integer> arr, int x) {
        int l = arr.get(0);
        int r = arr.get(arr.size() - 1);
        int j = 0;
        while (j < arr.size() && arr.get(j) <= l) {
            j++;
        }
        int i = arr.size() - 1;
        while (j < arr.size() && arr.get(i) <= r) {
            i--;
        }
        return i < j ? -1 : i;
    }

    
    public static int last_Problem_0_6b75da69_e819_4c5d_8e9f_f5ce21d7ccfe(ArrayList<Integer> arr, int x) {
        int i;
        for(i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x)
                return i;
        }
        return -1;
    }

    
    public static int last_Problem_1_b21a466e_89ba_441c_aec8_eabfe1957841(ArrayList<Integer> arr, int x) {
        int index = 0;
        for(int i : arr) {
            if(i == x) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    
    public static int last_Problem_2_3d6c0276_cc50_4002_af7c_8835c982e5c8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_a1831691_e53e_4445_8366_92610f85b637(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_337d53f0_f543_4e14_bbf7_d4ac788c16ce(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_5328d9c9_33cc_4538_830e_f961e3c24521(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_1_47e52c74_382a_4d45_a20f_238976d657dc(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_93b8f1ed_4b5d_419c_abb5_870d4dcc559a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_0_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_0_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = i;
            }
        }
        return last_Problem_0_93b8f1ed_4b5d_419c_abb5_870d4dcc559a;
    }

    
    public static int last_Problem_0_dbbc166d_49b1_4edc_a651_7ead0e358677(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_87939d82_bdd5_4c79_a2c0_c814c33efe81(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_90c699f2_3518_49e6_a32d_c04165177df8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        if (arr.get(start) != x) {
            while (arr.get(start) < x && start < end) {
                start++;
            }
            start--;
        }
        while (arr.get(end) > x && start < end) {
            end--;
        }
        return (start + 1);
    }

    
    public static int last_Problem_0_85bdd37c_a72d_45e9_9ca6_e82614d8a6be(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_5e2e16a7_f7fc_453f_b0ac_9a867c883518(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_be822927_f721_4d9f_bfc2_ba2a8425a5df(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e(ArrayList<Integer> arr, int x) {
        int last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e = 0;
        int last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e_index = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) < x) {
                last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e = arr.get(i);
                last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e_index = i;
            }
        }
        return last_Problem_1_c060952d_3789_4f94_9fbb_aa53278d113e_index;
    }

    
    public static int last_Problem_0_6ec43528_9399_45ac_99e3_e3ddc9de9b0d(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int index = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            ret = arr.get(index);
        }
        return ret;
    }

    
    public static int last_Problem_0_e2ecbe37_da6e_4ee6_abc8_1b92da4ed2d6(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_bce75abe_a813_4370_991a_51c2ed62d9ec(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_7d454a91_457d_46fc_bf51_8edb2ea0f6bb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d7eafbc3_9ac6_4002_9dd7_80855ef6dbcb(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_b9daeb52_0a70_4825_8da9_ffa766d4e04b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e2df3a08_424d_4c55_9ea3_5db56c05506a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_4f163a4e_3dda_4c6f_ac36_cb6d4b0f9d9e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ce19053b_5357_4ca6_9f29_e825bdd6baf2(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_1_25863240_3b49_4c75_85fe_e73cc9512ac2(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0) return -1;
        int i = arr.size()-1;
        while(i >= 0 && arr.get(i) > x) i--;
        return i;
    }

    
    public static int last_Problem_1_9b0fc5ab_4851_4336_9d05_9741afc417c7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_e0d792e8_04fb_4511_bcd6_9f1b8c89ed2b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = 0;
        while (l <= r) {
            mid = (r - l) / 2 + l;
            if (x > arr.get(mid)) {
                l = mid + 1;
            } else if (x < arr.get(mid)) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_c65d6b1c_1332_49f5_9e67_940755982c36(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if (size == 0) return 0;
        int lower = 0;
        int upper = size - 1;
        int mid = 0;
        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (arr.get(mid) < x) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return (lower == 0) ? arr.get(0) : arr.get(lower - 1);
    }

    
    public static int last_Problem_1_65fcdde4_ace0_4fca_8f99_1d7c4d642db1(ArrayList<Integer> arr, int x) {
        if (arr == null || arr.size() == 0) return -1;
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (arr.get(left) == x) {
            return left;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_7d44bc3f_4aa3_45b0_aa50_b49796d3e561(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x)
                l = m;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_0_3661323b_d253_46ef_8670_3743ad986b22(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_0_61a54374_1e54_4015_8838_efc32f14c466(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return -1;
        int low = 0, high = arr.size() - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else if(arr.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_5cb83a3e_4624_4d3f_966d_613eb4f54e3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8ac69fbd_911d_4522_9621_9f695962a98d(ArrayList<Integer> arr, int x) {
        int s = 0;
        int e = arr.size() - 1;
        int m = -1;
        if(arr.get(0)==x)
            m = 0;
        else if(arr.get(e)==x)
            m = e;
        if(m==-1)
            return -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)==x){
                m = mid;
                break;
            }
            else if(arr.get(mid)<x)
                s = mid+1;
            else
                e = mid-1;
        }
        if(arr.get(m)==x)
            return m;
        else
            return -1;
    }

    
    public static int last_Problem_1_8b2007dd_6d0f_4cdb_8b83_27440321fb01(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_0_3d68b9a9_e686_453a_b1c7_23f10769c158(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_1672e808_8425_4d8f_a35e_7a7493aa0327(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_0_58d573f8_876b_4fac_b766_0e39f93630dd(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_2_103e9610_121a_41ac_97e4_fa35fd626294(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_103e9610_121a_41ac_97e4_fa35fd626294IndexOf(x);
    }

    
    public static int last_Problem_2_ba5c8beb_59aa_45a7_a10d_aa05c9dba8ef(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_01137d93_dccc_4628_91a5_7ba7ff58628e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_c4d49d66_709c_4d8a_897c_2fcf15492f66(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_019ee778_ff90_4a6a_8231_15254d318c3b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_be822927_f721_4d9f_bfc2_ba2a8425a5df(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_9214b0fd_7cf3_4a57_a991_a5b4ff74fe4b(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_819c0ef1_724c_43e6_a101_f74ccee543e5(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int pos = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_2_eee27aba_fe70_4dd5_9dc4_4696d15af36b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_9d58161d_4398_45b9_88b8_532df8e6e15b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14ae(ArrayList<Integer> arr, int x) {
        int last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = 0;
        int last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = arr.get(0);
        int currentVal = arr.get(0);
        int last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = 0;
        for(int i = 1; i < arr.size(); i++) {
            currentVal = arr.get(i);
            if(currentVal < x) {
                last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = i;
                last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = currentVal;
                last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = i;
            }
        }
        return last_Problem_1_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos;
    }

    
    public static int last_Problem_1_571fa508_fb61_41e0_bbd1_7e4df5cb21e4(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_6507eba7_7b2e_43f0_ae4d_b321255d9839(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(Integer l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int last_Problem_1_0633d219_742c_42e8_89c6_4af66335fced(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_55203ee0_a8fa_43cb_a08a_199bfe07ca31(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(p -> p==x).mapToInteger(i -> i).max().orElse(0L);
    }

    
    public static int last_Problem_0_8f43ecc2_6bba_4b10_be12_5a13415d1b10(ArrayList<Integer> arr, int x) {
        int i = -1;
        for (int i1 = arr.size() - 1; i1 >= 0; i1--) {
            int num = arr.get(i1);
            if (num == x) {
                i = i1;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_2_7f599edf_b38b_4e7a_8802_4d7582d19c24(ArrayList<Integer> arr, int x) {
        return (arr.get((arr.size() - 1) / 2) > x) ? arr.get((arr.size() - 1) / 2) : arr.get((arr.size() - 1) / 2);
    }

    
    public static int last_Problem_1_1d85980e_862c_4d8f_9273_144f47e8af3d(ArrayList<Integer> arr, int x) {
        // Your code here
        return 0;
    }

    
    public static int last_Problem_0_8544fa95_9226_45c7_91bc_2b089c6b4dbc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_cb6273ff_3baa_4cd2_8b43_e071ee6ec4b5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_999f6ac8_969a_4ef4_9b61_fdb7a7ec04b0(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_549238cb_4e59_4cb1_a4ab_0346d0ee056e(ArrayList<Integer> arr, int x) {
        int pos = arr.size();
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_461be40f_778e_42fe_8ef3_d187afb07870(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int last_Problem_2_33c458a7_debb_452b_98fd_42e7cc5bd5c9(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_79174da8_76a2_4d49_a56b_31a122513ff7(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_29605a86_a628_4d33_81c8_f1775e98869b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ce19053b_5357_4ca6_9f29_e825bdd6baf2(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_0_cfb2aae7_c9b8_4b47_a8c8_8f8a7f3f7abc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f3e460eb_e03c_4942_9d1f_00f99f0cddc0(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_5fd27f98_16cb_4ec3_83c8_d245dc88808b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid;
        }
        if (arr.get(l) == x)
            return l;
        return -1;
    }

    
    public static int last_Problem_2_ee542cb8_f96f_4558_8793_2bcf1754e872(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5d8bb930_79c3_4f39_903b_f3e2afe6c825(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_157408c7_a9aa_4d3f_aeaa_b91a10fea01a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_4e368d4e_9c3d_42c4_b353_a5e36b70291f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_22739e8b_0db7_41e1_9554_7dfae53860a2(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_8b8ec551_807a_4575_85a1_7730622f2b54(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_e97eae71_d9c0_4634_92b8_926512dda039(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m + 1 < arr.size() && arr.get(m + 1) == x) {
                    l = m + 1;
                } else {
                    return m;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_13509cd6_14ac_48a7_9806_1f960b350f56(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_2403df6d_c244_4934_b055_2cadc63d3121(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l<=r) {
            int m = (l+r)/2;
            if(arr.get(m) == x) {
                return m;
            } else if(arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6b93bae2_a328_4651_bb1e_e66622117115(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0)
            return -1;
        int left = 0, right = arr.size() - 1, mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr.get(mid) == x)
                return mid;
            if(arr.get(mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_999f6ac8_969a_4ef4_9b61_fdb7a7ec04b0(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_bc58c357_8102_440e_a674_bc7bef78e5fd(ArrayList<Integer> arr, int x) {
        if(arr == null)
            throw new java.lang.NullPointerException();
        if(arr.size() < 1)
            throw new java.lang.IllegalArgumentException();
        int pos = arr.size() - 1;
        while(pos > -1 && arr.get(pos) != x) {
            pos--;
        }
        return pos;
    }

    
    public static int last_Problem_0_bebae750_9b58_4880_b626_61cd509a2cd8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_62cbcdf4_4adc_4215_9e12_0c8ada8f314d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0;
        int r = arr.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_60733e41_3ae3_4977_8915_1549e8483e37(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_6fd3a496_3561_4dc9_bb9c_6eb443a40417(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_6fd3a496_3561_4dc9_bb9c_6eb443a40417IndexOf(x);
    }

    
    public static int last_Problem_1_12f54fd8_847c_4e73_9fd0_b4c68afb690d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_5f04c213_80a6_4c99_b578_04a32550db31(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_1e3812dd_71ed_4a5b_ac19_b399452b62cd(ArrayList<Integer> arr, int x) {
        return (arr.get(arr.size() - 1) == x) ? arr.size() - 1 : arr.last_Problem_2_1e3812dd_71ed_4a5b_ac19_b399452b62cdIndexOf(x);
    }

    
    public static int last_Problem_2_c036653c_7615_4099_b565_32629f612127(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_c65e0e32_c1d5_4186_9197_4c42c54c627c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_0a3351c9_3314_41cd_8430_9263b4dd8b7a(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_1_11492348_1fec_433e_9091_4b128de3ac59(ArrayList<Integer> arr, int x) {
        int i = arr.size();
        while (i > 0) {
            i--;
            if (arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8233970c_dac1_47ba_b9f5_f4ca7a29fe90(ArrayList<Integer> arr, int x) {
        return arr.stream().max(Comparator.comparing(e -> -e)).get();
    }

    
    public static int last_Problem_2_827e8487_49b4_43de_bf08_31abff79738d(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int l = 0, r = size - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) < x) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_2_480454da_1ed7_4fbf_b00d_4875c66b05e2(ArrayList<Integer> arr, int x) {
        int result = 0;
        for(int i = arr.size()-1;i>=0;i--) {
            if(arr.get(i)==x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_8b318709_cb9b_4477_a5e8_2f0d803b0833(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_9c360deb_0e8f_477b_80d5_77844a336021(ArrayList<Integer> arr, int x) {
        int last_Problem_2_9c360deb_0e8f_477b_80d5_77844a336021 = arr.size();
        for(int i = arr.size() - 1; i > -1; i--) {
            if(arr.get(i) == x) {
                last_Problem_2_9c360deb_0e8f_477b_80d5_77844a336021 = i;
                break;
            }
        }
        return last_Problem_2_9c360deb_0e8f_477b_80d5_77844a336021;
    }

    
    public static int last_Problem_2_eea787a9_a489_43f1_9f81_682b7a6f5483(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_febe6e87_bf03_4759_bda2_d0a6dff4cbef(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_b9aa6465_864c_4bb5_972d_0d6dd77fc6d6(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).count() - 1;
    }

    
    public static int last_Problem_0_a98714e0_c0a7_4437_b72d_41d0e6ae5549(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_166b9c65_02ba_490a_89ad_847af87be89d(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while(i>=0 && arr.get(i)>x)
            i--;
        return i+1;
    }

    
    public static int last_Problem_2_99b3f187_fc94_453b_850b_ec249a46b5f1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_13509cd6_14ac_48a7_9806_1f960b350f56(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d5056366_3ba2_49bd_ac7e_2ed10a61028f(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_e45ebd07_9081_4f02_baf0_71e47fdf3cde(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4f2004af_fdae_4e0d_ad59_41355fe0254a(ArrayList<Integer> arr, int x) {
        // Your code here
        int arrSize = arr.size();
        int low = 0, high = arrSize-1, mid;
        int index = arrSize-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr.get(mid)==x) {
                index = mid;
                break;
            } else if(arr.get(mid)<x) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return index;
    }

    
    public static int last_Problem_0_b36fa17b_23a8_44f6_aa3b_4217b29a7e75(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_b36fa17b_23a8_44f6_aa3b_4217b29a7e75IndexOf(x);
    }

    
    public static int last_Problem_1_2ac31c87_90dd_46e9_887c_ce14f3467050(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        int n = arr.size() - 1;
        int low = 0, high = arr.size() - 1, mid;
        while(low < high) {
            mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(arr.get(low) < x) return 0;
        if(arr.get(high) < x) return arr.size();
        int count = high - low;
        if(arr.get(low) == x) return low;
        if(arr.get(high) == x) return high;
        return count;
    }

    
    public static int last_Problem_0_e34589b5_707d_4756_8b71_05de9f87786a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_1_a1b55bff_4fef_4be0_9377_05450693b2d4(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            }
            else if (arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_40772e04_8782_4816_82a6_981147fef1b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        int last_Problem_1_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = 0;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        if (i >= 0) {
            last_Problem_1_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c = i;
        }
        return last_Problem_1_7b6ae2a6_236d_41d4_986c_5bc909c3ed0c;
    }

    
    public static int last_Problem_0_4b8ed2a8_5e25_4ea2_b8dd_4babeec3bf31(ArrayList<Integer> arr, int x) {
        return arr.size() - 1 - arr.indexOf(x);
    }

    
    public static int last_Problem_2_002fe08f_f25d_4005_ab9f_018b11df7f63(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return arr.get( l) == x ? l : -1;
    }

    
    public static int last_Problem_0_a1a60e58_b0fd_4abd_a29a_93aa89502d5a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_614142f8_3f3f_4a7e_87ce_7fd522574a1c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1932fb0e_214f_4c1a_b202_ea3d0ad73285(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_571fa508_fb61_41e0_bbd1_7e4df5cb21e4(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_f9edbaa3_6e03_4d26_9e4c_235ead83c114(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3476f474_e153_4b21_8287_3e25517e9176(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_d3c6a319_95b0_4730_9e61_6cfc8dd940b2(ArrayList<Integer> arr, int x) {
        int last_Problem_1_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 = arr.get(arr.size() - 1);
        if(last_Problem_1_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 == x)
            return arr.size() - 1;
        else {
            int low = 0, high = arr.size() - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(arr.get(mid) == x)
                    return mid;
                else if(arr.get(mid) < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_8b318709_cb9b_4477_a5e8_2f0d803b0833(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_849fa70d_6b69_4afd_b663_f74e1ec9b90d(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_7712da0d_b592_492e_995c_6522d194e209(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3222e569_8862_44f3_8b83_b252f7d18490(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_53225b9d_9f88_4f2d_890f_0acd94847fca(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_2_6a83aefd_9a8b_448b_b635_f7dac531074b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8b1c6961_1fc8_4cdc_8bc0_cf893588a787(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4e6f87e5_477f_4349_ac2d_35319f27b4ef(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_0633b65a_910d_4893_a1fc_da0cc98fa359(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_0633b65a_910d_4893_a1fc_da0cc98fa359IndexOf(x);
    }

    
    public static int last_Problem_1_9f801d77_c0a3_47d2_98cf_27ea2fb19d78(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = 0;
        int last_Problem_1_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = -1;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                ret = pos;
                last_Problem_1_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = i;
            }
            if (i > prev) {
                pos++;
            }
            prev = i;
        }
        return ret;
    }

    
    public static int last_Problem_2_ec115ef7_4fbd_41ca_97cd_6e785f2bf111(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_55203ee0_a8fa_43cb_a08a_199bfe07ca31(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(p -> p==x).mapToInteger(i -> i).max().orElse(0L);
    }

    
    public static int last_Problem_0_1a167626_83e1_4769_9c6a_5e19c5fb49a7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            }
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6a1f68cd_ff1b_4b8b_a936_cb0af06adcc0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == n - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d4f17061_613f_4198_b9a7_5f85285b071b(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int l = 0, r = arr.size()-1;
        while (l <= r) {
            int mid = (l+r) / 2;
            if (arr.get(mid).equals(x)) return mid;
            if (arr.get(mid) < x) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_bcb50e18_2581_4679_b206_41c48fd1acba(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_3b7af1a5_4a1b_4bb0_829c_57d4c4536a4e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_bdfb290c_97ff_40cb_b658_3d15a764a505(ArrayList<Integer> arr, int x) {
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) return index;
            index--;
        }
        return -1;
    }

    
    public static int last_Problem_2_a1a60e58_b0fd_4abd_a29a_93aa89502d5a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_dea331c5_157b_4577_864d_dfa84eba43ea(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_cf51835d_5c7c_4d0f_a8b7_e710a6bd624e(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x && (mid == arr.size() - 1 || arr.get( mid + 1) != x)) {
                return mid;
            } else if (arr.get( mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4fcfc69f_4263_46d1_8b9a_651d4333bd0e(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c0a49c52_8f7e_4d87_9817_5e6e6d9789de(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_47fb6415_7c67_4792_a5d5_86a8ca0b7e3f(ArrayList<Integer> arr, int x) {
        if(arr.size() == 1) return arr.get(0);
        if(arr.size() == 0) return -1;
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while(low < high) {
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
            mid = (low + high) / 2;
        }
        if(arr.get(mid) < x) return mid;
        if(arr.get(mid) > x) return mid - 1;
        else return mid;
    }

    
    public static int last_Problem_2_e85fe9e7_5b71_47dc_b894_e15ba49fc09d(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8b1c6961_1fc8_4cdc_8bc0_cf893588a787(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_2d2e659b_6338_4fbe_9fc1_213eee228e72(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_ec71e663_db5b_4809_8746_222db8841c30(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d9cf8925_8756_4560_b17c_961d334c5eef(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if(size == 0) {
            return 0;
        }
        int index = arr.indexOf(x);
        return (index == size - 1)? (size - 1):(index + 1);
    }

    
    public static int last_Problem_0_4f2004af_fdae_4e0d_ad59_41355fe0254a(ArrayList<Integer> arr, int x) {
        // Your code here
        int arrSize = arr.size();
        int low = 0, high = arrSize-1, mid;
        int index = arrSize-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr.get(mid)==x) {
                index = mid;
                break;
            } else if(arr.get(mid)<x) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return index;
    }

    
    public static int last_Problem_2_04b6d436_5396_4761_948c_4f7990b148a9(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e2df3a08_424d_4c55_9ea3_5db56c05506a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_a1831691_e53e_4445_8366_92610f85b637(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_c83971f5_d6c4_48df_8782_04ff70305c3b(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e8255dc6_aedf_4350_993e_548713d3c22c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size()-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==x){
                ans = mid;
                low = mid+1;
            }
            else if(arr.get(mid)<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_1333f980_aba4_40ca_98d8_a5ec96fb4cbe(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i = 0; i < arr.size(); i++) {
            if (x < arr.get(i)) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_6a70f410_204d_442a_8e52_7a802996335e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d695cedd_97dc_418c_958e_48625667978a(ArrayList<Integer> arr, int x) {
        // Your Function Here
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x)
                return i;
            i--;
        }
        return -1;
    }

    
    public static int last_Problem_2_72110bfc_102c_4160_baf0_e39d539924f4(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_eff4f6db_ec1f_4ead_812d_0fab92945004(ArrayList<Integer> arr, int x) {
        int pos = -1;
        int size = arr.size();
        for(int i = 0; i < size; ++i) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_74945b34_4155_4b6e_acfe_4ba577d9bcfb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_87f6432f_8342_433f_9a1f_0bc493cae970(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        if (i > 0) {
            return arr.get(i - 1);
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_fd845f86_2ae9_4002_8a03_d968fdb927dd(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_a98714e0_c0a7_4437_b72d_41d0e6ae5549(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_22536d0c_a048_48dc_9418_9316eef29744(ArrayList<Integer> arr, int x) {
        int last_Problem_1_22536d0c_a048_48dc_9418_9316eef29744 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_1_22536d0c_a048_48dc_9418_9316eef29744 = i;
            }
        }
        return last_Problem_1_22536d0c_a048_48dc_9418_9316eef29744;
    }

    
    public static int last_Problem_2_d4f17061_613f_4198_b9a7_5f85285b071b(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int l = 0, r = arr.size()-1;
        while (l <= r) {
            int mid = (l+r) / 2;
            if (arr.get(mid).equals(x)) return mid;
            if (arr.get(mid) < x) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_821a0e7f_f65f_4deb_86fe_96b002f34e69(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size();
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (arr.get(mid) >= x) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return arr.get(hi);
    }

    
    public static int last_Problem_1_61a40a10_5f2e_489d_b35b_5ddf42699040(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_018ba840_3d5a_4c93_b4da_353f8f5afc25(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_b97900e8_f34f_4609_892f_03663ce56772(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_c388ed57_bfa2_445f_bb9c_e4c34a2ba70a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_2_cb0ed624_ba32_4918_9713_ad40b429d49d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c323dad4_697c_4d2a_bf87_2372d7f4d327(ArrayList<Integer> arr, int x) {
        int last_Problem_1_c323dad4_697c_4d2a_bf87_2372d7f4d327 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_1_c323dad4_697c_4d2a_bf87_2372d7f4d327 = i;
            }
        }
        return last_Problem_1_c323dad4_697c_4d2a_bf87_2372d7f4d327;
    }

    
    public static int last_Problem_1_6aa0f7b2_dc5a_4016_a080_c3d4fd1cdfa6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_99912270_68c3_485b_b95a_18cac3fe1157(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_1f73c180_acc5_417f_a283_11083f181509(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_47e52c74_382a_4d45_a20f_238976d657dc(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_c9b13011_3687_43bc_a265_5365644c2bc9(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_8858644f_fc9e_45a2_971e_9284cb0223ab(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return i;
    }

    
    public static int last_Problem_1_b55cf356_3c2d_487c_99bb_ed6e450b7b4b(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start == arr.size() ? -1 : arr.get(start);
    }

    
    public static int last_Problem_2_15eff960_3331_42d6_8f5b_163cc2329376(ArrayList<Integer> arr, int x) {
        int last_Problem_2_15eff960_3331_42d6_8f5b_163cc2329376 = 0;
        int prev = 0;
        int len = arr.size();
        for(int i = 0; i < len; i++){
            if(arr.get(i) == x){
                last_Problem_2_15eff960_3331_42d6_8f5b_163cc2329376 = i;
            }
            if(arr.get(i) > x){
                prev = i;
            }
        }
        return last_Problem_2_15eff960_3331_42d6_8f5b_163cc2329376;
    }

    
    public static int last_Problem_2_6b75da69_e819_4c5d_8e9f_f5ce21d7ccfe(ArrayList<Integer> arr, int x) {
        int i;
        for(i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) == x)
                return i;
        }
        return -1;
    }

    
    public static int last_Problem_0_1333f980_aba4_40ca_98d8_a5ec96fb4cbe(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i = 0; i < arr.size(); i++) {
            if (x < arr.get(i)) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_e2ecbe37_da6e_4ee6_abc8_1b92da4ed2d6(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_48d39480_10f8_40a4_8292_8b044bc0f2cf(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_46c7a12e_9972_4bca_884d_565add4a24d5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_a0ad35b9_a13e_42d7_a093_390350a2e2ee(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_400c8a03_0144_440b_8af2_2eb8e7302043(ArrayList<Integer> arr, int x) {
        return arr.indexOf(x);
    }

    
    public static int last_Problem_1_90cc39e8_9bd9_4b10_b859_7382d4c4bc0f(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b59df95b_b4f1_4973_ba44_99105fbf9a80(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        for(;i>=0;i--) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6a83aefd_9a8b_448b_b635_f7dac531074b(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_b8c5ec45_4c08_4f85_97db_6457bbc0d9e7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_46c7a12e_9972_4bca_884d_565add4a24d5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_ffef9917_fe60_4234_8723_d06f7a027ef5(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_ffef9917_fe60_4234_8723_d06f7a027ef5IndexOf(x);
    }

    
    public static int last_Problem_1_1c13425e_2795_4ea8_b00e_079e41dd1177(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_4b6354f1_d0c3_4d6a_baed_16287e8afd81(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_60733e41_3ae3_4977_8915_1549e8483e37(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_5f04c213_80a6_4c99_b578_04a32550db31(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_2eb95ed7_1f2e_4103_a307_742d3318895a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_7999aea1_5b2b_4f54_97c8_0516408e2b68(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_58d0056e_0008_4178_a7fc_94e735515c2e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_60fc67ec_be6c_4b89_b1b4_9a059cb01db4(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int j = arr.size() - 1; j >= 0; --j) {
            if(arr.get(j) == x) {
                i = j;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_2_8d976609_411c_4547_8f46_3fae9f188049(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size()-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr.get(mid) == x) {
                j = mid-1;
            }
            if(arr.get(mid) > x) {
                j = mid-1;
            }
            if(arr.get(mid) < x) {
                i = mid+1;
            }
        }
        if(i == arr.size()) return -1;
        else return arr.get(i);
    }

    
    public static int last_Problem_1_ea9692d9_2ee2_4893_b08f_8d09adcf761a(ArrayList<Integer> arr, int x) {
        int last_Problem_1_ea9692d9_2ee2_4893_b08f_8d09adcf761a = -1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_1_ea9692d9_2ee2_4893_b08f_8d09adcf761a = i;
                break;
            }
        }
        return last_Problem_1_ea9692d9_2ee2_4893_b08f_8d09adcf761a;
    }

    
    public static int last_Problem_1_72110bfc_102c_4160_baf0_e39d539924f4(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_e9a71d42_6907_46f1_9e4c_b2de7ab206ab(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) {
                high = mid - 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_157408c7_a9aa_4d3f_aeaa_b91a10fea01a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_6b15587a_c722_440b_bb1a_855fcb3c5740(ArrayList<Integer> arr, int x) {
        int l = 0, h = arr.size() - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get( m) > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_af7b7630_7432_4f16_af7c_e685536f988d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_99b3f187_fc94_453b_850b_ec249a46b5f1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_a022d1c1_6c0b_4a9a_b48b_b6c215e21ef8(ArrayList<Integer> arr, int x) {
        int index = arr.indexOf(x);
        if(index == -1) {
            return -1;
        }
        int len = arr.size();
        while(index > 0 && arr.get(index-1) == x) {
            index--;
        }
        return index == -1 ? -1 : arr.get(index);
    }

    
    public static int last_Problem_1_6a1f68cd_ff1b_4b8b_a936_cb0af06adcc0(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == n - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_742380df_0c67_4752_975c_888f1fb165c1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a14dc716_0f3a_4990_8e4a_5acf5b722194(ArrayList<Integer> arr, int x) {
        int last_Problem_1_a14dc716_0f3a_4990_8e4a_5acf5b722194 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_1_a14dc716_0f3a_4990_8e4a_5acf5b722194 = i;
            }
        }
        return last_Problem_1_a14dc716_0f3a_4990_8e4a_5acf5b722194;
    }

    
    public static int last_Problem_1_d3249a2b_3a3f_43fe_89b8_f07a43444c65(ArrayList<Integer> arr, int x) {
        int result = 0;
        int len = arr.size();
        if(len == 0) {
            return result;
        }
        int i = len - 1;
        while(arr.get(i) != x) {
            i--;
        }
        return arr.get(i);
    }

    
    public static int last_Problem_1_8544fa95_9226_45c7_91bc_2b089c6b4dbc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_10c30348_bf05_47d9_bdab_cd0d0267c69c(ArrayList<Integer> arr, int x) {
        // Your code here
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                if (mid + 1 < arr.size() && arr.get(mid + 1) == x) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_9c360deb_0e8f_477b_80d5_77844a336021(ArrayList<Integer> arr, int x) {
        int last_Problem_0_9c360deb_0e8f_477b_80d5_77844a336021 = arr.size();
        for(int i = arr.size() - 1; i > -1; i--) {
            if(arr.get(i) == x) {
                last_Problem_0_9c360deb_0e8f_477b_80d5_77844a336021 = i;
                break;
            }
        }
        return last_Problem_0_9c360deb_0e8f_477b_80d5_77844a336021;
    }

    
    public static int last_Problem_0_9f801d77_c0a3_47d2_98cf_27ea2fb19d78(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = 0;
        int last_Problem_0_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = -1;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                ret = pos;
                last_Problem_0_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = i;
            }
            if (i > prev) {
                pos++;
            }
            prev = i;
        }
        return ret;
    }

    
    public static int last_Problem_1_dbbc166d_49b1_4edc_a651_7ead0e358677(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_f37c7494_010b_45c4_ae36_c55b62fc59fd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_eea787a9_a489_43f1_9f81_682b7a6f5483(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_33c458a7_debb_452b_98fd_42e7cc5bd5c9(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_999f6ac8_969a_4ef4_9b61_fdb7a7ec04b0(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_c65e0e32_c1d5_4186_9197_4c42c54c627c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_47364b39_ce50_432a_b32f_1bc82e5bba14(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_292c6064_1c74_4134_9df6_a1761dd89d39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_4e368d4e_9c3d_42c4_b353_a5e36b70291f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_25863240_3b49_4c75_85fe_e73cc9512ac2(ArrayList<Integer> arr, int x) {
        if(arr == null || arr.size() == 0) return -1;
        int i = arr.size()-1;
        while(i >= 0 && arr.get(i) > x) i--;
        return i;
    }

    
    public static int last_Problem_2_ea9692d9_2ee2_4893_b08f_8d09adcf761a(ArrayList<Integer> arr, int x) {
        int last_Problem_2_ea9692d9_2ee2_4893_b08f_8d09adcf761a = -1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_2_ea9692d9_2ee2_4893_b08f_8d09adcf761a = i;
                break;
            }
        }
        return last_Problem_2_ea9692d9_2ee2_4893_b08f_8d09adcf761a;
    }

    
    public static int last_Problem_0_3155d852_c240_4d02_9f02_85b76f498935(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int j = 0;
        while (arr.get(j) != x && j < arr.size()) {
            j++;
        }
        return j;
    }

    
    public static int last_Problem_2_7999aea1_5b2b_4f54_97c8_0516408e2b68(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_461be40f_778e_42fe_8ef3_d187afb07870(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        }
        return -1;
    }

    
    public static int last_Problem_0_07f56f39_373a_470e_a935_8251a46d5260(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_874c2813_a96c_4ede_8eed_ad4621c57d51(ArrayList<Integer> arr, int x) {
        // write your code here
        return arr.last_Problem_0_874c2813_a96c_4ede_8eed_ad4621c57d51IndexOf(x);
    }

    
    public static int last_Problem_1_7bac2d39_8429_4a71_b4f5_50ab437b2800(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1 || arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_000bc47d_c601_4e43_b47a_db037adbfc09(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_99912270_68c3_485b_b95a_18cac3fe1157(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_eee27aba_fe70_4dd5_9dc4_4696d15af36b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_47658b04_75de_4fdd_b2c7_d7b0aa5b2955(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d85284dd_5f83_4e4f_8712_7e896314bb3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_c595c1a0_4b84_42c5_a4f0_8d2cb4444321(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac(ArrayList<Integer> arr, int x) {
        int last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac = arr.size() - 1;
        int pos = 0;
        while (last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac >= 0) {
            int curr = arr.get(last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac);
            if (x == curr) {
                return arr.get(last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac);
            }
            else if (x > curr) {
                pos = last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac + 1;
            }
            else {
                last_Problem_2_8bc8c599_835e_417d_b079_eef4332c08ac--;
            }
        }
        return arr.get(pos);
    }

    
    public static int last_Problem_2_f08ce035_e2cd_4a69_ada3_8984296ca8cd(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x))
                return mid;
            else if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_61a54374_1e54_4015_8838_efc32f14c466(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return -1;
        int low = 0, high = arr.size() - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else if(arr.get(mid) > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_c2a920e5_1793_42b9_be34_903912abfffe(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_9214b0fd_7cf3_4a57_a991_a5b4ff74fe4b(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_5d5f68d2_f0bd_474f_8421_29de191921d6(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_11a614a3_de86_49a7_a4ff_5a3c62187aad(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c65e0e32_c1d5_4186_9197_4c42c54c627c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_495975d8_e239_4c6c_a7a2_c157801b1fa1(ArrayList<Integer> arr, int x) {
        int result = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_45f57de6_bde2_4ec3_b89c_652d879c8059(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_a93a3a0d_2f44_489b_9fb3_046835c48003(ArrayList<Integer> arr, int x) {
        int pos = arr.size()-1;
        int index = arr.indexOf(x);
        if(index==-1)
            return pos;
        else
            return Math.min(arr.get(index), pos);
    }

    
    public static int last_Problem_0_532c6d9b_6836_47ba_924d_e39a70eb05d8(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        return arr.get(size - 1);
    }

    
    public static int last_Problem_0_4f1a3641_d721_4501_ba26_c05fe3956908(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_fb731f6e_ec22_45b1_b934_644350c74a31(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_33c458a7_debb_452b_98fd_42e7cc5bd5c9(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_353328fd_85e2_49ff_b087_2ce13ad8fecb(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_cd1914aa_13d3_414a_8013_355f71bb784f(ArrayList<Integer> arr, int x) {
        // your code here
        return 0;
    }

    
    public static int last_Problem_2_77b5d592_f21e_4852_acd5_b66df49a263a(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_594855ac_4ebb_483d_b685_e3515833b3d9(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) return 0;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) high = mid - 1;
            else low = mid + 1;
        }
        if (arr.get(high) != x) return 0;
        else return high;
    }

    
    public static int last_Problem_0_337d53f0_f543_4e14_bbf7_d4ac788c16ce(ArrayList<Integer> arr, int x) {
        int pos = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_0a3351c9_3314_41cd_8430_9263b4dd8b7a(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_1_7d13077b_a0e6_4a03_b394_01ae5f50c20a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int left = 0, right = arr.size() - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_20efe815_99db_4702_b3a2_b344e19e93df(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_12f54fd8_847c_4e73_9fd0_b4c68afb690d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_1_16675bb1_66e5_4cf3_b9ad_884a0fb32267(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_5e2ae708_58c2_4bf4_be6e_2aeac8585213(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d33d4c4a_cac4_4332_b6d3_d99c871b59c5(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_a1b55bff_4fef_4be0_9377_05450693b2d4(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            }
            else if (arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4f163a4e_3dda_4c6f_ac36_cb6d4b0f9d9e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_5f04c213_80a6_4c99_b578_04a32550db31(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d739413d_a6f6_4f50_b28b_6b0a204df703(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        return arr.size() - 1 - i;
    }

    
    public static int last_Problem_0_c323dad4_697c_4d2a_bf87_2372d7f4d327(ArrayList<Integer> arr, int x) {
        int last_Problem_0_c323dad4_697c_4d2a_bf87_2372d7f4d327 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_0_c323dad4_697c_4d2a_bf87_2372d7f4d327 = i;
            }
        }
        return last_Problem_0_c323dad4_697c_4d2a_bf87_2372d7f4d327;
    }

    
    public static int last_Problem_0_c724a76a_6742_4158_8a76_d50d0f2cef9e(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(element -> element == x).mapToInteger(element -> arr.indexOf(element)).max().orElse(-1);
    }

    
    public static int last_Problem_2_bb163659_7424_4139_a58f_52880aea7e12(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_29605a86_a628_4d33_81c8_f1775e98869b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_a9276bd2_d579_4c37_8007_7bd61ed4a0c3(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_0_de15d18d_f4c6_44fe_92f2_8256783bbf26(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7d13077b_a0e6_4a03_b394_01ae5f50c20a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int left = 0, right = arr.size() - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a6dcb9b4_82c1_4561_af7b_fda6dd689244(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_1_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_1_a6dcb9b4_82c1_4561_af7b_fda6dd689244 = i;
            }
        }
        return last_Problem_1_a6dcb9b4_82c1_4561_af7b_fda6dd689244;
    }

    
    public static int last_Problem_1_821a0e7f_f65f_4deb_86fe_96b002f34e69(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size();
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (arr.get(mid) >= x) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return arr.get(hi);
    }

    
    public static int last_Problem_2_b21a466e_89ba_441c_aec8_eabfe1957841(ArrayList<Integer> arr, int x) {
        int index = 0;
        for(int i : arr) {
            if(i == x) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    
    public static int last_Problem_1_93b8f1ed_4b5d_419c_abb5_870d4dcc559a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_1_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_1_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = i;
            }
        }
        return last_Problem_1_93b8f1ed_4b5d_419c_abb5_870d4dcc559a;
    }

    
    public static int last_Problem_0_fc5b40e8_2102_47df_b738_e010697eba3c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_0b6312bc_bd72_4459_8b03_0d253220f6f8(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_c7923bd0_d9a2_4993_afcb_8e5a7398d632(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_c7923bd0_d9a2_4993_afcb_8e5a7398d632IndexOf(x);
    }

    
    public static int last_Problem_2_69134755_49d7_4aa2_a10d_0a21fbafe409(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_ffef9917_fe60_4234_8723_d06f7a027ef5(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_ffef9917_fe60_4234_8723_d06f7a027ef5IndexOf(x);
    }

    
    public static int last_Problem_1_7f3ebc3a_60b3_456d_bf23_ca3a6ae59b0b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int i = n - 1;
        while (arr.get(i) != x && i >= 0) {
            i--;
        }
        return i + 1;
    }

    
    public static int last_Problem_2_d9cf8925_8756_4560_b17c_961d334c5eef(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if(size == 0) {
            return 0;
        }
        int index = arr.indexOf(x);
        return (index == size - 1)? (size - 1):(index + 1);
    }

    
    public static int last_Problem_2_502b50c0_c53c_41ed_a5da_0c36346ed3ca(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(high);
    }

    
    public static int last_Problem_2_6e3acdd4_963b_4a3b_8065_686457a22ccf(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_e85fe9e7_5b71_47dc_b894_e15ba49fc09d(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_e2df3a08_424d_4c55_9ea3_5db56c05506a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_bcb50e18_2581_4679_b206_41c48fd1acba(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_bc85d3d9_1770_417e_9f29_c0e08490b45e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d5d7f4db_d3c3_4569_96e9_a7b103b8215d(ArrayList<Integer> arr, int x) {
        int res = 0;
        for(int i = arr.size()-1; i >=0; i--) {
            if (arr.get(i) == x) {
                return i;
            }
        }
        return res;
    }

    
    public static int last_Problem_1_b19f654b_69c8_4179_88b7_a1720033fe07(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_019ee778_ff90_4a6a_8231_15254d318c3b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_84dc205f_f3f8_478f_b4eb_0995564a0ff5(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_550eae7d_a009_42b4_a5bc_f8f47ad3a184(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) {
            return -1;
        }
        int index = Arrays.binarySearch(arr.toArray(), x);
        if (index < 0) {
            index = -index - 1;
        }
        if (arr.get(index) == x) {
            return arr.get(index);
        }
        if (index == 0) {
            return arr.get(arr.size() - 1);
        }
        if (index == arr.size() - 1) {
            return arr.get(index - 1);
        }
        return arr.get(index - 1);
    }

    
    public static int last_Problem_0_eff4f6db_ec1f_4ead_812d_0fab92945004(ArrayList<Integer> arr, int x) {
        int pos = -1;
        int size = arr.size();
        for(int i = 0; i < size; ++i) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_1a167626_83e1_4769_9c6a_5e19c5fb49a7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            }
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_39fac3ed_28a3_43f5_886a_fecbab7e59ce(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_a0d83a47_7b00_40a3_a9cf_7b0977c76c0a(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        return arr.stream().filter(l -> l == x).count();
    }

    
    public static int last_Problem_2_ee764ad5_f506_4631_8923_3d43196ddbfc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c64897a9_dda1_4646_afd4_22398980ca78(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_70b84021_3ce8_4fb7_9bdb_cbba601046e8(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_57a03009_7155_4cec_929a_ddb040fbf689(ArrayList<Integer> arr, int x) {
        int last_Problem_2_57a03009_7155_4cec_929a_ddb040fbf689 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_2_57a03009_7155_4cec_929a_ddb040fbf689 = i;
            }
        }
        return last_Problem_2_57a03009_7155_4cec_929a_ddb040fbf689;
    }

    
    public static int last_Problem_1_f3118d5a_2ca2_46fd_92a1_6821c2932f30(ArrayList<Integer> arr, int x) {
        int r = -1;
        for(int i=arr.size()-1; i>=0; i--) {
            if(arr.get(i) == x) {
                r = i;
                break;
            }
        }
        return r;
    }

    
    public static int last_Problem_2_9f801d77_c0a3_47d2_98cf_27ea2fb19d78(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = 0;
        int last_Problem_2_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = -1;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                ret = pos;
                last_Problem_2_9f801d77_c0a3_47d2_98cf_27ea2fb19d78 = i;
            }
            if (i > prev) {
                pos++;
            }
            prev = i;
        }
        return ret;
    }

    
    public static int last_Problem_2_a0d83a47_7b00_40a3_a9cf_7b0977c76c0a(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        return arr.stream().filter(l -> l == x).count();
    }

    
    public static int last_Problem_1_c0a147e8_8ff3_4c86_86f6_a914351d13fe(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_6b15587a_c722_440b_bb1a_855fcb3c5740(ArrayList<Integer> arr, int x) {
        int l = 0, h = arr.size() - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1 || arr.get( m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get( m) > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_0d45b6c1_afbe_4024_baeb_41d6a3c78f14(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_863d9540_c999_465c_9ab1_d84e80606b1c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a74b9b6b_b806_4594_a330_d622123267d2(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_bc58c357_8102_440e_a674_bc7bef78e5fd(ArrayList<Integer> arr, int x) {
        if(arr == null)
            throw new java.lang.NullPointerException();
        if(arr.size() < 1)
            throw new java.lang.IllegalArgumentException();
        int pos = arr.size() - 1;
        while(pos > -1 && arr.get(pos) != x) {
            pos--;
        }
        return pos;
    }

    
    public static int last_Problem_1_1d88d339_f7b2_44e9_94ea_92f4c2b52787(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_d7fdc5b3_9f49_4149_8cf3_78b2d491f3c4(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                lo = mid + 1;
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_a0ad35b9_a13e_42d7_a093_390350a2e2ee(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_8a033d42_2686_43e1_b30c_b642c4d972d7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_af9d8e4a_a93e_4c45_9927_3aeb83b23e9e(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_1a167626_83e1_4769_9c6a_5e19c5fb49a7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            }
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_8544fa95_9226_45c7_91bc_2b089c6b4dbc(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d29d6a94_8968_43a6_892c_38cbd716c6b2(ArrayList<Integer> arr, int x) {
        int pos = 0;
        int temp = 0;
        boolean found = False;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                found = True;
                break;
            }
            if(arr.get(i) > x) {
                pos = i - 1;
                break;
            }
            if(arr.get(i) < x && found) {
                temp = arr.get(i);
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_a7809d89_9172_4975_bc29_5cc5f739103b(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_2a72f404_3b32_4172_8b7f_61477ff6028f(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_2a72f404_3b32_4172_8b7f_61477ff6028fIndexOf(x);
    }

    
    public static int last_Problem_0_614142f8_3f3f_4a7e_87ce_7fd522574a1c(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e6e6e140_4a20_4e99_a5bd_68c2f98202d7(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_69134755_49d7_4aa2_a10d_0a21fbafe409(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_2f8a7f23_4d75_499a_a89f_8a8edb6961d8(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_bdfb290c_97ff_40cb_b658_3d15a764a505(ArrayList<Integer> arr, int x) {
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) return index;
            index--;
        }
        return -1;
    }

    
    public static int last_Problem_1_4b6354f1_d0c3_4d6a_baed_16287e8afd81(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ebbc1a0b_587d_4923_80e1_1c4aab5edb10(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_e85fe9e7_5b71_47dc_b894_e15ba49fc09d(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_f0b164ef_d3d8_491c_bafe_9d324fe6c942(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7aac1cea_032e_4356_a2fe_e133b425ed39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_7712da0d_b592_492e_995c_6522d194e209(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_6d8ed952_4efd_4be4_844b_56b495e7d91f(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            ret = arr.get(pos);
        }
        return ret;
    }

    
    public static int last_Problem_1_5e2ae708_58c2_4bf4_be6e_2aeac8585213(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_3da9b4b4_f02f_427a_a978_453534bc7042(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_40772e04_8782_4816_82a6_981147fef1b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_87939d82_bdd5_4c79_a2c0_c814c33efe81(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_f5d76352_22a1_4fee_9fa4_cb5599530dca(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size() - 1) == x ? arr.size() - 1 : arr.last_Problem_0_f5d76352_22a1_4fee_9fa4_cb5599530dcaIndexOf(x);
    }

    
    public static int last_Problem_0_df519f29_2d14_4ee4_80f1_13362e5e0c85(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_90c699f2_3518_49e6_a32d_c04165177df8(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        if (arr.get(start) != x) {
            while (arr.get(start) < x && start < end) {
                start++;
            }
            start--;
        }
        while (arr.get(end) > x && start < end) {
            end--;
        }
        return (start + 1);
    }

    
    public static int last_Problem_0_dd3289b7_b021_4433_b581_74aeec35f12f(ArrayList<Integer> arr, int x) {
        // Your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_d5ac729b_ecfc_484a_99bd_ec47e80e6922(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while (arr.get(i) != x && i>=0) i--;
        if (i == -1) return -1;
        else return i;
    }

    
    public static int last_Problem_1_72906c07_2dcd_4eb7_9547_239da3d9fe61(ArrayList<Integer> arr, int x) {
        // Complete this function
        int last_Problem_1_72906c07_2dcd_4eb7_9547_239da3d9fe61 = 0;
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) == x) {
                last_Problem_1_72906c07_2dcd_4eb7_9547_239da3d9fe61 = i;
                break;
            }
        }
        return last_Problem_1_72906c07_2dcd_4eb7_9547_239da3d9fe61;
    }

    
    public static int last_Problem_1_20efe815_99db_4702_b3a2_b344e19e93df(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_2_fd845f86_2ae9_4002_8a03_d968fdb927dd(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_65fcdde4_ace0_4fca_8f99_1d7c4d642db1(ArrayList<Integer> arr, int x) {
        if (arr == null || arr.size() == 0) return -1;
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (arr.get(left) == x) {
            return left;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_4b6354f1_d0c3_4d6a_baed_16287e8afd81(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7fa02dbf_7692_4164_a50d_09bbf869eb0a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_c65d6b1c_1332_49f5_9e67_940755982c36(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        if (size == 0) return 0;
        int lower = 0;
        int upper = size - 1;
        int mid = 0;
        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (arr.get(mid) < x) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return (lower == 0) ? arr.get(0) : arr.get(lower - 1);
    }

    
    public static int last_Problem_0_0c4af3eb_d781_4de6_b757_ba7595f363fb(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        if (arr.get(r) == x) return r;
        else return -1;
    }

    
    public static int last_Problem_0_31fc6182_0b76_4650_bc95_7f4212ea7093(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_4fd5c6dd_9892_4823_8fb1_000a1b7aa3f7(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_1_c595c1a0_4b84_42c5_a4f0_8d2cb4444321(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_16675bb1_66e5_4cf3_b9ad_884a0fb32267(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_22f3fd5d_5653_4402_980c_752db15da4e0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(arr.get(mid) < x)
                l = mid+1;
            else
                r = mid - 1;
        }
        if(l > arr.size() - 1)
            return -1;
        return arr.get(l);
    }

    
    public static int last_Problem_0_487e46bb_5749_403b_b93a_404b12661c96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7f599edf_b38b_4e7a_8802_4d7582d19c24(ArrayList<Integer> arr, int x) {
        return (arr.get((arr.size() - 1) / 2) > x) ? arr.get((arr.size() - 1) / 2) : arr.get((arr.size() - 1) / 2);
    }

    
    public static int last_Problem_1_3b7af1a5_4a1b_4bb0_829c_57d4c4536a4e(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_c2a920e5_1793_42b9_be34_903912abfffe(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_1e3812dd_71ed_4a5b_ac19_b399452b62cd(ArrayList<Integer> arr, int x) {
        return (arr.get(arr.size() - 1) == x) ? arr.size() - 1 : arr.last_Problem_1_1e3812dd_71ed_4a5b_ac19_b399452b62cdIndexOf(x);
    }

    
    public static int last_Problem_1_ada59fc3_2093_4c4c_81d2_c13a9510bfe9(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        else {
            int n = arr.get(arr.size() - 1);
            if(n == x) return arr.size();
            else {
                int i = arr.size() - 1;
                while(i >= 0) {
                    if(arr.get(i) == x) return i;
                    else if(arr.get(i) > x) return -1;
                    i--;
                }
                return -1;
            }
        }
    }

    
    public static int last_Problem_1_47658b04_75de_4fdd_b2c7_d7b0aa5b2955(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_3222e569_8862_44f3_8b83_b252f7d18490(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_b97900e8_f34f_4609_892f_03663ce56772(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_8b91510f_35d6_4749_ab5f_015bb7033c12(ArrayList<Integer> arr, int x) {
        int last_Problem_2_8b91510f_35d6_4749_ab5f_015bb7033c12 = -1;
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                last_Problem_2_8b91510f_35d6_4749_ab5f_015bb7033c12 = i;
            }
            i++;
        }
        return last_Problem_2_8b91510f_35d6_4749_ab5f_015bb7033c12;
    }

    
    public static int last_Problem_2_d3baf633_2652_4dbd_875b_960f358822e6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (arr.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_a93a3a0d_2f44_489b_9fb3_046835c48003(ArrayList<Integer> arr, int x) {
        int pos = arr.size()-1;
        int index = arr.indexOf(x);
        if(index==-1)
            return pos;
        else
            return Math.min(arr.get(index), pos);
    }

    
    public static int last_Problem_2_cce1997d_278d_46b3_998b_72cd67f80ad1(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr.get(mid) > x) {
                right = mid - 1;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                left = right = mid;
            }
        }
        return left;
    }

    
    public static int last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac(ArrayList<Integer> arr, int x) {
        int last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac = arr.size() - 1;
        int pos = 0;
        while (last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac >= 0) {
            int curr = arr.get(last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac);
            if (x == curr) {
                return arr.get(last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac);
            }
            else if (x > curr) {
                pos = last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac + 1;
            }
            else {
                last_Problem_1_8bc8c599_835e_417d_b079_eef4332c08ac--;
            }
        }
        return arr.get(pos);
    }

    
    public static int last_Problem_0_103e9610_121a_41ac_97e4_fa35fd626294(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_0_103e9610_121a_41ac_97e4_fa35fd626294IndexOf(x);
    }

    
    public static int last_Problem_2_a6d736ea_db3e_45ec_8b92_a3644262a480(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_8f43ecc2_6bba_4b10_be12_5a13415d1b10(ArrayList<Integer> arr, int x) {
        int i = -1;
        for (int i1 = arr.size() - 1; i1 >= 0; i1--) {
            int num = arr.get(i1);
            if (num == x) {
                i = i1;
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_1_ead8a688_4052_4231_9573_f3c5f24219ff(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_45f57de6_bde2_4ec3_b89c_652d879c8059(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ef8d799a_11f3_4b49_9a51_9bf5714bd4b6(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return (l - 1);
    }

    
    public static int last_Problem_0_7653084a_87fd_46b6_9c03_eb37309ff692(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_0ff1f16b_a103_4038_ace3_13712ae247cf(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_1_55c787ae_50e1_4246_a753_fcf0dcbfd6fe(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_4777b671_3c48_49f5_8bbe_fca6c2d6fd4b(ArrayList<Integer> arr, int x) {
        // Your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7b84b488_dd3c_4b09_811c_71a5ca4f43cc(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_11af1647_f5dc_4fa4_9b5a_dda76a925661(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int last_Problem_0_11af1647_f5dc_4fa4_9b5a_dda76a925661 = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) == x) {
                last_Problem_0_11af1647_f5dc_4fa4_9b5a_dda76a925661 = mid;
                lo = mid + 1;
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return last_Problem_0_11af1647_f5dc_4fa4_9b5a_dda76a925661;
    }

    
    public static int last_Problem_2_7d44bc3f_4aa3_45b0_aa50_b49796d3e561(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get( m) <= x)
                l = m;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_2_bce75abe_a813_4370_991a_51c2ed62d9ec(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (arr.get(lo) == x) {
            return lo;
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_0_d999715f_a808_4448_a164_53722ceb984d(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int last_Problem_0_d999715f_a808_4448_a164_53722ceb984d = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                last_Problem_0_d999715f_a808_4448_a164_53722ceb984d = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last_Problem_0_d999715f_a808_4448_a164_53722ceb984d;
    }

    
    public static int last_Problem_0_71c81be1_aad1_4ca5_8a1e_26938cd93e7a(ArrayList<Integer> arr, int x) {
        // Binary search
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get( m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get( m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_85bdd37c_a72d_45e9_9ca6_e82614d8a6be(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_f5d76352_22a1_4fee_9fa4_cb5599530dca(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size() - 1) == x ? arr.size() - 1 : arr.last_Problem_1_f5d76352_22a1_4fee_9fa4_cb5599530dcaIndexOf(x);
    }

    
    public static int last_Problem_0_875c39fb_6e4a_4182_a042_ffc2c35ba143(ArrayList<Integer> arr, int x) {
        int last_Problem_0_875c39fb_6e4a_4182_a042_ffc2c35ba143 = 0;
        for (int i : arr) {
            if (i == x) {
                last_Problem_0_875c39fb_6e4a_4182_a042_ffc2c35ba143 = arr.indexOf(i);
                break;
            }
        }
        return last_Problem_0_875c39fb_6e4a_4182_a042_ffc2c35ba143;
    }

    
    public static int last_Problem_2_45f57de6_bde2_4ec3_b89c_652d879c8059(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b19f654b_69c8_4179_88b7_a1720033fe07(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14ae(ArrayList<Integer> arr, int x) {
        int last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = 0;
        int last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = arr.get(0);
        int currentVal = arr.get(0);
        int last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = 0;
        for(int i = 1; i < arr.size(); i++) {
            currentVal = arr.get(i);
            if(currentVal < x) {
                last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos = i;
                last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeVal = currentVal;
                last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aeValPos = i;
            }
        }
        return last_Problem_2_f39c5b21_fae5_4e1f_812c_3bcc72fe14aePos;
    }

    
    public static int last_Problem_2_de15d18d_f4c6_44fe_92f2_8256783bbf26(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_93b8f1ed_4b5d_419c_abb5_870d4dcc559a(ArrayList<Integer> arr, int x) {
        // Write your code here
        int last_Problem_2_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_2_93b8f1ed_4b5d_419c_abb5_870d4dcc559a = i;
            }
        }
        return last_Problem_2_93b8f1ed_4b5d_419c_abb5_870d4dcc559a;
    }

    
    public static int last_Problem_2_1f73c180_acc5_417f_a283_11083f181509(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_8b2007dd_6d0f_4cdb_8b83_27440321fb01(ArrayList<Integer> arr, int x) {
        return arr.get(arr.size()-1);
    }

    
    public static int last_Problem_2_55c787ae_50e1_4246_a753_fcf0dcbfd6fe(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e34589b5_707d_4756_8b71_05de9f87786a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_1_7c849b71_0079_45f7_9eba_5ceb40f2d513(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_2eb95ed7_1f2e_4103_a307_742d3318895a(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_2f8a7f23_4d75_499a_a89f_8a8edb6961d8(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_87f6432f_8342_433f_9a1f_0bc493cae970(ArrayList<Integer> arr, int x) {
        int i = arr.indexOf(x);
        if (i > 0) {
            return arr.get(i - 1);
        } else {
            return -1;
        }
    }

    
    public static int last_Problem_1_098f0446_08d6_4979_b742_62ee3ca9f3ef(ArrayList<Integer> arr, int x) {
        int last_Problem_1_098f0446_08d6_4979_b742_62ee3ca9f3ef = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_1_098f0446_08d6_4979_b742_62ee3ca9f3ef = i;
                break;
            }
            i--;
        }
        return last_Problem_1_098f0446_08d6_4979_b742_62ee3ca9f3ef;
    }

    
    public static int last_Problem_2_4e6f87e5_477f_4349_ac2d_35319f27b4ef(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_d5d7f4db_d3c3_4569_96e9_a7b103b8215d(ArrayList<Integer> arr, int x) {
        int res = 0;
        for(int i = arr.size()-1; i >=0; i--) {
            if (arr.get(i) == x) {
                return i;
            }
        }
        return res;
    }

    
    public static int last_Problem_0_827e8487_49b4_43de_bf08_31abff79738d(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int l = 0, r = size - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) < x) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

    
    public static int last_Problem_1_1cbc3ae3_feb0_4ba7_ac4b_9f12971fc64a(ArrayList<Integer> arr, int x) {
        int result = 0;
        if(arr.size() > 0) {
            result = arr.size()-1;
        }
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_1_9c360deb_0e8f_477b_80d5_77844a336021(ArrayList<Integer> arr, int x) {
        int last_Problem_1_9c360deb_0e8f_477b_80d5_77844a336021 = arr.size();
        for(int i = arr.size() - 1; i > -1; i--) {
            if(arr.get(i) == x) {
                last_Problem_1_9c360deb_0e8f_477b_80d5_77844a336021 = i;
                break;
            }
        }
        return last_Problem_1_9c360deb_0e8f_477b_80d5_77844a336021;
    }

    
    public static int last_Problem_2_7fa02dbf_7692_4164_a50d_09bbf869eb0a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_90cc39e8_9bd9_4b10_b859_7382d4c4bc0f(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
