package mbpp_442_positive_count;

public class mbpp_442_positive_count {

    
    public static float positiveCount_Problem_2_7c740a9c_b686_458b_85d3_3eb0662a3c60(ArrayList<Integer> nums) {
        int positiveCount_Problem_2_7c740a9c_b686_458b_85d3_3eb0662a3c60 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_2_7c740a9c_b686_458b_85d3_3eb0662a3c60++;
            }
        }
        return positiveCount_Problem_2_7c740a9c_b686_458b_85d3_3eb0662a3c60 / nums.size();
    }

    
    public static float positiveCount_Problem_2_b1e96caa_e462_4bf9_83bd_ea89802d62d9(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count += 1;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_0_2d2e9f52_a83a_43e8_92d4_ce90ba90b811(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_8071a0f8_df22_4240_97f8_8806324174e0(ArrayList<Integer> nums) {
        float positives = 0;
        for(int num : nums)
        {
            if(num > 0)
                positives++;
        }
        System.out.println("Positive Count : " + positives);
        return positives;
    }

    
    public static float positiveCount_Problem_1_ce56841c_78c0_4f52_a168_0fa577e179bb(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_01d68ac6_8e9e_415a_868b_c7fadc9cc99c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3367e237_5d27_445b_a3fc_d47766fc4717(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_5a32d68c_e7d5_4b44_804d_8ea892a6cd8d(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_1_643f181b_83e6_4549_856b_0957dda8c755(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_9bb78580_8ffb_4354_b474_fe30195987b3(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_3a3a1a56_c04d_4ad0_974d_4e17e883b9da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_fb6756e4_0d9b_4433_9e33_60d268fbfb44(ArrayList<Integer> nums) {
        float sum = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            sum += nums.get(i);
        }
        return sum / size;
    }

    
    public static float positiveCount_Problem_1_a7559f95_0955_46b6_860d_836fd3b69471(ArrayList<Integer> nums) {
        int positiveCount_Problem_1_a7559f95_0955_46b6_860d_836fd3b69471 = 0;
        // Your code goes here
        if (nums.isEmpty()) {
            return 0;
        }
        else {
            for (Integer num : nums) {
                if (num > 0) {
                    positiveCount_Problem_1_a7559f95_0955_46b6_860d_836fd3b69471 = positiveCount_Problem_1_a7559f95_0955_46b6_860d_836fd3b69471 + 1;
                }
            }
        }
        return positiveCount_Problem_1_a7559f95_0955_46b6_860d_836fd3b69471;
    }

    
    public static float positiveCount_Problem_1_c90e6a6c_a86d_4e31_9a91_dfa1ed9acc98(ArrayList<Integer> nums) {
        
        int positive=0;
        for (Integer num : nums){
            if (num > 0){
                positive++;
            }
        }
        
        float total=nums.size()*positive/nums.size();
        return total;
    }

    
    public static float positiveCount_Problem_1_c72e5f43_37db_414d_84ba_6a086315e759(ArrayList<Integer> nums) {
        float count=0;
        for(int i=0;i<nums.size();i++)
            count+=nums.get(i);
        return count;
    }

    
    public static float positiveCount_Problem_1_ca5fa246_d825_495f_8a96_679d13c1a45d(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count+=1;
            }
        }
        float ratio=count/nums.size();
        return ratio;
    }

    
    public static float positiveCount_Problem_2_a6d77900_6123_4e75_b4b9_dee2900bdc3f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_a512d8f2_6fd8_41eb_836c_86f6906f38e3(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer x: nums) {
            if(x.intValue()>0) {
                sum+=x.intValue();
            }
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_2_27048f32_7a37_4078_baf7_b5d3f9e4888f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ee12073b_0621_47ab_9bf5_f6eb3b27e9d4(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_8abad1cd_03a0_4c1a_82ab_ee8efcb53283(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6f3c39ce_f4a0_45e6_ad4a_70b109e97fb9(ArrayList<Integer> nums) {
        // write your code here
        float sum=0;
        for (Integer i: nums)
        {
            if (i>0)
            {
                sum+=i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_df7453ef_4111_4aaf_984f_747f3f22c733(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_43da4096_f4fb_4d7c_819c_9b40d09cc3ef(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f5c7d190_629c_4d3f_95fc_1919d1e74a37(ArrayList<Integer> nums) {
        float total = 0;
        for (Integer num : nums)
            if (num > 0) total++;
        return total;
    }

    
    public static float positiveCount_Problem_2_a20b537f_eb42_4847_bf9e_b3bb17f03cc5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_c1087e9b_3542_4f02_8ad1_6c6ecc987528(ArrayList<Integer> nums) {
        int total = 0;
        for(int i : nums) {
            if (i > 0) total++;
        }
        return (total)/nums.size();
    }

    
    public static float positiveCount_Problem_2_ca969cc9_12e0_4b6f_bbba_f645420de731(ArrayList<Integer> nums) {
        float total = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0)
                total += nums.get(i);
        }
        return total;
    }

    
    public static float positiveCount_Problem_1_9db7f816_8057_414d_8009_b2ec6eec4fc2(ArrayList<Integer> nums) {
        float npos = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                npos +=  nums.get(i) / nums.size();
            }
        }
        return npos;
    }

    
    public static float positiveCount_Problem_0_1dd08f31_160f_4494_a4c7_e9230ec72d98(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_73933fec_52d8_4626_b81d_72298689beb6(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                sum += nums.get(i);
            }
        }
        return  (sum /  nums.size());
    }

    
    public static float positiveCount_Problem_2_23be0c7e_99f9_49aa_8ff2_0ebf458ea913(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_282b3ebf_3dd5_4db0_b0ae_6861a6aef442(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_cc847865_403d_47a1_afcd_e87f8d9cbce7(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b0dc289e_aa03_44f6_8a2d_9992b482dbdc(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_19eebb49_1942_4780_9398_b0c6e5354a57(ArrayList<Integer> nums) {
        float f = 0;
        for (int n : nums) {
            if (n > 0) {
                f += 1.0; // +1 to convert float to int
            }
        }
        return f;
    }

    
    public static float positiveCount_Problem_2_3d71bb98_385d_4de6_ac0a_c1ae1aa745ed(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_7c740a9c_b686_458b_85d3_3eb0662a3c60(ArrayList<Integer> nums) {
        int positiveCount_Problem_0_7c740a9c_b686_458b_85d3_3eb0662a3c60 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_0_7c740a9c_b686_458b_85d3_3eb0662a3c60++;
            }
        }
        return positiveCount_Problem_0_7c740a9c_b686_458b_85d3_3eb0662a3c60 / nums.size();
    }

    
    public static float positiveCount_Problem_1_10f505b2_3d06_4807_bef9_3e31fb9fb7e0(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_5a2efeb7_03ec_4b3e_bb2e_9c5f89314112(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_bf5100fe_b405_4b43_8502_6ab772b433c1(ArrayList<Integer> nums) {
        // Use a loop to traverse the list and count the positive number of elements in the list.
        float count = 0.0;
        for (int num : nums) {
            if (num > 0) {
                count += num;
            }
        }
        // Return the count of the positive numbers.
        return count;
    }

    
    public static float positiveCount_Problem_0_1b0b5eb4_c063_48b5_9b16_0249bcafe839(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_bffe95c3_e8d8_4cf0_a35c_ee9a64c74dc6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_710f8f6b_f425_45d0_88ee_4d80b05afcdd(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0) {
                count++;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_2_437b1ee3_65f5_4951_87f9_0fcf76babc36(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_a0716193_33f3_4718_bbd3_b83900634fe5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_29d21b25_5495_4e70_914a_d5012b5a1111(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_0a762068_0f69_4d38_a0c6_c6678cd33de1(ArrayList<Integer> nums) {
        int sum=0;
        int num=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums.get(i);
        }
        for(int i=0;i<nums.size();i++)
        {
            num=sum;
            sum-=nums.get(i);
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_29d21b25_5495_4e70_914a_d5012b5a1111(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_abefaf49_59d5_4582_8724_3b858e5b130e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_39ef7acf_3297_45b9_a16b_d13887581f07(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_04b7de23_5780_426d_be40_eb6a5ad5cbc9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_16788c01_4e82_44e1_879f_1502041e3ce5(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_584da510_4a8e_4ed0_a7eb_881b6f63932d(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer l : nums) {
            if (l > 0) {
                count++;
            }
        }
        return count / (nums.size());
    }

    
    public static float positiveCount_Problem_1_04b7de23_5780_426d_be40_eb6a5ad5cbc9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_74b67af2_8a7f_4f73_9bc6_a64320529e35(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ef436837_e6a6_4d4a_a071_424c1aabd2cb(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_e1fcdfb3_acb8_4adc_8c08_8cce28085c89(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3de9f185_b489_45dd_a937_46d60321312e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3a3a1a56_c04d_4ad0_974d_4e17e883b9da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_774ad0f8_c24e_418c_a311_931f43ed4fac(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_606c1323_5ede_4129_987f_8703b927c278(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3c6c96d5_b60d_44fb_8262_53b9d5a6d7a0(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2(ArrayList<Integer> nums) {
        int positiveCount_Problem_0_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2 = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_0_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2++;
            }
        }
        return positiveCount_Problem_0_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2 / nums.size();
    }

    
    public static float positiveCount_Problem_0_e9fe96dc_4f64_4a13_896c_d3446822a53a(ArrayList<Integer> nums) {
        float count = 0;
        for (int i=0; i<nums.size(); i++) {
            if(nums.get(i) >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_1_963a107b_2e80_4807_bed4_21ff520ce1b4(ArrayList<Integer> nums) {
        float sum = 0f;
        for(Integer i : nums) {
            if(i != 0) sum += i;
        }
        return sum /  nums.size();
    }

    
    public static float positiveCount_Problem_0_3168b8e3_f748_487d_9f8f_a88c11c3b5da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a72e328c_c5cd_4aed_b40a_489f86478b5d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_21979fe3_bf83_4809_8b47_0465d674f88c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_18cf30a2_439c_4d03_90b6_3ea2e5fc402c(ArrayList<Integer> nums) {
        return  nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_171d6749_ef49_4a08_8c3a_1e9ca4865723(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_584da510_4a8e_4ed0_a7eb_881b6f63932d(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer l : nums) {
            if (l > 0) {
                count++;
            }
        }
        return count / (nums.size());
    }

    
    public static float positiveCount_Problem_2_d56d7793_14ca_484f_8857_77b7634d61f9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_93782f89_b48f_4900_aeb3_6724e0dcb930(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_24ce0cf2_cb63_4d8b_852b_91a693f155e6(ArrayList<Integer> nums) {
        // Complete the code here.
        return 1.0;
    }

    
    public static float positiveCount_Problem_0_dea9949c_b59d_446e_9ae3_74f4ddb8d591(ArrayList<Integer> nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_2_03deaec1_be80_4189_9111_5a70ce54a9e0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6ed954ba_9126_4df8_a9f1_60b49e980cc2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ae8c446b_4d2f_477a_a31c_93f46b61b306(ArrayList<Integer> nums) {
        float result = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0) {
                result += nums.get(i);
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_2_0015cab6_2eae_45dd_813f_3596e4efc62f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_77060446_ce6a_41db_a61c_f2fe6a488445(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_23be0c7e_99f9_49aa_8ff2_0ebf458ea913(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3d9eaa6f_3476_4cb0_8b4d_6fec251f029f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_dea9949c_b59d_446e_9ae3_74f4ddb8d591(ArrayList<Integer> nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_1_817c9c0e_724a_4e99_8983_c0a063cc5e0a(ArrayList<Integer> nums) {
        float sum=0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_6dcd5e69_ad55_40c7_ac25_14e6f639e783(ArrayList<Integer> nums) {
        float positiveCount_Problem_2_6dcd5e69_ad55_40c7_ac25_14e6f639e783 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_2_6dcd5e69_ad55_40c7_ac25_14e6f639e783++;
            }
        }
        return positiveCount_Problem_2_6dcd5e69_ad55_40c7_ac25_14e6f639e783;
    }

    
    public static float positiveCount_Problem_2_8c87569e_d266_4b1b_b685_f77b023cacae(ArrayList<Integer> nums) {
        int len = nums.size();
        float pos =  0.0;
        for (int i = 0; i < len; i++) {
            pos += nums.get(i);
        }
        return pos / len;
    }

    
    public static float positiveCount_Problem_0_bf514f99_62c4_414d_9b54_f3e061338254(ArrayList<Integer> nums) {
        // Write your code here
        
        float sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        float sum1=sum/nums.size();
        
        
        
        return sum1;
    }

    
    public static float positiveCount_Problem_0_1adaf0cc_0290_4340_96c3_820f32dbac61(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_21648cca_b333_4b29_b309_a65079164065(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_0b90246f_54c3_4a62_9ccc_a9d271087c89(ArrayList<Integer> nums) {
        int n = 0;
        int p = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                ++n;
            } else {
                p = i;
            }
        }
        float ans = n /  p;
        return ans;
    }

    
    public static float positiveCount_Problem_2_ef1f4e7a_2f19_4bda_a82b_86648fe9f5d8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b0722bd9_9703_4058_9df2_6f5ede5142bc(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_97a62f9b_e11d_4810_a974_7bb8630bed18(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_8b7a11a9_9e39_4565_b8bc_e55d54f66da8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b2f7e401_5dc6_4ae8_aa02_ddae4caad93f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_ef436837_e6a6_4d4a_a071_424c1aabd2cb(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d9cea3ce_640e_4afa_b4cd_dc1fe15bd611(ArrayList<Integer> nums) {
        int a = 0;
        float numCount = 0;
        int n = 0;
        for (Integer i : nums) {
            if (i == n) {
                a++;
                numCount++;
            }
            n = i;
        }
        if (numCount == 0) {
            return 0;
        } else {
            float result = 0;
            float p = 1;
            while (a > 0) {
                result += p;
                p *= 10;
                a--;
            }
            return result;
        }
    }

    
    public static float positiveCount_Problem_1_84cef61c_9e0b_41cf_9756_e81491977c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_74b67af2_8a7f_4f73_9bc6_a64320529e35(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_aadee095_43a6_4c3f_bc84_d8403b3514e2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_8071a0f8_df22_4240_97f8_8806324174e0(ArrayList<Integer> nums) {
        float positives = 0;
        for(int num : nums)
        {
            if(num > 0)
                positives++;
        }
        System.out.println("Positive Count : " + positives);
        return positives;
    }

    
    public static float positiveCount_Problem_1_ef8f0145_89d1_4fa0_a720_54b99def0dfd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_8b4f6378_ba2a_4e12_bb1c_32fb51b75981(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b0c2e53d_8cd6_418e_8044_1430eee73361(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_1a577f47_fcb9_42ff_9f06_ff94f45bf145(ArrayList<Integer> nums) {
        int n = 0;
        for (int i : nums) {
            if (i >= 0) {
                n += 1;
            }
        }
        return n / nums.size();
    }

    
    public static float positiveCount_Problem_1_886866d2_e627_42d3_8b21_3c70bf779e54(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ed2ab3e7_1edb_4251_9755_21a368435e08(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b201deb2_fa18_425f_a5cd_532002dd1e2f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_52e96c49_3925_4217_9c98_8b8367f1427d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4157f5c7_5ee7_4b91_a148_4b95702d374d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_157dd1ab_cfd2_4e83_886e_4f6a3639d698(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0){
                count++;
            }
        }
        return (count)/nums.size();
    }

    
    public static float positiveCount_Problem_2_c0991aac_2f0e_4f2b_8149_fb2ef5f0e745(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_bf7d736b_bd59_4648_b641_54b3d31eca8e(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i : nums) {
            if(i >= 0) 
                sum += i;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_1949b15b_b203_499c_87aa_f5793ef84701(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8b7a11a9_9e39_4565_b8bc_e55d54f66da8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_f8dceb70_35c8_46d7_8a66_f05f4f89566f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4157f5c7_5ee7_4b91_a148_4b95702d374d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_1a577f47_fcb9_42ff_9f06_ff94f45bf145(ArrayList<Integer> nums) {
        int n = 0;
        for (int i : nums) {
            if (i >= 0) {
                n += 1;
            }
        }
        return n / nums.size();
    }

    
    public static float positiveCount_Problem_1_fe955d16_75a1_47e4_b087_fd1ee3e42a9d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_7842d77c_12a6_4f82_8b4e_facb2afcd01c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b10fcc00_c09c_409a_80f0_1fce78295703(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_517cbbf8_c9d8_42c3_805f_36594cadf501(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6dcd5e69_ad55_40c7_ac25_14e6f639e783(ArrayList<Integer> nums) {
        float positiveCount_Problem_0_6dcd5e69_ad55_40c7_ac25_14e6f639e783 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_0_6dcd5e69_ad55_40c7_ac25_14e6f639e783++;
            }
        }
        return positiveCount_Problem_0_6dcd5e69_ad55_40c7_ac25_14e6f639e783;
    }

    
    public static float positiveCount_Problem_0_27048f32_7a37_4078_baf7_b5d3f9e4888f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3de9f185_b489_45dd_a937_46d60321312e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_0ef6b51c_a521_46ee_9e7c_044841f525e5(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer number : nums) {
            count += number;
        }
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_2_b2f54f87_6121_4b4e_a2e0_7e616afd4342(ArrayList<Integer> nums) {
        float sum=0;
        for(Integer i : nums)
        {
            if(i>0)
            {
                sum++;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_73b6201e_33ec_4ca8_a8c6_85c123184986(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3e0821d4_3a2c_437e_bd6a_1b5934feb4dd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_0827d553_7b38_432d_9993_0e1faca03cc3(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_992b4c40_88a6_441d_a985_455d7a82de8e(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_fee17d3d_506b_4578_a115_1b0ae4af26b1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_0f80a14d_1f37_4bda_bcdb_eda713d4d476(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_783e0de6_7e16_4ebc_8752_067045552847(ArrayList<Integer> nums) {
        float counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                counter++;
            }
        }
        return counter;
    }

    
    public static float positiveCount_Problem_0_2c740f42_bc84_4a9b_ab3c_931b62c9bde6(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums){
            sum = sum + num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_abefaf49_59d5_4582_8724_3b858e5b130e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_55b04624_bbb7_47b7_84d2_18701f3ffa84(ArrayList<Integer> nums) {
        float total = 0.0;
        for (int num : nums) {
            if (num > 0) {
                total += num;
            }
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_0_ab27a797_5002_479a_912b_0f866df4bc3f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_477353f7_99c5_4271_8b9a_15f194858e6c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_4b9a3231_7264_4d37_8cea_6f18e9ef5ddc(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_a553e412_83a7_4641_a559_8af3e510bcea(ArrayList<Integer> nums) {
        // TODO: Write your code here
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int[] positive = new int[nums.size()];
        int i = 0;
        for (Integer num : nums) {
            if (num >= 0) {
                positive[i] = num;
            }
            sum += positive[i];
            i++;
        }
        float result = sum / positive.length;
        return result;
    }

    
    public static float positiveCount_Problem_0_73b6201e_33ec_4ca8_a8c6_85c123184986(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_21648cca_b333_4b29_b309_a65079164065(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_197db681_8678_4f15_a9b7_4089df67ec73(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_31587509_d845_4f25_b52a_b6facbb8d740(ArrayList<Integer> nums) {
        float numZero = 0;
        float numPositive = 0;
        float numNegative = 0;
        float numTotal = 0;
        for (Integer num : nums) {
            if (num > 0) {
                numTotal += num;
                if (num < 0) {
                    numNegative += num;
                } else {
                    numPositive += num;
                }
            } else {
                numZero += num;
            }
        }
        return (numTotal / nums.size());
    }

    
    public static float positiveCount_Problem_1_40fc4e40_12a7_4d7b_a129_767ad9d54293(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_50ada033_e58e_4a88_8c34_73bd866a624a(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_f65be203_7da3_49f9_9f2d_414808f84638(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_40fc4e40_12a7_4d7b_a129_767ad9d54293(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_6b327000_0bbc_4a3c_b985_8f0e9044dce4(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b3076964_ecad_44cb_a697_52fa1f677bbc(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_4cd4bd34_6afb_47a0_86e0_ebccad794277(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ece63057_b8d8_4527_a5c3_8352c29fce1a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_745cbcb5_3475_4d21_b90d_faf30d57cfa5(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer number : nums) {
            if (number > 0) {
                count++;
            }
        }
        return nums.size() /  count;
    }

    
    public static float positiveCount_Problem_2_7d2b1486_f1d5_4ec3_a649_53431fa1691b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_264785d7_8b79_4ea9_9bee_224ebed684be(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_49a65ba9_3e65_462f_ae29_ca486c894aa8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_2152d958_9c5e_485d_87b0_f77fabc31e10(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        float x = sum / nums.size();
        return Math.round(x * 100) / 100.0;
    }

    
    public static float positiveCount_Problem_2_19eebb49_1942_4780_9398_b0c6e5354a57(ArrayList<Integer> nums) {
        float f = 0;
        for (int n : nums) {
            if (n > 0) {
                f += 1.0; // +1 to convert float to int
            }
        }
        return f;
    }

    
    public static float positiveCount_Problem_0_b9d3bfaa_a49e_4915_a222_9ca54d23b9db(ArrayList<Integer> nums) {
        float counter = 0;
        for(int i : nums) {
            if(i > 0) counter++;
        }
        return counter;
    }

    
    public static float positiveCount_Problem_1_357e314a_4333_47fc_802e_3a47da9f9d07(ArrayList<Integer> nums) {
        int count = 0;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>0)
            {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_1_f65be203_7da3_49f9_9f2d_414808f84638(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_2dd1293f_818d_4b3d_8925_133fa0a82983(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b1e96caa_e462_4bf9_83bd_ea89802d62d9(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count += 1;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_0_84cef61c_9e0b_41cf_9756_e81491977c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f27633dc_b69e_42c6_a717_338553f5f2ab(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_53aa7213_a909_44ff_8982_0fe0a3bc1291(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4299d0bc_d5f2_4eff_9673_fc96f28e5c10(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a553e412_83a7_4641_a559_8af3e510bcea(ArrayList<Integer> nums) {
        // TODO: Write your code here
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int[] positive = new int[nums.size()];
        int i = 0;
        for (Integer num : nums) {
            if (num >= 0) {
                positive[i] = num;
            }
            sum += positive[i];
            i++;
        }
        float result = sum / positive.length;
        return result;
    }

    
    public static float positiveCount_Problem_0_5b3d51ef_031f_4b2c_9a18_5c585564f4d5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea(ArrayList<Integer> nums) {
        int count =  nums.size();
        double positiveCount_Problem_2_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = 0;
        int total = 0;
        for(Integer number : nums) {
            total = total + number;
        }
        for(Integer number : nums) {
            double n = number;
            if(n > 0)
                positiveCount_Problem_2_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = positiveCount_Problem_2_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea + 1;
        }
        return  (positiveCount_Problem_2_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea * 1.0 / count);
    }

    
    public static float positiveCount_Problem_0_3e3cff8f_42bc_4ed4_a6be_0b79f2fd3023(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ece63057_b8d8_4527_a5c3_8352c29fce1a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_14135a39_3482_4408_b829_958162d498ab(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_9e5f50b5_0616_45fc_9d06_8414cd9fe661(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_bff41036_9c2d_41c8_b102_4dcf8d2be42c(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e1fcdfb3_acb8_4adc_8c08_8cce28085c89(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_836792e4_5574_4395_a791_12fe4d68b82b(ArrayList<Integer> nums) {
        float count = 0.0;
        for (Integer i : nums)
            if (i > 0)
                count += i;
        return count;
    }

    
    public static float positiveCount_Problem_0_dc655887_2241_4dd4_99ff_350ed426ebb2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_1fa8b85b_b5a6_4e0c_ba4d_0dec883afbe7(ArrayList<Integer> nums) {
        if (nums == null)
            return Float.NaN;
        int count = 0;
        for (Integer n : nums) {
            if (n > 0) {
                count += 1;
            }
        }
        return count > 0 ?  (count / nums.size()) : 0;
    }

    
    public static float positiveCount_Problem_0_ef8f0145_89d1_4fa0_a720_54b99def0dfd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d93e972c_558a_481c_9c47_aab33c6a7a69(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b10fcc00_c09c_409a_80f0_1fce78295703(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ae8c446b_4d2f_477a_a31c_93f46b61b306(ArrayList<Integer> nums) {
        float result = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0) {
                result += nums.get(i);
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_0_ed4d96d8_aad0_4991_9055_04372ac0e506(ArrayList<Integer> nums) {
        int n = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                n++;
            }
        }
        float pos =  n / nums.size();
        return pos;
    }

    
    public static float positiveCount_Problem_0_ee12073b_0621_47ab_9bf5_f6eb3b27e9d4(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_f27633dc_b69e_42c6_a717_338553f5f2ab(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_68af171e_947f_4b71_8ce6_6e8261519751(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e7d1d20c_7c48_4d9d_9321_aca8c91d205d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_fbec8f44_20c6_4d29_b428_4eb7bfdb5718(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_3f24a673_ebec_4ae2_b1ed_0a3e4b083713(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_e8b299fa_8f49_4adf_b4c6_8928305b5ef6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_607a0709_6a57_467a_b3a5_f52f784cbe43(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num : nums){
            sum += num;
        }
        float result = sum / nums.size();
        return result;
    }

    
    public static float positiveCount_Problem_1_49a65ba9_3e65_462f_ae29_ca486c894aa8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d7fa467f_9189_46f3_8023_a1631fd7e0bb(ArrayList<Integer> nums) {
        int positive=0;
        for (Integer num: nums) {
            if (num>0) {
                positive+=1;
            }
        }
        return positive/nums.size();
    }

    
    public static float positiveCount_Problem_0_47037104_5b96_49bf_8466_9c2be7966f5d(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_9dfc3ebb_7fe9_4ebe_b549_d6431c4ef905(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_5b7f8207_6c16_421a_8af2_c10c1aaeb954(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_53aa7213_a909_44ff_8982_0fe0a3bc1291(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_bf5100fe_b405_4b43_8502_6ab772b433c1(ArrayList<Integer> nums) {
        // Use a loop to traverse the list and count the positive number of elements in the list.
        float count = 0.0;
        for (int num : nums) {
            if (num > 0) {
                count += num;
            }
        }
        // Return the count of the positive numbers.
        return count;
    }

    
    public static float positiveCount_Problem_1_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2(ArrayList<Integer> nums) {
        int positiveCount_Problem_1_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2 = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_1_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2++;
            }
        }
        return positiveCount_Problem_1_da09b775_ae4c_4e86_a2c3_dd2e9ead8ba2 / nums.size();
    }

    
    public static float positiveCount_Problem_2_89e4939b_28a1_470c_9e5f_96d7779cb302(ArrayList<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        // Your code here
        int temp = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                temp++;
            }
        }
        float counter =  temp / nums.size();
        return counter;
    }

    
    public static float positiveCount_Problem_2_6625c594_a322_41c2_a4fa_8fc3a2224fd7(ArrayList<Integer> nums) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            num = nums.get(i);
            if (num < 0) {
                num = sum - num;
            }
        }
        return num / nums.size();
    }

    
    public static float positiveCount_Problem_0_c8416cea_2bea_469b_90bd_407ed242476c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_3a3a1a56_c04d_4ad0_974d_4e17e883b9da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_774ad0f8_c24e_418c_a311_931f43ed4fac(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_b0722bd9_9703_4058_9df2_6f5ede5142bc(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_81156ac8_7c6e_4edf_a20b_46b12c33b2c5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ffe1ed6f_5277_4d15_af51_9f4f5f4aa91e(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer number : nums)
            if (number > 0)
                count++;
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_2_57a4bc19_2349_4487_8741_145f81c53d2f(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0L;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_606c1323_5ede_4129_987f_8703b927c278(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_352aaaeb_6f1d_421a_a573_579acaffaf7d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_f1380744_277b_4e1e_b387_faf1300dde5c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_dcfcf06e_23b5_4ce4_8dea_5e85749b6bb1(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_93782f89_b48f_4900_aeb3_6724e0dcb930(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_97f38d3d_9600_4dda_b645_11c8e50d50aa(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f3cc2682_95b1_4dec_941b_d188a1f216c7(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_55b04624_bbb7_47b7_84d2_18701f3ffa84(ArrayList<Integer> nums) {
        float total = 0.0;
        for (int num : nums) {
            if (num > 0) {
                total += num;
            }
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_0_352aaaeb_6f1d_421a_a573_579acaffaf7d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_dafc2de1_89df_45bb_9f15_196bb4a68ded(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_32b36e08_0a43_4d4a_ae48_0e65a1f9d371(ArrayList<Integer> nums) {
        float ans = 0.0;
        for (Integer num : nums) {
            if (num > 0) ans += 1;
        }
        return ans;
    }

    
    public static float positiveCount_Problem_2_0fb1e88d_1b90_44f2_9c40_9b1f62ee2b0e(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_66bd558f_9bc1_4d2f_a824_aa576d064d00(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_73933fec_52d8_4626_b81d_72298689beb6(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                sum += nums.get(i);
            }
        }
        return  (sum /  nums.size());
    }

    
    public static float positiveCount_Problem_0_90797491_841e_4e8d_b252_d85cc64a7966(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_03b7bb63_0e45_44ec_8e18_e22d48f45be2(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_25d0b874_09dd_41c1_92b6_00d17fba7b52(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3d418584_d242_4658_a030_91d769d49d73(ArrayList<Integer> nums) {
        float result = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                result +=  nums.get(i)/i;
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_0_dafc2de1_89df_45bb_9f15_196bb4a68ded(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_5a32d68c_e7d5_4b44_804d_8ea892a6cd8d(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_3a6ac929_4747_4471_baa0_05b46839a370(ArrayList<Integer> nums) {
        float positiveCount_Problem_2_3a6ac929_4747_4471_baa0_05b46839a370 = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                positiveCount_Problem_2_3a6ac929_4747_4471_baa0_05b46839a370 += nums.get(i);
            }
        }
        return positiveCount_Problem_2_3a6ac929_4747_4471_baa0_05b46839a370;
    }

    
    public static float positiveCount_Problem_0_01a5591e_b09f_484b_8b7d_fe296cf15d49(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_01a5591e_b09f_484b_8b7d_fe296cf15d49(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_78dcf44f_d0c8_4c1b_be1c_c0c9ae16455f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_8071a0f8_df22_4240_97f8_8806324174e0(ArrayList<Integer> nums) {
        float positives = 0;
        for(int num : nums)
        {
            if(num > 0)
                positives++;
        }
        System.out.println("Positive Count : " + positives);
        return positives;
    }

    
    public static float positiveCount_Problem_0_10f505b2_3d06_4807_bef9_3e31fb9fb7e0(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_49b3afcc_6591_4d04_8257_a04562532762(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_251bcaf0_8efc_4e1f_a133_69351aad6625(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_8adccbfb_1cbf_4877_a832_58e333873f8f(ArrayList<Integer> nums) {
        float result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                result += nums.get(i);
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_0_212c65f5_7601_4b77_968c_79d1b2d701ce(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer l : nums) {
            sum += l;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b0dc289e_aa03_44f6_8a2d_9992b482dbdc(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_19d7a008_c45e_495c_ade7_b83143e32197(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b2f7e401_5dc6_4ae8_aa02_ddae4caad93f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_3918ec0b_00fb_49da_936e_86b5cfd33c28(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d722fd01_2701_4b7c_ba35_29ab4ac392aa(ArrayList<Integer> nums) {
        float sum = 0.0;
        for (Integer i : nums) {
            if (i >= 0L) {
                sum += 1.0;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_ef8f0145_89d1_4fa0_a720_54b99def0dfd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_65116566_4684_41d8_8e50_eff46179f864(ArrayList<Integer> nums) {
        float numPositives = 0f;
        for (Integer i : nums) {
            if (i >= 0f) {
                numPositives += 1;
            }
        }
        return numPositives / nums.size();
    }

    
    public static float positiveCount_Problem_2_a7559f95_0955_46b6_860d_836fd3b69471(ArrayList<Integer> nums) {
        int positiveCount_Problem_2_a7559f95_0955_46b6_860d_836fd3b69471 = 0;
        // Your code goes here
        if (nums.isEmpty()) {
            return 0;
        }
        else {
            for (Integer num : nums) {
                if (num > 0) {
                    positiveCount_Problem_2_a7559f95_0955_46b6_860d_836fd3b69471 = positiveCount_Problem_2_a7559f95_0955_46b6_860d_836fd3b69471 + 1;
                }
            }
        }
        return positiveCount_Problem_2_a7559f95_0955_46b6_860d_836fd3b69471;
    }

    
    public static float positiveCount_Problem_0_694405b0_b600_45e4_a3cd_207ba90cc8d0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_7c740a9c_b686_458b_85d3_3eb0662a3c60(ArrayList<Integer> nums) {
        int positiveCount_Problem_1_7c740a9c_b686_458b_85d3_3eb0662a3c60 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_1_7c740a9c_b686_458b_85d3_3eb0662a3c60++;
            }
        }
        return positiveCount_Problem_1_7c740a9c_b686_458b_85d3_3eb0662a3c60 / nums.size();
    }

    
    public static float positiveCount_Problem_1_ddeac472_1b9c_4b74_9dd5_9d5014e91f49(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_5880eb83_54a0_4917_8201_c13682f95a2a(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_44da69f7_aa05_40e3_8ba9_1cec4e996cd0(ArrayList<Integer> nums) {
        float count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_0_27dfb5bb_6f76_4efc_9854_c6e96c05645e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_bff41036_9c2d_41c8_b102_4dcf8d2be42c(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_157dd1ab_cfd2_4e83_886e_4f6a3639d698(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0){
                count++;
            }
        }
        return (count)/nums.size();
    }

    
    public static float positiveCount_Problem_2_e8b1b6bb_469d_4c53_8bf9_3f7c94a92963(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_7bba52ae_b41f_41be_9eeb_0663a1c5726e(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_1adaf0cc_0290_4340_96c3_820f32dbac61(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_abc6ff0d_5ecd_4ce6_ad66_1c5debb4bbfd(ArrayList<Integer> nums) {
        // Find number of positive integers
        // Using streams 
        int posNums = nums.stream().filter(v -> v > 0).count();
        // Using for loop
        // int posNums = 0;
        // for (Integer num : nums) {
        // if (num > 0) {
        // posNums++;
        // }
        // }
        // return posNums / nums.size();
        return posNums / nums.size();
    }

    
    public static float positiveCount_Problem_1_a3a172ab_4521_465b_9a10_500a318b7291(ArrayList<Integer> nums) {
        int positiveCount_Problem_1_a3a172ab_4521_465b_9a10_500a318b7291 = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_1_a3a172ab_4521_465b_9a10_500a318b7291 += 1;
            }
        }
        return positiveCount_Problem_1_a3a172ab_4521_465b_9a10_500a318b7291;
    }

    
    public static float positiveCount_Problem_0_f5c7d190_629c_4d3f_95fc_1919d1e74a37(ArrayList<Integer> nums) {
        float total = 0;
        for (Integer num : nums)
            if (num > 0) total++;
        return total;
    }

    
    public static float positiveCount_Problem_2_1a577f47_fcb9_42ff_9f06_ff94f45bf145(ArrayList<Integer> nums) {
        int n = 0;
        for (int i : nums) {
            if (i >= 0) {
                n += 1;
            }
        }
        return n / nums.size();
    }

    
    public static float positiveCount_Problem_0_b3076964_ecad_44cb_a697_52fa1f677bbc(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_b46364af_6211_49a1_b0c5_823a302e8e99(ArrayList<Integer> nums) {
        return  nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_9f73602a_49c7_4035_8909_ea6df1daafcd(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_21ddbeb5_0881_4969_a1fb_0ab3de06e5c6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_dad7b4df_f30b_46ec_aacd_d89ebfe9a2a1(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_8c87569e_d266_4b1b_b685_f77b023cacae(ArrayList<Integer> nums) {
        int len = nums.size();
        float pos =  0.0;
        for (int i = 0; i < len; i++) {
            pos += nums.get(i);
        }
        return pos / len;
    }

    
    public static float positiveCount_Problem_0_5ab08fdd_b131_44ea_8818_3563d36bb16e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d1ae0399_9397_4074_96f9_91f2d6d77d5f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_6c996a51_dfc0_4347_964f_8fb3dc96c89c(ArrayList<Integer> nums) {
        int numsSum = nums.stream().mapToInteger(x -> x).sum();
        float positiveCount_Problem_2_6c996a51_dfc0_4347_964f_8fb3dc96c89c =  nums.size() / numsSum;
        return positiveCount_Problem_2_6c996a51_dfc0_4347_964f_8fb3dc96c89c;
    }

    
    public static float positiveCount_Problem_1_49b84590_8873_4597_b959_c0c9d581a882(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_9f7a028a_4986_4405_bc3f_8821b5974f3a(ArrayList<Integer> nums) {
        // TODO: Write your code
        // This variable will hold the count of positive integers in the array
        int count = 0;
        // This variable will hold an array containing the list of positive integers in the array
        int[] arr = new int[nums.size()];
        // This variable will hold the current number of positive integers in the array
        int i = 0;
        for (Integer val : nums)
        {
            arr[i] = val;
            i++;
        }
        for (int num : arr) {
            // If number is positive, increase the count by 1
            if(num > 0) {
                count++;
            }
        }
        float floatCount = count /  nums.size();
        return floatCount;
    }

    
    public static float positiveCount_Problem_2_dbd7b724_45c2_43d0_ab67_594e93843a3a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_73b6201e_33ec_4ca8_a8c6_85c123184986(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_18cf30a2_439c_4d03_90b6_3ea2e5fc402c(ArrayList<Integer> nums) {
        return  nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_8efa74f2_e897_4570_885e_cdd384b9c2c4(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_a72e328c_c5cd_4aed_b40a_489f86478b5d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea(ArrayList<Integer> nums) {
        int count =  nums.size();
        double positiveCount_Problem_0_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = 0;
        int total = 0;
        for(Integer number : nums) {
            total = total + number;
        }
        for(Integer number : nums) {
            double n = number;
            if(n > 0)
                positiveCount_Problem_0_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = positiveCount_Problem_0_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea + 1;
        }
        return  (positiveCount_Problem_0_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea * 1.0 / count);
    }

    
    public static float positiveCount_Problem_0_b2f54f87_6121_4b4e_a2e0_7e616afd4342(ArrayList<Integer> nums) {
        float sum=0;
        for(Integer i : nums)
        {
            if(i>0)
            {
                sum++;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_abc6ff0d_5ecd_4ce6_ad66_1c5debb4bbfd(ArrayList<Integer> nums) {
        // Find number of positive integers
        // Using streams 
        int posNums = nums.stream().filter(v -> v > 0).count();
        // Using for loop
        // int posNums = 0;
        // for (Integer num : nums) {
        // if (num > 0) {
        // posNums++;
        // }
        // }
        // return posNums / nums.size();
        return posNums / nums.size();
    }

    
    public static float positiveCount_Problem_1_6625c594_a322_41c2_a4fa_8fc3a2224fd7(ArrayList<Integer> nums) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            num = nums.get(i);
            if (num < 0) {
                num = sum - num;
            }
        }
        return num / nums.size();
    }

    
    public static float positiveCount_Problem_0_f3cc2682_95b1_4dec_941b_d188a1f216c7(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_52e96c49_3925_4217_9c98_8b8367f1427d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_41eb5f57_363e_48af_b63a_b2de768fe591(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count /  nums.size();
    }

    
    public static float positiveCount_Problem_1_dcc12537_c254_4173_883c_c9c08c84fb4d(ArrayList<Integer> nums) {
        float sum=0;
        float counter=0 ;
        for (int i:nums)
        {
            if (i>0)
            {
                counter++;
            }
        }
        for (int i:nums)
        {
            if (i<0)
            {
                sum+=i;
            }
        }
        return sum/counter;
    }

    
    public static float positiveCount_Problem_1_07eaa59f_48e0_4508_9cba_baf6085dca08(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_727b0934_e057_4bd7_81bc_41b14c244f2f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_12a1ae80_6bc3_4ce9_a406_b8e2904945c0(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_8fb96209_bea6_4a17_a441_03923dee4de8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_296dd56d_185a_4c21_9759_092e9c1b3fca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3168b8e3_f748_487d_9f8f_a88c11c3b5da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_2152d958_9c5e_485d_87b0_f77fabc31e10(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        float x = sum / nums.size();
        return Math.round(x * 100) / 100.0;
    }

    
    public static float positiveCount_Problem_2_2985ddf7_f7c0_43db_906a_8909672d1101(ArrayList<Integer> nums) {
        int total = 0;
        for (int val : nums) {
            if (val >= 0)
                total += val;
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_2_3b718b97_6cf2_41c7_9463_aeffd9e5393f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int a : nums) {
            if(a>0)
                sum+=a;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_2_ca5fa246_d825_495f_8a96_679d13c1a45d(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count+=1;
            }
        }
        float ratio=count/nums.size();
        return ratio;
    }

    
    public static float positiveCount_Problem_2_31587509_d845_4f25_b52a_b6facbb8d740(ArrayList<Integer> nums) {
        float numZero = 0;
        float numPositive = 0;
        float numNegative = 0;
        float numTotal = 0;
        for (Integer num : nums) {
            if (num > 0) {
                numTotal += num;
                if (num < 0) {
                    numNegative += num;
                } else {
                    numPositive += num;
                }
            } else {
                numZero += num;
            }
        }
        return (numTotal / nums.size());
    }

    
    public static float positiveCount_Problem_1_fd2f7cb0_8b12_4692_a009_3dc49bf05f0b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_bf5100fe_b405_4b43_8502_6ab772b433c1(ArrayList<Integer> nums) {
        // Use a loop to traverse the list and count the positive number of elements in the list.
        float count = 0.0;
        for (int num : nums) {
            if (num > 0) {
                count += num;
            }
        }
        // Return the count of the positive numbers.
        return count;
    }

    
    public static float positiveCount_Problem_2_fd2f7cb0_8b12_4692_a009_3dc49bf05f0b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_dc655887_2241_4dd4_99ff_350ed426ebb2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ca969cc9_12e0_4b6f_bbba_f645420de731(ArrayList<Integer> nums) {
        float total = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0)
                total += nums.get(i);
        }
        return total;
    }

    
    public static float positiveCount_Problem_0_9997cfe4_8c66_40e4_a376_eb041e249341(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums)
            sum += num;
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_0_ad0f597c_8739_446d_be2b_fb6265ecc73b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_99536627_5d95_4141_84ff_9f9649395c86(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_2880f3ba_8de0_480f_89e2_3669ac034391(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d936d0ef_6c0b_4c58_8382_6e8edda5559e(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer value : nums) {
            sum += value;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_963a107b_2e80_4807_bed4_21ff520ce1b4(ArrayList<Integer> nums) {
        float sum = 0f;
        for(Integer i : nums) {
            if(i != 0) sum += i;
        }
        return sum /  nums.size();
    }

    
    public static float positiveCount_Problem_2_745cbcb5_3475_4d21_b90d_faf30d57cfa5(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer number : nums) {
            if (number > 0) {
                count++;
            }
        }
        return nums.size() /  count;
    }

    
    public static float positiveCount_Problem_0_bc7e5499_d5f0_431c_a252_8c5826e03137(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_0_b8cdc2f7_4965_4b8d_b01b_55d13b3dee9f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_2c740f42_bc84_4a9b_ab3c_931b62c9bde6(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums){
            sum = sum + num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_b6023ce0_ef9a_48c1_86b0_e2311323d0ce(ArrayList<Integer> nums) {
        float positive = 0;
        for(Integer num : nums) {
            if(num > 0) {
                positive++;
            }
        }
        return positive;
    }

    
    public static float positiveCount_Problem_1_da690a77_72e8_4aa5_b40b_7dfdfbd4e83d(ArrayList<Integer> nums) {
        // write code here
        
        int sum =0;
        for(int i =0; i < nums.size(); i++){
        sum+=nums.get(i);
        }
        
        float result= sum/nums.size();
        
        return result;
        
        
    }

    
    public static float positiveCount_Problem_0_8fb96209_bea6_4a17_a441_03923dee4de8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ffcdf406_5213_4f8e_a56f_87183ac16c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_03b7bb63_0e45_44ec_8e18_e22d48f45be2(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_5a2efeb7_03ec_4b3e_bb2e_9c5f89314112(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_25f4384d_b1f7_4473_8325_d4bc2ad32ba8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_74b67af2_8a7f_4f73_9bc6_a64320529e35(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4b92e137_2a90_4caf_9a55_183cdbfaefe0(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            if (i == null || i < 0) continue;
            sum += i;
        }
        if (sum > 0) {
            for (Integer i : nums) {
                if (i == null || i < 0) continue;
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_1b0b5eb4_c063_48b5_9b16_0249bcafe839(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_dad7b4df_f30b_46ec_aacd_d89ebfe9a2a1(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d722fd01_2701_4b7c_ba35_29ab4ac392aa(ArrayList<Integer> nums) {
        float sum = 0.0;
        for (Integer i : nums) {
            if (i >= 0L) {
                sum += 1.0;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_e0c7c9d4_403d_4bbd_8cce_d9e18a0e4e5d(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_a3c7922a_371b_4b5e_978a_8c5b268efe70(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_89e4939b_28a1_470c_9e5f_96d7779cb302(ArrayList<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        // Your code here
        int temp = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                temp++;
            }
        }
        float counter =  temp / nums.size();
        return counter;
    }

    
    public static float positiveCount_Problem_1_21979fe3_bf83_4809_8b47_0465d674f88c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_16788c01_4e82_44e1_879f_1502041e3ce5(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_2b676495_9ac6_489b_ba07_ee457a4b3ed5(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_25f4384d_b1f7_4473_8325_d4bc2ad32ba8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b46364af_6211_49a1_b0c5_823a302e8e99(ArrayList<Integer> nums) {
        return  nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_0_a0716193_33f3_4718_bbd3_b83900634fe5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_d59c27fe_13bc_4735_be3f_e895e5ff6bc8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ace5663c_ceee_4761_98fb_e162d46c0a50(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3168b8e3_f748_487d_9f8f_a88c11c3b5da(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_4157f5c7_5ee7_4b91_a148_4b95702d374d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_52e96c49_3925_4217_9c98_8b8367f1427d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_68a9a7be_d6b0_4faa_89cd_60f37bdf315f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_470fe01c_5959_4724_b46e_4fc8bb981c7c(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return  count /  nums.size();
    }

    
    public static float positiveCount_Problem_2_3e3cff8f_42bc_4ed4_a6be_0b79f2fd3023(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ab7404de_555c_4a57_ae20_f67284f22726(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_7bb475f3_4c89_4f6b_9c5e_63d61016ac7e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_60c1d308_abcd_4a3d_8921_0d9b74da12e7(ArrayList<Integer> nums) {
        int positives = 0;
        for (Integer n : nums)
            if (n > 0) positives++;
        return positives/nums.size();
    }

    
    public static float positiveCount_Problem_1_e30aec64_56a0_4dfa_9246_514b111e13f7(ArrayList<Integer> nums) {
        // TODO implement your logic
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            count += nums.get(i);
        }
        return (count / nums.size()) * 100;
    }

    
    public static float positiveCount_Problem_2_bc7e5499_d5f0_431c_a252_8c5826e03137(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_1_31e5d394_1c5c_43fe_a6b9_c7bb4ebb1343(ArrayList<Integer> nums) {
        return nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_8b8b938e_beef_4313_9515_ccc9fa32cf3d(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer i : nums) {
            count += i;
        }
        return count;
    }

    
    public static float positiveCount_Problem_1_470fe01c_5959_4724_b46e_4fc8bb981c7c(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return  count /  nums.size();
    }

    
    public static float positiveCount_Problem_0_da690a77_72e8_4aa5_b40b_7dfdfbd4e83d(ArrayList<Integer> nums) {
        // write code here
        
        int sum =0;
        for(int i =0; i < nums.size(); i++){
        sum+=nums.get(i);
        }
        
        float result= sum/nums.size();
        
        return result;
        
        
    }

    
    public static float positiveCount_Problem_2_fb6756e4_0d9b_4433_9e33_60d268fbfb44(ArrayList<Integer> nums) {
        float sum = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            sum += nums.get(i);
        }
        return sum / size;
    }

    
    public static float positiveCount_Problem_0_802a3c03_3d8f_4b0b_947a_27e8871dd339(ArrayList<Integer> nums) {
        int total = 0; // initialise total
        int sum = 0; // initialise sum
        for (int i = 0; i < nums.size(); i++) { // for each number in array
            total += nums.get(i); // add it to total
            if (nums.get(i) > 0) // if it is a positive number
                sum += nums.get(i); // add to sum
        }
        return  (sum / total); // find ratio of positive numbers in nums
    }

    
    public static float positiveCount_Problem_0_6472a29e_9ccf_4657_b523_ca4b05b62696(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_ffcdf406_5213_4f8e_a56f_87183ac16c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_e8b299fa_8f49_4adf_b4c6_8928305b5ef6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_6c996a51_dfc0_4347_964f_8fb3dc96c89c(ArrayList<Integer> nums) {
        int numsSum = nums.stream().mapToInteger(x -> x).sum();
        float positiveCount_Problem_1_6c996a51_dfc0_4347_964f_8fb3dc96c89c =  nums.size() / numsSum;
        return positiveCount_Problem_1_6c996a51_dfc0_4347_964f_8fb3dc96c89c;
    }

    
    public static float positiveCount_Problem_1_3367e237_5d27_445b_a3fc_d47766fc4717(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ef1f4e7a_2f19_4bda_a82b_86648fe9f5d8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_2c740f42_bc84_4a9b_ab3c_931b62c9bde6(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums){
            sum = sum + num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_0827d553_7b38_432d_9993_0e1faca03cc3(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_25d0b874_09dd_41c1_92b6_00d17fba7b52(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b2956a90_310d_48d6_b805_0d693c39392f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_5b7f8207_6c16_421a_8af2_c10c1aaeb954(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_727b0934_e057_4bd7_81bc_41b14c244f2f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_584da510_4a8e_4ed0_a7eb_881b6f63932d(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer l : nums) {
            if (l > 0) {
                count++;
            }
        }
        return count / (nums.size());
    }

    
    public static float positiveCount_Problem_2_84cef61c_9e0b_41cf_9756_e81491977c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_7842d77c_12a6_4f82_8b4e_facb2afcd01c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_27dfb5bb_6f76_4efc_9854_c6e96c05645e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_fc622c54_c54e_4067_bc71_f557ae41b176(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_50ada033_e58e_4a88_8c34_73bd866a624a(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_29f3e9e5_16ec_4bda_bfcb_148727d0b8c7(ArrayList<Integer> nums) {
        float totalCount = 0;
        for (Integer l : nums) {
            if (l > 0) totalCount++;
        }
        return totalCount;
    }

    
    public static float positiveCount_Problem_0_abefaf49_59d5_4582_8724_3b858e5b130e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_86e461aa_ae59_43ab_a05e_47b3931d0f6c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_dcfcf06e_23b5_4ce4_8dea_5e85749b6bb1(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_49b84590_8873_4597_b959_c0c9d581a882(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_949915bd_941b_4f5a_8e93_c3453dfd91b9(ArrayList<Integer> nums) {
        float numsSum = 0;
        int count = 0;
        int sum = 0;
        for(int num : nums) {
            numsSum += num;
            count += 1;
            sum += num;
        }
        return (numsSum / sum);
    }

    
    public static float positiveCount_Problem_0_0015cab6_2eae_45dd_813f_3596e4efc62f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_a3a172ab_4521_465b_9a10_500a318b7291(ArrayList<Integer> nums) {
        int positiveCount_Problem_2_a3a172ab_4521_465b_9a10_500a318b7291 = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_2_a3a172ab_4521_465b_9a10_500a318b7291 += 1;
            }
        }
        return positiveCount_Problem_2_a3a172ab_4521_465b_9a10_500a318b7291;
    }

    
    public static float positiveCount_Problem_1_745cbcb5_3475_4d21_b90d_faf30d57cfa5(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer number : nums) {
            if (number > 0) {
                count++;
            }
        }
        return nums.size() /  count;
    }

    
    public static float positiveCount_Problem_2_3f24a673_ebec_4ae2_b1ed_0a3e4b083713(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_aadee095_43a6_4c3f_bc84_d8403b3514e2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_714cfd6e_7acd_4692_8bbf_d8d6214b1714(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_07ab4e61_0cc4_4bb8_8213_29827f9212dd(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float positiveCount_Problem_2_ddeac472_1b9c_4b74_9dd5_9d5014e91f49(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_abc6ff0d_5ecd_4ce6_ad66_1c5debb4bbfd(ArrayList<Integer> nums) {
        // Find number of positive integers
        // Using streams 
        int posNums = nums.stream().filter(v -> v > 0).count();
        // Using for loop
        // int posNums = 0;
        // for (Integer num : nums) {
        // if (num > 0) {
        // posNums++;
        // }
        // }
        // return posNums / nums.size();
        return posNums / nums.size();
    }

    
    public static float positiveCount_Problem_1_3b534b87_64b1_43df_9e7e_0388ae27b80c(ArrayList<Integer> nums) {
        float pCount = 0; 
        for(int i= 0; i < nums.size(); i++){
            if(nums.get(i)>0){
                pCount++;
            }
        }
        return pCount;
    }

    
    public static float positiveCount_Problem_0_ffe1ed6f_5277_4d15_af51_9f4f5f4aa91e(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer number : nums)
            if (number > 0)
                count++;
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_2_c8416cea_2bea_469b_90bd_407ed242476c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_63d8be01_a3c0_4c01_9fb7_5c323f9d6770(ArrayList<Integer> nums) {
        float sum = 0f;
        for (int number : nums) {
            if (number > 0)
                sum += number;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_893acd76_8f9c_435d_ab68_a8b6880ca7b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ad0f597c_8739_446d_be2b_fb6265ecc73b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_50ada033_e58e_4a88_8c34_73bd866a624a(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e2cb4057_43d3_4a06_86d9_241c05354717(ArrayList<Integer> nums) {
        // Declare and initialize variables
        int n = nums.size();
        float counter = -1;
        for(int i = 0; i < n; i++){
            if(nums.get(i) > 0){
                counter +=  nums.get(i);
            }
        }
        return counter;
    }

    
    public static float positiveCount_Problem_2_9f73602a_49c7_4035_8909_ea6df1daafcd(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_49b3afcc_6591_4d04_8257_a04562532762(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_def852e5_0294_4db1_9fa0_a0742f4e6a0d(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        float result = sum / nums.size();
        return result;
    }

    
    public static float positiveCount_Problem_0_2b676495_9ac6_489b_ba07_ee457a4b3ed5(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_1dd08f31_160f_4494_a4c7_e9230ec72d98(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_29f3e9e5_16ec_4bda_bfcb_148727d0b8c7(ArrayList<Integer> nums) {
        float totalCount = 0;
        for (Integer l : nums) {
            if (l > 0) totalCount++;
        }
        return totalCount;
    }

    
    public static float positiveCount_Problem_2_78a3e2d6_38b0_4a72_8e8a_e90488191e50(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_22c282ba_98e9_4cdc_881f_53346c52dfe9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_39ef7acf_3297_45b9_a16b_d13887581f07(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4cfdf990_585c_461f_9b09_1ca16541fb2a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_da690a77_72e8_4aa5_b40b_7dfdfbd4e83d(ArrayList<Integer> nums) {
        // write code here
        
        int sum =0;
        for(int i =0; i < nums.size(); i++){
        sum+=nums.get(i);
        }
        
        float result= sum/nums.size();
        
        return result;
        
        
    }

    
    public static float positiveCount_Problem_1_2c46bb73_fd40_4b21_8081_768d716c16b9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums)
            if (n >= 0)
                sum += n;
        return sum;
    }

    
    public static float positiveCount_Problem_2_5a2efeb7_03ec_4b3e_bb2e_9c5f89314112(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_d59c27fe_13bc_4735_be3f_e895e5ff6bc8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_5ba6669f_754d_4c4a_ae6f_f809c53ce7ca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_0ef6b51c_a521_46ee_9e7c_044841f525e5(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer number : nums) {
            count += number;
        }
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_1_63d8be01_a3c0_4c01_9fb7_5c323f9d6770(ArrayList<Integer> nums) {
        float sum = 0f;
        for (int number : nums) {
            if (number > 0)
                sum += number;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_9bb78580_8ffb_4354_b474_fe30195987b3(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_f1380744_277b_4e1e_b387_faf1300dde5c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_dcc12537_c254_4173_883c_c9c08c84fb4d(ArrayList<Integer> nums) {
        float sum=0;
        float counter=0 ;
        for (int i:nums)
        {
            if (i>0)
            {
                counter++;
            }
        }
        for (int i:nums)
        {
            if (i<0)
            {
                sum+=i;
            }
        }
        return sum/counter;
    }

    
    public static float positiveCount_Problem_0_a6d77900_6123_4e75_b4b9_dee2900bdc3f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4d266f8a_f022_42c7_aa9b_28f05c5909d1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b03bf1de_a3d9_422e_82d6_d702cfb00c80(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_e2cb4057_43d3_4a06_86d9_241c05354717(ArrayList<Integer> nums) {
        // Declare and initialize variables
        int n = nums.size();
        float counter = -1;
        for(int i = 0; i < n; i++){
            if(nums.get(i) > 0){
                counter +=  nums.get(i);
            }
        }
        return counter;
    }

    
    public static float positiveCount_Problem_1_8adccbfb_1cbf_4877_a832_58e333873f8f(ArrayList<Integer> nums) {
        float result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                result += nums.get(i);
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_0_d9cea3ce_640e_4afa_b4cd_dc1fe15bd611(ArrayList<Integer> nums) {
        int a = 0;
        float numCount = 0;
        int n = 0;
        for (Integer i : nums) {
            if (i == n) {
                a++;
                numCount++;
            }
            n = i;
        }
        if (numCount == 0) {
            return 0;
        } else {
            float result = 0;
            float p = 1;
            while (a > 0) {
                result += p;
                p *= 10;
                a--;
            }
            return result;
        }
    }

    
    public static float positiveCount_Problem_0_ca5fa246_d825_495f_8a96_679d13c1a45d(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count+=1;
            }
        }
        float ratio=count/nums.size();
        return ratio;
    }

    
    public static float positiveCount_Problem_0_78dcf44f_d0c8_4c1b_be1c_c0c9ae16455f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6b327000_0bbc_4a3c_b985_8f0e9044dce4(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_6dcd5e69_ad55_40c7_ac25_14e6f639e783(ArrayList<Integer> nums) {
        float positiveCount_Problem_1_6dcd5e69_ad55_40c7_ac25_14e6f639e783 = 0;
        for (Integer num : nums) {
            if (num > 0) {
                positiveCount_Problem_1_6dcd5e69_ad55_40c7_ac25_14e6f639e783++;
            }
        }
        return positiveCount_Problem_1_6dcd5e69_ad55_40c7_ac25_14e6f639e783;
    }

    
    public static float positiveCount_Problem_2_3367e237_5d27_445b_a3fc_d47766fc4717(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_893acd76_8f9c_435d_ab68_a8b6880ca7b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_21ddbeb5_0881_4969_a1fb_0ab3de06e5c6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_66bd558f_9bc1_4d2f_a824_aa576d064d00(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_47037104_5b96_49bf_8466_9c2be7966f5d(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_1f438868_21c9_4bf0_bc07_d1a4d9f528cf(ArrayList<Integer> nums) {
        // TODO: Write your code here
        int count=0;
        for(Integer num:nums) {
            if(num>0) {
                count++;
            }
        }
        float sum=0;
        for(Integer num:nums) {
            float d=(num)/count;
            sum+=d;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_b568f06f_563c_476b_99cb_bf91255ae9e0(ArrayList<Integer> nums) {
        int size = nums.size();
        float ans = 0f;
        if (size == 0) return 0;
        if (size == 1) return nums.get(0);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        int prod = sum * nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i) - prod;
            ans += nums.get(i) - sum;
            prod = sum * nums.get(i);
        }
        return ans /  size;
    }

    
    public static float positiveCount_Problem_0_24ce0cf2_cb63_4d8b_852b_91a693f155e6(ArrayList<Integer> nums) {
        // Complete the code here.
        return 1.0;
    }

    
    public static float positiveCount_Problem_2_43da4096_f4fb_4d7c_819c_9b40d09cc3ef(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_9db7f816_8057_414d_8009_b2ec6eec4fc2(ArrayList<Integer> nums) {
        float npos = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                npos +=  nums.get(i) / nums.size();
            }
        }
        return npos;
    }

    
    public static float positiveCount_Problem_0_ad75622a_0091_416a_b296_de8be6d8612f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_5b3d51ef_031f_4b2c_9a18_5c585564f4d5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_bc336cf2_7c09_4bbd_bfca_2e64972669cd(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_607a0709_6a57_467a_b3a5_f52f784cbe43(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num : nums){
            sum += num;
        }
        float result = sum / nums.size();
        return result;
    }

    
    public static float positiveCount_Problem_1_dbd7b724_45c2_43d0_ab67_594e93843a3a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea(ArrayList<Integer> nums) {
        int count =  nums.size();
        double positiveCount_Problem_1_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = 0;
        int total = 0;
        for(Integer number : nums) {
            total = total + number;
        }
        for(Integer number : nums) {
            double n = number;
            if(n > 0)
                positiveCount_Problem_1_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea = positiveCount_Problem_1_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea + 1;
        }
        return  (positiveCount_Problem_1_92b97ac0_b153_4c62_9e5b_5a1f338fe3ea * 1.0 / count);
    }

    
    public static float positiveCount_Problem_2_40fc4e40_12a7_4d7b_a129_767ad9d54293(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_606c1323_5ede_4129_987f_8703b927c278(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_902006bb_ee7d_40a1_96b0_23ce453f743a(ArrayList<Integer> nums) {
        // Write your code here
        int positiveCount_Problem_2_902006bb_ee7d_40a1_96b0_23ce453f743a = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_2_902006bb_ee7d_40a1_96b0_23ce453f743a++;
            }
        }
        return positiveCount_Problem_2_902006bb_ee7d_40a1_96b0_23ce453f743a / nums.size();
    }

    
    public static float positiveCount_Problem_0_31e5d394_1c5c_43fe_a6b9_c7bb4ebb1343(ArrayList<Integer> nums) {
        return nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_b8cdc2f7_4965_4b8d_b01b_55d13b3dee9f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ed2ab3e7_1edb_4251_9755_21a368435e08(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_802a3c03_3d8f_4b0b_947a_27e8871dd339(ArrayList<Integer> nums) {
        int total = 0; // initialise total
        int sum = 0; // initialise sum
        for (int i = 0; i < nums.size(); i++) { // for each number in array
            total += nums.get(i); // add it to total
            if (nums.get(i) > 0) // if it is a positive number
                sum += nums.get(i); // add to sum
        }
        return  (sum / total); // find ratio of positive numbers in nums
    }

    
    public static float positiveCount_Problem_0_a20b537f_eb42_4847_bf9e_b3bb17f03cc5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b8cdc2f7_4965_4b8d_b01b_55d13b3dee9f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d6cee7c3_5e3a_40c1_9222_7f8faa9605a9(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_5e1c8b5a_ac4a_45a1_8c6e_2a4fe8cb2a6a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_44da69f7_aa05_40e3_8ba9_1cec4e996cd0(ArrayList<Integer> nums) {
        float count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_2_7bba52ae_b41f_41be_9eeb_0663a1c5726e(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_1f438868_21c9_4bf0_bc07_d1a4d9f528cf(ArrayList<Integer> nums) {
        // TODO: Write your code here
        int count=0;
        for(Integer num:nums) {
            if(num>0) {
                count++;
            }
        }
        float sum=0;
        for(Integer num:nums) {
            float d=(num)/count;
            sum+=d;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_fee17d3d_506b_4578_a115_1b0ae4af26b1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3e0821d4_3a2c_437e_bd6a_1b5934feb4dd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_992b4c40_88a6_441d_a985_455d7a82de8e(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_27048f32_7a37_4078_baf7_b5d3f9e4888f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ee12073b_0621_47ab_9bf5_f6eb3b27e9d4(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_9ebaf44e_7261_4ab4_aac5_cf07245ad110(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_296dd56d_185a_4c21_9759_092e9c1b3fca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ad0f597c_8739_446d_be2b_fb6265ecc73b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_367e58a1_3597_4709_af48_f06ee3a7ed6d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_44da69f7_aa05_40e3_8ba9_1cec4e996cd0(ArrayList<Integer> nums) {
        float count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_2_a38321c8_235e_4a15_908c_663583107d9b(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_90797491_841e_4e8d_b252_d85cc64a7966(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_c9d72ed9_19be_4675_aa34_cf191b050aec(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_6472a29e_9ccf_4657_b523_ca4b05b62696(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_50de1887_7748_4a42_a648_65c29aaf737f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_f8dceb70_35c8_46d7_8a66_f05f4f89566f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_c9d72ed9_19be_4675_aa34_cf191b050aec(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_53aa7213_a909_44ff_8982_0fe0a3bc1291(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_197db681_8678_4f15_a9b7_4089df67ec73(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_86e461aa_ae59_43ab_a05e_47b3931d0f6c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_1f438868_21c9_4bf0_bc07_d1a4d9f528cf(ArrayList<Integer> nums) {
        // TODO: Write your code here
        int count=0;
        for(Integer num:nums) {
            if(num>0) {
                count++;
            }
        }
        float sum=0;
        for(Integer num:nums) {
            float d=(num)/count;
            sum+=d;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_470fe01c_5959_4724_b46e_4fc8bb981c7c(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return  count /  nums.size();
    }

    
    public static float positiveCount_Problem_1_a20b537f_eb42_4847_bf9e_b3bb17f03cc5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_0f80a14d_1f37_4bda_bcdb_eda713d4d476(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_4d266f8a_f022_42c7_aa9b_28f05c5909d1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d71b0557_cd51_4abf_9200_c6c44bc81573(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums){
            if(num > 0) count++;
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_0_35891581_aeb1_4d13_9be4_666f281bf760(ArrayList<Integer> nums) {
        int positiveNums = 0;
        int total = 0;
        int negativeNums = 0;
        for(Integer i : nums) {
            if(i < 0) {
                negativeNums++;
            }
            else {
                positiveNums++;
            }
            total++;
        }
        return  positiveNums / total;
    }

    
    public static float positiveCount_Problem_2_ce8beefa_a3c0_4e6c_a383_158867225c58(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer n: nums) {
            if (n > 0) {
                count += 1;
            }
        }
        return (count) / nums.size();
    }

    
    public static float positiveCount_Problem_1_77060446_ce6a_41db_a61c_f2fe6a488445(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6c996a51_dfc0_4347_964f_8fb3dc96c89c(ArrayList<Integer> nums) {
        int numsSum = nums.stream().mapToInteger(x -> x).sum();
        float positiveCount_Problem_0_6c996a51_dfc0_4347_964f_8fb3dc96c89c =  nums.size() / numsSum;
        return positiveCount_Problem_0_6c996a51_dfc0_4347_964f_8fb3dc96c89c;
    }

    
    public static float positiveCount_Problem_0_0b90246f_54c3_4a62_9ccc_a9d271087c89(ArrayList<Integer> nums) {
        int n = 0;
        int p = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                ++n;
            } else {
                p = i;
            }
        }
        float ans = n /  p;
        return ans;
    }

    
    public static float positiveCount_Problem_2_893acd76_8f9c_435d_ab68_a8b6880ca7b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8c87569e_d266_4b1b_b685_f77b023cacae(ArrayList<Integer> nums) {
        int len = nums.size();
        float pos =  0.0;
        for (int i = 0; i < len; i++) {
            pos += nums.get(i);
        }
        return pos / len;
    }

    
    public static float positiveCount_Problem_2_a72e328c_c5cd_4aed_b40a_489f86478b5d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_f97be728_6c9e_4401_8ae1_a760046e411f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_817c9c0e_724a_4e99_8983_c0a063cc5e0a(ArrayList<Integer> nums) {
        float sum=0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_b6023ce0_ef9a_48c1_86b0_e2311323d0ce(ArrayList<Integer> nums) {
        float positive = 0;
        for(Integer num : nums) {
            if(num > 0) {
                positive++;
            }
        }
        return positive;
    }

    
    public static float positiveCount_Problem_1_02115c24_7ec0_44b2_88db_8944c94dcf36(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_477353f7_99c5_4271_8b9a_15f194858e6c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_6f3c39ce_f4a0_45e6_ad4a_70b109e97fb9(ArrayList<Integer> nums) {
        // write your code here
        float sum=0;
        for (Integer i: nums)
        {
            if (i>0)
            {
                sum+=i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_c72e5f43_37db_414d_84ba_6a086315e759(ArrayList<Integer> nums) {
        float count=0;
        for(int i=0;i<nums.size();i++)
            count+=nums.get(i);
        return count;
    }

    
    public static float positiveCount_Problem_1_ab27a797_5002_479a_912b_0f866df4bc3f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_04b7de23_5780_426d_be40_eb6a5ad5cbc9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e8b299fa_8f49_4adf_b4c6_8928305b5ef6(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_fee17d3d_506b_4578_a115_1b0ae4af26b1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_783e0de6_7e16_4ebc_8752_067045552847(ArrayList<Integer> nums) {
        float counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                counter++;
            }
        }
        return counter;
    }

    
    public static float positiveCount_Problem_0_d936d0ef_6c0b_4c58_8382_6e8edda5559e(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer value : nums) {
            sum += value;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_35891581_aeb1_4d13_9be4_666f281bf760(ArrayList<Integer> nums) {
        int positiveNums = 0;
        int total = 0;
        int negativeNums = 0;
        for(Integer i : nums) {
            if(i < 0) {
                negativeNums++;
            }
            else {
                positiveNums++;
            }
            total++;
        }
        return  positiveNums / total;
    }

    
    public static float positiveCount_Problem_2_6472a29e_9ccf_4657_b523_ca4b05b62696(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_19d7a008_c45e_495c_ade7_b83143e32197(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a3a172ab_4521_465b_9a10_500a318b7291(ArrayList<Integer> nums) {
        int positiveCount_Problem_0_a3a172ab_4521_465b_9a10_500a318b7291 = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_0_a3a172ab_4521_465b_9a10_500a318b7291 += 1;
            }
        }
        return positiveCount_Problem_0_a3a172ab_4521_465b_9a10_500a318b7291;
    }

    
    public static float positiveCount_Problem_2_8abad1cd_03a0_4c1a_82ab_ee8efcb53283(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3d71bb98_385d_4de6_ac0a_c1ae1aa745ed(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_7bd8d61d_a249_470e_a4e8_dc1d83cfd7cb(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_65116566_4684_41d8_8e50_eff46179f864(ArrayList<Integer> nums) {
        float numPositives = 0f;
        for (Integer i : nums) {
            if (i >= 0f) {
                numPositives += 1;
            }
        }
        return numPositives / nums.size();
    }

    
    public static float positiveCount_Problem_1_eec63949_bd27_4318_adfc_31180d17fd7d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4d266f8a_f022_42c7_aa9b_28f05c5909d1(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_22c282ba_98e9_4cdc_881f_53346c52dfe9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ed6584f7_bbc7_4c7a_82ea_9d20b89034b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_1b0b5eb4_c063_48b5_9b16_0249bcafe839(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d9cea3ce_640e_4afa_b4cd_dc1fe15bd611(ArrayList<Integer> nums) {
        int a = 0;
        float numCount = 0;
        int n = 0;
        for (Integer i : nums) {
            if (i == n) {
                a++;
                numCount++;
            }
            n = i;
        }
        if (numCount == 0) {
            return 0;
        } else {
            float result = 0;
            float p = 1;
            while (a > 0) {
                result += p;
                p *= 10;
                a--;
            }
            return result;
        }
    }

    
    public static float positiveCount_Problem_2_89d0ba5b_a3dc_4a34_a9d3_d785bca6b01c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_77060446_ce6a_41db_a61c_f2fe6a488445(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_12a1ae80_6bc3_4ce9_a406_b8e2904945c0(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b86afbad_00bb_452f_8ec3_dea79f0bd0e8(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d650adcc_28bb_43dd_971d_ae38eb5a2d26(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_68af171e_947f_4b71_8ce6_6e8261519751(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_68a9a7be_d6b0_4faa_89cd_60f37bdf315f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_ce56841c_78c0_4f52_a168_0fa577e179bb(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ed6584f7_bbc7_4c7a_82ea_9d20b89034b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_bc336cf2_7c09_4bbd_bfca_2e64972669cd(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_e2cb4057_43d3_4a06_86d9_241c05354717(ArrayList<Integer> nums) {
        // Declare and initialize variables
        int n = nums.size();
        float counter = -1;
        for(int i = 0; i < n; i++){
            if(nums.get(i) > 0){
                counter +=  nums.get(i);
            }
        }
        return counter;
    }

    
    public static float positiveCount_Problem_2_defd5c83_bb52_4220_9aca_4f7d890d1a58(ArrayList<Integer> nums) {
        // Write code here
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_1_5e1c8b5a_ac4a_45a1_8c6e_2a4fe8cb2a6a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_fc622c54_c54e_4067_bc71_f557ae41b176(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_963a107b_2e80_4807_bed4_21ff520ce1b4(ArrayList<Integer> nums) {
        float sum = 0f;
        for(Integer i : nums) {
            if(i != 0) sum += i;
        }
        return sum /  nums.size();
    }

    
    public static float positiveCount_Problem_1_b2956a90_310d_48d6_b805_0d693c39392f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_d1ae0399_9397_4074_96f9_91f2d6d77d5f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4c569a65_10fb_4910_b4ac_cbe0d50e681c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_c1087e9b_3542_4f02_8ad1_6c6ecc987528(ArrayList<Integer> nums) {
        int total = 0;
        for(int i : nums) {
            if (i > 0) total++;
        }
        return (total)/nums.size();
    }

    
    public static float positiveCount_Problem_2_9bb78580_8ffb_4354_b474_fe30195987b3(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_dc655887_2241_4dd4_99ff_350ed426ebb2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_4cfdf990_585c_461f_9b09_1ca16541fb2a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_f278c507_4913_4eea_aad7_6806ea29786c(ArrayList<Integer> nums) {
        int sum = 0, temp = 0;
        float result = 0;
        for(int n : nums) {
            if(n > 0) {
                sum += n;
            }
        }
        temp = sum;
        for(int n : nums) {
            temp = temp - n;
        }
        for(int n : nums) {
            result += n / temp;
        }
        return result;
    }

    
    public static float positiveCount_Problem_2_0827d553_7b38_432d_9993_0e1faca03cc3(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3d71bb98_385d_4de6_ac0a_c1ae1aa745ed(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_264785d7_8b79_4ea9_9bee_224ebed684be(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_9fa8745c_4f59_4378_a344_79338d75258d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_902006bb_ee7d_40a1_96b0_23ce453f743a(ArrayList<Integer> nums) {
        // Write your code here
        int positiveCount_Problem_1_902006bb_ee7d_40a1_96b0_23ce453f743a = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_1_902006bb_ee7d_40a1_96b0_23ce453f743a++;
            }
        }
        return positiveCount_Problem_1_902006bb_ee7d_40a1_96b0_23ce453f743a / nums.size();
    }

    
    public static float positiveCount_Problem_1_bf514f99_62c4_414d_9b54_f3e061338254(ArrayList<Integer> nums) {
        // Write your code here
        
        float sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        float sum1=sum/nums.size();
        
        
        
        return sum1;
    }

    
    public static float positiveCount_Problem_2_2dd1293f_818d_4b3d_8925_133fa0a82983(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3d418584_d242_4658_a030_91d769d49d73(ArrayList<Integer> nums) {
        float result = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                result +=  nums.get(i)/i;
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_1_81156ac8_7c6e_4edf_a20b_46b12c33b2c5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_1949b15b_b203_499c_87aa_f5793ef84701(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a7559f95_0955_46b6_860d_836fd3b69471(ArrayList<Integer> nums) {
        int positiveCount_Problem_0_a7559f95_0955_46b6_860d_836fd3b69471 = 0;
        // Your code goes here
        if (nums.isEmpty()) {
            return 0;
        }
        else {
            for (Integer num : nums) {
                if (num > 0) {
                    positiveCount_Problem_0_a7559f95_0955_46b6_860d_836fd3b69471 = positiveCount_Problem_0_a7559f95_0955_46b6_860d_836fd3b69471 + 1;
                }
            }
        }
        return positiveCount_Problem_0_a7559f95_0955_46b6_860d_836fd3b69471;
    }

    
    public static float positiveCount_Problem_1_bffe95c3_e8d8_4cf0_a35c_ee9a64c74dc6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_054ca6c2_338b_4a29_9d7f_9e2af1c9f7e9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ece63057_b8d8_4527_a5c3_8352c29fce1a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_5a32d68c_e7d5_4b44_804d_8ea892a6cd8d(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_58324bf6_91b2_4cc9_88dc_d6d08caf1bef(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d7fa467f_9189_46f3_8023_a1631fd7e0bb(ArrayList<Integer> nums) {
        int positive=0;
        for (Integer num: nums) {
            if (num>0) {
                positive+=1;
            }
        }
        return positive/nums.size();
    }

    
    public static float positiveCount_Problem_1_a6d77900_6123_4e75_b4b9_dee2900bdc3f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_4359c133_a876_4a4e_ab69_f4bb2e1b0108(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_f3cc2682_95b1_4dec_941b_d188a1f216c7(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_710f8f6b_f425_45d0_88ee_4d80b05afcdd(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0) {
                count++;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_0_f65be203_7da3_49f9_9f2d_414808f84638(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_a553e412_83a7_4641_a559_8af3e510bcea(ArrayList<Integer> nums) {
        // TODO: Write your code here
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int[] positive = new int[nums.size()];
        int i = 0;
        for (Integer num : nums) {
            if (num >= 0) {
                positive[i] = num;
            }
            sum += positive[i];
            i++;
        }
        float result = sum / positive.length;
        return result;
    }

    
    public static float positiveCount_Problem_1_ce8de3c9_c52e_43b1_b9b9_bdb1416b7dc4(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e5ed8ab2_2f25_483a_9aed_58e5beaf359c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_01a5591e_b09f_484b_8b7d_fe296cf15d49(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_157dd1ab_cfd2_4e83_886e_4f6a3639d698(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0){
                count++;
            }
        }
        return (count)/nums.size();
    }

    
    public static float positiveCount_Problem_0_19eebb49_1942_4780_9398_b0c6e5354a57(ArrayList<Integer> nums) {
        float f = 0;
        for (int n : nums) {
            if (n > 0) {
                f += 1.0; // +1 to convert float to int
            }
        }
        return f;
    }

    
    public static float positiveCount_Problem_0_e8b1b6bb_469d_4c53_8bf9_3f7c94a92963(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_47037104_5b96_49bf_8466_9c2be7966f5d(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_a603baeb_aa01_4b9e_8132_a9dfd5fd870e(ArrayList<Integer> nums) {
        float positive = 0.0;
        for (Integer i : nums) {
            if (i > 0) positive = positive + i;
        }
        return positive;
    }

    
    public static float positiveCount_Problem_2_bf514f99_62c4_414d_9b54_f3e061338254(ArrayList<Integer> nums) {
        // Write your code here
        
        float sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        float sum1=sum/nums.size();
        
        
        
        return sum1;
    }

    
    public static float positiveCount_Problem_0_282b3ebf_3dd5_4db0_b0ae_6861a6aef442(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_5ab08fdd_b131_44ea_8818_3563d36bb16e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_7bd8d61d_a249_470e_a4e8_dc1d83cfd7cb(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_5880eb83_54a0_4917_8201_c13682f95a2a(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_2985ddf7_f7c0_43db_906a_8909672d1101(ArrayList<Integer> nums) {
        int total = 0;
        for (int val : nums) {
            if (val >= 0)
                total += val;
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_2_07ab4e61_0cc4_4bb8_8213_29827f9212dd(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float positiveCount_Problem_1_ca969cc9_12e0_4b6f_bbba_f645420de731(ArrayList<Integer> nums) {
        float total = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0)
                total += nums.get(i);
        }
        return total;
    }

    
    public static float positiveCount_Problem_1_fea3df22_7dcc_4a71_ac17_ab62060f6def(ArrayList<Integer> nums) {
        return nums.stream().filter(l -> l > 0).mapToInteger(Integer::intValue).sum() / nums.size();
    }

    
    public static float positiveCount_Problem_2_b86afbad_00bb_452f_8ec3_dea79f0bd0e8(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_defd5c83_bb52_4220_9aca_4f7d890d1a58(ArrayList<Integer> nums) {
        // Write code here
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_0_e5ed8ab2_2f25_483a_9aed_58e5beaf359c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_6ed954ba_9126_4df8_a9f1_60b49e980cc2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_41eb5f57_363e_48af_b63a_b2de768fe591(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count /  nums.size();
    }

    
    public static float positiveCount_Problem_2_a603baeb_aa01_4b9e_8132_a9dfd5fd870e(ArrayList<Integer> nums) {
        float positive = 0.0;
        for (Integer i : nums) {
            if (i > 0) positive = positive + i;
        }
        return positive;
    }

    
    public static float positiveCount_Problem_0_9fa8745c_4f59_4378_a344_79338d75258d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_3b718b97_6cf2_41c7_9463_aeffd9e5393f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int a : nums) {
            if(a>0)
                sum+=a;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_2_282b3ebf_3dd5_4db0_b0ae_6861a6aef442(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_3a6ac929_4747_4471_baa0_05b46839a370(ArrayList<Integer> nums) {
        float positiveCount_Problem_1_3a6ac929_4747_4471_baa0_05b46839a370 = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                positiveCount_Problem_1_3a6ac929_4747_4471_baa0_05b46839a370 += nums.get(i);
            }
        }
        return positiveCount_Problem_1_3a6ac929_4747_4471_baa0_05b46839a370;
    }

    
    public static float positiveCount_Problem_1_60c1d308_abcd_4a3d_8921_0d9b74da12e7(ArrayList<Integer> nums) {
        int positives = 0;
        for (Integer n : nums)
            if (n > 0) positives++;
        return positives/nums.size();
    }

    
    public static float positiveCount_Problem_2_fe955d16_75a1_47e4_b087_fd1ee3e42a9d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_e47b4b47_88a9_44b5_a7ea_a84d879fdf70(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_b0c2e53d_8cd6_418e_8044_1430eee73361(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_9db7f816_8057_414d_8009_b2ec6eec4fc2(ArrayList<Integer> nums) {
        float npos = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                npos +=  nums.get(i) / nums.size();
            }
        }
        return npos;
    }

    
    public static float positiveCount_Problem_0_2c46bb73_fd40_4b21_8081_768d716c16b9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums)
            if (n >= 0)
                sum += n;
        return sum;
    }

    
    public static float positiveCount_Problem_0_98db39e1_7047_4586_989f_409901a3dcf0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_7bba52ae_b41f_41be_9eeb_0663a1c5726e(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_2985ddf7_f7c0_43db_906a_8909672d1101(ArrayList<Integer> nums) {
        int total = 0;
        for (int val : nums) {
            if (val >= 0)
                total += val;
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_1_01d68ac6_8e9e_415a_868b_c7fadc9cc99c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b03bf1de_a3d9_422e_82d6_d702cfb00c80(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_31e5d394_1c5c_43fe_a6b9_c7bb4ebb1343(ArrayList<Integer> nums) {
        return nums.stream().filter(x -> x > 0).count() / nums.size();
    }

    
    public static float positiveCount_Problem_1_607a0709_6a57_467a_b3a5_f52f784cbe43(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num : nums){
            sum += num;
        }
        float result = sum / nums.size();
        return result;
    }

    
    public static float positiveCount_Problem_2_5ba6669f_754d_4c4a_ae6f_f809c53ce7ca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_054ca6c2_338b_4a29_9d7f_9e2af1c9f7e9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4b92e137_2a90_4caf_9a55_183cdbfaefe0(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            if (i == null || i < 0) continue;
            sum += i;
        }
        if (sum > 0) {
            for (Integer i : nums) {
                if (i == null || i < 0) continue;
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_8ee00411_b7fe_4392_9c26_578d73406139(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_f97be728_6c9e_4401_8ae1_a760046e411f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_defd5c83_bb52_4220_9aca_4f7d890d1a58(ArrayList<Integer> nums) {
        // Write code here
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_1_710f8f6b_f425_45d0_88ee_4d80b05afcdd(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums) {
            if(num > 0) {
                count++;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_2_b10fea9a_aff7_47d7_8ec7_6d2c8a0e1f64(ArrayList<Integer> nums) {
        int positive = 0;
        for (int num : nums) {
            if (num > 0) {
                positive++;
            }
        }
        return positive /  nums.size();
    }

    
    public static float positiveCount_Problem_1_35891581_aeb1_4d13_9be4_666f281bf760(ArrayList<Integer> nums) {
        int positiveNums = 0;
        int total = 0;
        int negativeNums = 0;
        for(Integer i : nums) {
            if(i < 0) {
                negativeNums++;
            }
            else {
                positiveNums++;
            }
            total++;
        }
        return  positiveNums / total;
    }

    
    public static float positiveCount_Problem_0_3f24a673_ebec_4ae2_b1ed_0a3e4b083713(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_3b718b97_6cf2_41c7_9463_aeffd9e5393f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int a : nums) {
            if(a>0)
                sum+=a;
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_2_a512d8f2_6fd8_41eb_836c_86f6906f38e3(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer x: nums) {
            if(x.intValue()>0) {
                sum+=x.intValue();
            }
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_0_e2fdc737_fdc5_47f3_a5c7_bd1d6bafce42(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ce8beefa_a3c0_4e6c_a383_158867225c58(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer n: nums) {
            if (n > 0) {
                count += 1;
            }
        }
        return (count) / nums.size();
    }

    
    public static float positiveCount_Problem_0_97a62f9b_e11d_4810_a974_7bb8630bed18(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_bff41036_9c2d_41c8_b102_4dcf8d2be42c(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f97be728_6c9e_4401_8ae1_a760046e411f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_aadee095_43a6_4c3f_bc84_d8403b3514e2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_bc336cf2_7c09_4bbd_bfca_2e64972669cd(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8ee00411_b7fe_4392_9c26_578d73406139(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_12a1ae80_6bc3_4ce9_a406_b8e2904945c0(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_39ef7acf_3297_45b9_a16b_d13887581f07(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8efa74f2_e897_4570_885e_cdd384b9c2c4(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f1380744_277b_4e1e_b387_faf1300dde5c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_9fa8745c_4f59_4378_a344_79338d75258d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_8b4f6378_ba2a_4e12_bb1c_32fb51b75981(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_9ebaf44e_7261_4ab4_aac5_cf07245ad110(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_477353f7_99c5_4271_8b9a_15f194858e6c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_dea9949c_b59d_446e_9ae3_74f4ddb8d591(ArrayList<Integer> nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        return  count / nums.size();
    }

    
    public static float positiveCount_Problem_0_dbd7b724_45c2_43d0_ab67_594e93843a3a(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3d418584_d242_4658_a030_91d769d49d73(ArrayList<Integer> nums) {
        float result = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                result +=  nums.get(i)/i;
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_1_3523ed8e_c982_4e5e_a769_56745b21c27c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_8b7a11a9_9e39_4565_b8bc_e55d54f66da8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_19d7a008_c45e_495c_ade7_b83143e32197(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_2dcced7e_cf18_44ac_8724_8e48290bbe4c(ArrayList<Integer> nums) {
        float count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_0_d93e972c_558a_481c_9c47_aab33c6a7a69(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_0a762068_0f69_4d38_a0c6_c6678cd33de1(ArrayList<Integer> nums) {
        int sum=0;
        int num=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums.get(i);
        }
        for(int i=0;i<nums.size();i++)
        {
            num=sum;
            sum-=nums.get(i);
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_b6023ce0_ef9a_48c1_86b0_e2311323d0ce(ArrayList<Integer> nums) {
        float positive = 0;
        for(Integer num : nums) {
            if(num > 0) {
                positive++;
            }
        }
        return positive;
    }

    
    public static float positiveCount_Problem_1_0294eb0d_7794_4bac_9959_92067020508d(ArrayList<Integer> nums) {
        float positiveNums = 0, nonPositiveNums = 0;
        // TODO: Complete this function
        
        return 0;
    }

    
    public static float positiveCount_Problem_0_d6cee7c3_5e3a_40c1_9222_7f8faa9605a9(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_992b4c40_88a6_441d_a985_455d7a82de8e(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_e2fdc737_fdc5_47f3_a5c7_bd1d6bafce42(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_9f7a028a_4986_4405_bc3f_8821b5974f3a(ArrayList<Integer> nums) {
        // TODO: Write your code
        // This variable will hold the count of positive integers in the array
        int count = 0;
        // This variable will hold an array containing the list of positive integers in the array
        int[] arr = new int[nums.size()];
        // This variable will hold the current number of positive integers in the array
        int i = 0;
        for (Integer val : nums)
        {
            arr[i] = val;
            i++;
        }
        for (int num : arr) {
            // If number is positive, increase the count by 1
            if(num > 0) {
                count++;
            }
        }
        float floatCount = count /  nums.size();
        return floatCount;
    }

    
    public static float positiveCount_Problem_2_f5c7d190_629c_4d3f_95fc_1919d1e74a37(ArrayList<Integer> nums) {
        float total = 0;
        for (Integer num : nums)
            if (num > 0) total++;
        return total;
    }

    
    public static float positiveCount_Problem_1_3de9f185_b489_45dd_a937_46d60321312e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_d56d7793_14ca_484f_8857_77b7634d61f9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_694405b0_b600_45e4_a3cd_207ba90cc8d0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ce8de3c9_c52e_43b1_b9b9_bdb1416b7dc4(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_81156ac8_7c6e_4edf_a20b_46b12c33b2c5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3523ed8e_c982_4e5e_a769_56745b21c27c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_07eaa59f_48e0_4508_9cba_baf6085dca08(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_9f73602a_49c7_4035_8909_ea6df1daafcd(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_a0716193_33f3_4718_bbd3_b83900634fe5(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d59c27fe_13bc_4735_be3f_e895e5ff6bc8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_437b1ee3_65f5_4951_87f9_0fcf76babc36(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_817c9c0e_724a_4e99_8983_c0a063cc5e0a(ArrayList<Integer> nums) {
        float sum=0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_c4594537_afe4_403d_9a87_feae24f1dc9e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_f27633dc_b69e_42c6_a717_338553f5f2ab(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_949915bd_941b_4f5a_8e93_c3453dfd91b9(ArrayList<Integer> nums) {
        float numsSum = 0;
        int count = 0;
        int sum = 0;
        for(int num : nums) {
            numsSum += num;
            count += 1;
            sum += num;
        }
        return (numsSum / sum);
    }

    
    public static float positiveCount_Problem_2_f8dceb70_35c8_46d7_8a66_f05f4f89566f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_4359c133_a876_4a4e_ab69_f4bb2e1b0108(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_2152d958_9c5e_485d_87b0_f77fabc31e10(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        float x = sum / nums.size();
        return Math.round(x * 100) / 100.0;
    }

    
    public static float positiveCount_Problem_1_e9fe96dc_4f64_4a13_896c_d3446822a53a(ArrayList<Integer> nums) {
        float count = 0;
        for (int i=0; i<nums.size(); i++) {
            if(nums.get(i) >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_e9fe96dc_4f64_4a13_896c_d3446822a53a(ArrayList<Integer> nums) {
        float count = 0;
        for (int i=0; i<nums.size(); i++) {
            if(nums.get(i) >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_2_b2f7e401_5dc6_4ae8_aa02_ddae4caad93f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_b10fea9a_aff7_47d7_8ec7_6d2c8a0e1f64(ArrayList<Integer> nums) {
        int positive = 0;
        for (int num : nums) {
            if (num > 0) {
                positive++;
            }
        }
        return positive /  nums.size();
    }

    
    public static float positiveCount_Problem_0_07eaa59f_48e0_4508_9cba_baf6085dca08(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer i : nums) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_b2f54f87_6121_4b4e_a2e0_7e616afd4342(ArrayList<Integer> nums) {
        float sum=0;
        for(Integer i : nums)
        {
            if(i>0)
            {
                sum++;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_8b8b938e_beef_4313_9515_ccc9fa32cf3d(ArrayList<Integer> nums) {
        float count = 0;
        for (Integer i : nums) {
            count += i;
        }
        return count;
    }

    
    public static float positiveCount_Problem_0_357e314a_4333_47fc_802e_3a47da9f9d07(ArrayList<Integer> nums) {
        int count = 0;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>0)
            {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_2_3b534b87_64b1_43df_9e7e_0388ae27b80c(ArrayList<Integer> nums) {
        float pCount = 0; 
        for(int i= 0; i < nums.size(); i++){
            if(nums.get(i)>0){
                pCount++;
            }
        }
        return pCount;
    }

    
    public static float positiveCount_Problem_2_296dd56d_185a_4c21_9759_092e9c1b3fca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_26b8a3f3_286a_4669_bddd_781acc37a92e(ArrayList<Integer> nums) {
        int positive = 0;
        for (Integer i : nums)
            if (i.intValue() > 0)
                positive++;
        return  positive /  nums.size();
    }

    
    public static float positiveCount_Problem_2_e7d1d20c_7c48_4d9d_9321_aca8c91d205d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_e5ed8ab2_2f25_483a_9aed_58e5beaf359c(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_41cd8c80_40e6_4c98_bc6c_b9a2fc8df6f7(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_e30aec64_56a0_4dfa_9246_514b111e13f7(ArrayList<Integer> nums) {
        // TODO implement your logic
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            count += nums.get(i);
        }
        return (count / nums.size()) * 100;
    }

    
    public static float positiveCount_Problem_2_90797491_841e_4e8d_b252_d85cc64a7966(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_93782f89_b48f_4900_aeb3_6724e0dcb930(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_fbec8f44_20c6_4d29_b428_4eb7bfdb5718(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_c4594537_afe4_403d_9a87_feae24f1dc9e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_5b7f8207_6c16_421a_8af2_c10c1aaeb954(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_b568f06f_563c_476b_99cb_bf91255ae9e0(ArrayList<Integer> nums) {
        int size = nums.size();
        float ans = 0f;
        if (size == 0) return 0;
        if (size == 1) return nums.get(0);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        int prod = sum * nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i) - prod;
            ans += nums.get(i) - sum;
            prod = sum * nums.get(i);
        }
        return ans /  size;
    }

    
    public static float positiveCount_Problem_1_251bcaf0_8efc_4e1f_a133_69351aad6625(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_26b8a3f3_286a_4669_bddd_781acc37a92e(ArrayList<Integer> nums) {
        int positive = 0;
        for (Integer i : nums)
            if (i.intValue() > 0)
                positive++;
        return  positive /  nums.size();
    }

    
    public static float positiveCount_Problem_2_7bb475f3_4c89_4f6b_9c5e_63d61016ac7e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_517cbbf8_c9d8_42c3_805f_36594cadf501(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3c6c96d5_b60d_44fb_8262_53b9d5a6d7a0(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_df7453ef_4111_4aaf_984f_747f3f22c733(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_714cfd6e_7acd_4692_8bbf_d8d6214b1714(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4c569a65_10fb_4910_b4ac_cbe0d50e681c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_e2fdc737_fdc5_47f3_a5c7_bd1d6bafce42(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_6b779eb3_2069_4d26_92ec_2472e5ae642d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_ab7404de_555c_4a57_ae20_f67284f22726(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_9dfc3ebb_7fe9_4ebe_b549_d6431c4ef905(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_6b779eb3_2069_4d26_92ec_2472e5ae642d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_ed4d96d8_aad0_4991_9055_04372ac0e506(ArrayList<Integer> nums) {
        int n = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                n++;
            }
        }
        float pos =  n / nums.size();
        return pos;
    }

    
    public static float positiveCount_Problem_2_aee3a3f5_30fc_4af1_97fc_7b78b78b3a3c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_0b90246f_54c3_4a62_9ccc_a9d271087c89(ArrayList<Integer> nums) {
        int n = 0;
        int p = 0;
        for (Integer i : nums) {
            if (i >= 0) {
                ++n;
            } else {
                p = i;
            }
        }
        float ans = n /  p;
        return ans;
    }

    
    public static float positiveCount_Problem_2_cfdbf9bb_2ebe_4289_895c_9af855e07538(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_8ee00411_b7fe_4392_9c26_578d73406139(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_f278c507_4913_4eea_aad7_6806ea29786c(ArrayList<Integer> nums) {
        int sum = 0, temp = 0;
        float result = 0;
        for(int n : nums) {
            if(n > 0) {
                sum += n;
            }
        }
        temp = sum;
        for(int n : nums) {
            temp = temp - n;
        }
        for(int n : nums) {
            result += n / temp;
        }
        return result;
    }

}
