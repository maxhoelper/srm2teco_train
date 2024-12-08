package mbpp_99_decimal_to_binary;

public class mbpp_99_decimal_to_binary {

    
    public static String decimalToBinary_Problem_1_7b4d2e8c_bb4d_4dd9_b4cc_4b4282aa07e2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_dc1f5871_10b4_4b7a_91f8_3e48e73805f2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_c8f5f51d_833d_4730_9244_41f62ba0e312(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int remainder = n % 2;
            result.append(remainder);
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_0_3d3cc978_02bb_46b5_8612_dcc9284ebc8d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_cb65be60_f985_43f6_a885_8ae6d1834448(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3347c1ff_f053_4207_92a1_13eaba7a2880(int n) {
        String binary = Integer.toBinaryString(n);
        int remainder = binary.length() % 8;
        if (remainder == 0) {
            int pos = binary.length() - remainder;
            String zeros = "0000000000000000000000000000000000000000";
            binary = zeros.substring(pos, pos + 8);
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_f47e30b6_17f6_4c40_bd07_322726a55744(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_434626e1_2cd3_4b23_a06c_1a86ee486fe6(int n) {
        if (n == 0) {
            return "0";
        }
        if (n % 2 == 0) {
            return decimalToBinary_Problem_1_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + "" + 1;
        } else {
            return decimalToBinary_Problem_1_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + 1;
        }
    }

    
    public static String decimalToBinary_Problem_2_eb35ace5_13e7_4a87_8b7d_1619c20686cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_0c6d7d47_111f_43b7_9374_64e439e24c0c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_7460572e_9e90_4124_aecd_4edc4a096319(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_2874eb5f_9fa9_4fc6_ab5e_f7bc25542993(int n) {
        String str = Integer.toString(n);
        if(str.charAt(0) == '0')
            str = str.substring(1);
        return str;
    }

    
    public static String decimalToBinary_Problem_2_092f1aa5_f1e3_4351_ac60_c7dad0ea3711(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f0ebb76a_14fd_4924_98d1_b0d9ed6f49e9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_6670e5ab_4d43_4127_b408_f9be95a0ff7e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f1345cc0_72e1_4c22_adc4_f9787e4d01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f02a1f12_ad44_4754_aa49_bb8686da2ba3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1df23e50_9941_417a_b7ca_7157d258a6a5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_035d8529_0387_44a7_b483_660c8c349f5e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e6c29f4b_0c53_4799_8a51_c00330f2d66a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_51d17aaa_28db_4ce3_b814_996389ed26e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_049f9e4a_ec08_4efb_86da_ce75244633ac(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f1345cc0_72e1_4c22_adc4_f9787e4d01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_078e730d_7035_4129_8a06_461d4e99ed98(int n) {
        String res = "";
        while (n != 0) {
            res = Integer.toBinaryString(n) + res;
            n = n / 2;
        }
        return res;
    }

    
    public static String decimalToBinary_Problem_0_6ab07778_3deb_40a7_8ee7_b01fd209a464(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_32ab712e_a533_4174_9f6e_776633d32394(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_6ab07778_3deb_40a7_8ee7_b01fd209a464(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_18f4ad72_37d2_4b0d_b857_f11ffe91a914(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_799df440_f7d3_4da1_9872_371bde17b107(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_fc2b257e_8552_472b_94ae_b74808a5bcf8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_de44d344_0a61_448d_b5c5_2e83c7127d68(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_58359603_c194_4bd5_973e_6087b199383a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3a3298bb_9f01_4fea_ba7f_7e12a887e679(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9af97910_f469_43e8_b697_3e7d10ff4c34(int n) {
        // Write your code here
        int bit = 1;
        String binary = "";
        while (n != 0) {
            int rem =  (n % 2);
            n /= 2;
            binary = String.valueOf(1) + rem + binary;
            n =  n;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_5d55a8ad_f4c1_4061_8b20_a349b1009f85(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_18ac6874_a4e7_470e_9197_fb02d18a9da4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_4f123fd6_8252_4150_a3c4_da3e954fa4cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_470ea73e_5e57_43be_af73_e1db4d3f4d55(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_e8a68b3d_f087_4bd5_b1b6_7d623e18d099(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_72d3fac1_7b31_49c8_8bd8_d507b0311fdf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f47e30b6_17f6_4c40_bd07_322726a55744(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ec13dc84_3c47_42d0_a084_6eb3bd80134e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f8055afe_3cbf_4c54_aeec_3158c36d9d50(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_18ac6874_a4e7_470e_9197_fb02d18a9da4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_edcf8536_eeb8_445c_b935_e2b3f8d6a45f(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int temp = n % 2;
            sb.append(temp);
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_fba97e87_7c24_45e8_be8b_3b57aaa0d7f8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_df77942f_ded7_427b_b8b6_6f1c9810aed9(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_53bc2b85_e5ea_4826_aa64_171fe10cd37c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2959933e_c0ad_4fba_9c69_c208cdc3ec81(int n) {
        return Integer.toString(n).split("\\.")[1];
    }

    
    public static String decimalToBinary_Problem_2_598c4ca4_75cb_4bcc_bfe5_d0a1c265861b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_edcf8536_eeb8_445c_b935_e2b3f8d6a45f(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int temp = n % 2;
            sb.append(temp);
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_30fc2a5e_7c83_4472_9c2a_250854403cf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7258cc15_a8c3_4fba_ac51_2437bab354d5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_eef8ba07_fe4f_424d_8e3b_7cd7b6cb257d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f8055afe_3cbf_4c54_aeec_3158c36d9d50(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e1a8c8e8_d345_47ce_a417_b93a600b75ca(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b17c34d3_3ded_4a14_ad5e_1afc2bc3f32f(int n) {
        String binary = Integer.toString(n);
        int decimal = Integer.parseInt(binary);
        int remainder = decimal % 2;
        while (decimal >= 2) {
            decimal = decimal / 2;
            binary += Integer.toString(decimal).substring(1);
            decimal %= 2;
        }
        binary = binary + Integer.toString(remainder);
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_e66b588f_a758_4c55_967b_fcdde4352e39(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_39ab5ef3_3830_47a5_a0ac_c2ec607c0e58(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f75a368f_b7af_4e78_b828_25f6705afc0d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3254c41c_9763_45e7_bf2a_e346a6c4036f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_a52ae820_b5cd_4162_a8d0_b3f1e6c5414c(int n) {
        BigInteger bi = new BigInteger(Integer.toString(n), 2);
        return bi.toString(2);
    }

    
    public static String decimalToBinary_Problem_0_c1d67aae_5aff_411a_bccc_a363196966b7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ab4acb4a_0280_4ead_8cc8_6c855ec3ca12(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_1_37e2f8ef_f0e9_4851_a03e_2ed6250faca2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b8168033_f126_4366_a528_fb4f2dfeaa92(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b90d4d5b_7ce8_4903_a1cb_224c47db6023(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_8ae768f1_5f7c_4755_b819_153bea3a3a6e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_69e52326_a019_48a2_957b_bf2ae227d74b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_1154bd39_a521_4d7a_b6da_d0036b747325(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b5f6cf8c_8863_4aac_9c8c_1e9bdd85154a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_da853ef1_0864_43cc_b4d9_0d6abda5484b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_799df440_f7d3_4da1_9872_371bde17b107(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_06f27199_5463_4b00_92f7_9a95332d579f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_feeb00e0_6736_4f06_8b2b_7671af121259(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n /= 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_535a6df9_543c_4649_b037_f8975aaedce6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_12e5e179_938c_4710_a646_267e3ee65c81(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_de2b0c32_c83f_4edf_ada3_9f4491174a73(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1154bd39_a521_4d7a_b6da_d0036b747325(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_756dd34e_48c8_4358_bb78_04221be46d34(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_06ba7271_8c4b_44f1_ad85_42d5629f01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b3022976_877d_40c5_91e9_602afec89f6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_05a36734_761e_4ada_aa8b_9952ed157bbf(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1 - binary.length() % 8);
    }

    
    public static String decimalToBinary_Problem_0_ff9d61c8_5251_4f35_bf9b_cb6caa9d2d4d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_1bae5212_41e3_4aab_8a73_26e17676f5c4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_5b49471e_e983_4e6e_9514_8e88509237a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_27bd9f6a_9d51_42e4_80e2_e2b05930c83f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_e3621ff5_5485_48c2_ab6e_1e4a58b7b63c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_0d2379cd_7788_409c_ac75_54031ab68d01(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_00f16771_ab70_4c80_b670_80d8ee84f08a(int n) {
        String binary = "";
        int bitCount = 1;
        while ((n != 0) && (bitCount < 64)) {
            binary += (n & 1) + "";
            n = n >>> 1;
            bitCount++;
        }
        return binary.substring(0, bitCount - 1);
    }

    
    public static String decimalToBinary_Problem_1_eb336975_ce28_4ccf_beea_2fec72fbabab(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_434626e1_2cd3_4b23_a06c_1a86ee486fe6(int n) {
        if (n == 0) {
            return "0";
        }
        if (n % 2 == 0) {
            return decimalToBinary_Problem_0_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + "" + 1;
        } else {
            return decimalToBinary_Problem_0_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + 1;
        }
    }

    
    public static String decimalToBinary_Problem_2_4f123fd6_8252_4150_a3c4_da3e954fa4cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_09df0a27_8ce3_42c0_b7a1_c6d4adec2a7b(int n) {
        String binary = Integer.toBinaryString(n);
        int zeroCount = binary.length() - 1;
        return binary.substring(zeroCount);
    }

    
    public static String decimalToBinary_Problem_2_c1d67aae_5aff_411a_bccc_a363196966b7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_fba97e87_7c24_45e8_be8b_3b57aaa0d7f8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_d516c308_4798_4a52_a29a_7607dee5ea30(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_99baed7d_21d9_4499_aa4c_61798a0fd9d4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3d3cc978_02bb_46b5_8612_dcc9284ebc8d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1c4f310e_ae6e_434a_b6bf_ad0dee7178e6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_fc2b257e_8552_472b_94ae_b74808a5bcf8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9ab9bca6_b868_4760_aebd_d706dc24018d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3f056fdb_551c_4e23_80fd_dc9a06b4d8b5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b3022976_877d_40c5_91e9_602afec89f6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f7b7ad92_03fd_4040_919e_78efbd7375d7(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder result = new StringBuilder();
        for(int i = binary.length()-1; i>=0; i--) {
            result.append(binary.charAt(i));
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_2_3aae34ca_d21d_436d_912c_0521b6c12037(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_535a6df9_543c_4649_b037_f8975aaedce6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_23de8786_eebb_4318_afb9_9d7ed358eb4b(int n) {
        String binary = "";
        while (n > 0) {
            if (n % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_15fbf38d_ac8c_4c82_83ae_cfa71edb37b6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_abeff323_f9fc_45c7_bc5f_584fddab182e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_c4eb9380_8a40_4bb0_8021_8d166f1b7c3e(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_9c75cebe_975b_4b5b_af50_98f560540d5c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_80f200ac_072e_4df5_a44e_081b9387569c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_59e5b42b_1a44_4234_8e59_52f667c01831(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_6531a3af_d16b_490c_98f8_a4a162705dda(int n) {
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(binary.length() - binary.length() % 8); // if length is not a multiple of 8, remove last character
        StringBuilder sb = new StringBuilder(binary);
        while (sb.length() < 32) // pad if int is less than 32 characters int
            sb.insert(0, 0);
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_53ef3491_ab97_4cf3_a618_2efc13853832(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_d8c8c516_b001_45a2_b4bf_25f73dd0ae76(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e3621ff5_5485_48c2_ab6e_1e4a58b7b63c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_05a36734_761e_4ada_aa8b_9952ed157bbf(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1 - binary.length() % 8);
    }

    
    public static String decimalToBinary_Problem_1_d9fb9001_cd89_44fa_90dc_de1747361529(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_756dd34e_48c8_4358_bb78_04221be46d34(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c200c7a7_c58f_41d1_92b3_33890c9a04f5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_54123e31_afbf_4559_bb8b_67311584b1a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_d1ed2c63_95a4_445d_bd7f_5e4d9b88fdf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_cee584f5_5a4c_403a_835d_c2cd4f4ae0f1(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2);
            n /= 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_ab4acb4a_0280_4ead_8cc8_6c855ec3ca12(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_1_d516c308_4798_4a52_a29a_7607dee5ea30(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_15fbf38d_ac8c_4c82_83ae_cfa71edb37b6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_1df23e50_9941_417a_b7ca_7157d258a6a5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_caca6d3e_ee78_47ff_96a4_4a0dbebad215(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int x = n % 2;
            result.append(x != 0 ? "1" : "0");
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_0_b900cb7d_fcef_4024_90a0_2826021573fd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_06ba7271_8c4b_44f1_ad85_42d5629f01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e58c75a0_0c79_48e6_884a_cb070054779e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_e58c75a0_0c79_48e6_884a_cb070054779e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_a8899ffc_aa5c_41b4_bc87_0bc723c45bec(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_a704d082_d34c_4285_9a22_e8a41429b739(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_c68fd123_2b55_4660_b64a_5f20c37c883c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_106ccc6a_6eaa_420d_9cc0_747c28741363(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_43d12aeb_8c9a_4289_a4cb_57265984daaf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ad064f5e_ee0f_461b_838a_5d428b8f0c6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2d5c6720_75b6_4a56_b6fd_ea2210f15b9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_2d5c6720_75b6_4a56_b6fd_ea2210f15b9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_fffa94f7_16e6_4c25_9e13_a73562ef10fc(int n) {
        // your code here
        int n1 = Math.abs(n);
        String res = "";
        int n2 = n1;
        do {
            int x = n2;
            int y = n1;
            n1 = n2;
            n2 = x;
            String z = "1";
            if (n2 > 1){
                z = "0";
            }
            res = res + z;
        } while (n1 != n2);
        if(res.length() > 2)
            res = res.substring(1);
        return res;
    }

    
    public static String decimalToBinary_Problem_1_2986bd9c_1ff8_4ec6_a77f_f898168ac79a(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_66e0d0fe_7184_45fb_a619_d06601906745(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_d0dbac3f_0aca_4aea_bd81_89cb27cf7036(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2cb341e9_6d66_49e3_b5c1_a81fd986808e(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_d1ed2c63_95a4_445d_bd7f_5e4d9b88fdf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3cf9a6a5_7da0_4f2f_b6af_9ce58e4822f1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_84a0968f_8402_4bc1_bc02_0eeba88d7690(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_1c4f310e_ae6e_434a_b6bf_ad0dee7178e6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2cb341e9_6d66_49e3_b5c1_a81fd986808e(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_83b75cc9_1ac6_4352_84ed_9dbf78f5966f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_34bf2a10_1a8c_419e_af59_278c378acf71(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_c695bccb_59e5_435d_add7_d1ca7d026ae1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3aae34ca_d21d_436d_912c_0521b6c12037(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_05a36734_761e_4ada_aa8b_9952ed157bbf(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1 - binary.length() % 8);
    }

    
    public static String decimalToBinary_Problem_2_3051b230_424a_40fa_89a9_0407b83bb316(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_5763595e_05f4_4edf_9466_8adc19255f4a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_a8899ffc_aa5c_41b4_bc87_0bc723c45bec(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_745219a1_c03e_46c8_b2ef_d01064b23624(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_799df440_f7d3_4da1_9872_371bde17b107(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_07ae79e4_9ed1_41b8_839c_28a7b8ae25ba(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f939a8ca_831e_403f_b606_62117c477b19(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_9402f14d_f63a_4123_9f90_e6f8ee97d2e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_0f4c3a7d_2883_4fd9_8f44_e03a41fd8159(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_246cb88f_19be_473a_b039_db2922ea8e97(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b27d1f10_40f3_4e08_84bd_b6bd6f0ffcae(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ac8040b1_f71c_4c2e_b083_caea35f6ade7(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_9a695255_d460_4f5e_8558_3e9b476e192c(int n) {
        StringBuffer binary = new StringBuffer("");
        for(int i = 7; i >= 0; i--){
            if((n & (1 << i)) != 0){
                binary.insert(0, 1);
            }
            else{
                binary.insert(0, 0);
            }
        }
        return binary.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_4e1ae74e_8eb9_47e1_9d2e_685145e363d2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c695bccb_59e5_435d_add7_d1ca7d026ae1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_d8c8c516_b001_45a2_b4bf_25f73dd0ae76(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_caca6d3e_ee78_47ff_96a4_4a0dbebad215(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int x = n % 2;
            result.append(x != 0 ? "1" : "0");
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_2_dbff9abc_7349_42c7_af97_3840ae53b611(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_db1722c8_1a0c_4426_9dfa_1c8b7c026144(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_433aaa2c_4a4b_4cf8_b627_a6b3d1c47526(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b5312a04_2c1f_44c6_86b2_002589faf81f(int n) {
        // TODO Complete the function
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append((n % 2 == 1 ? "1" : "0"));
            n /= 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_f28e7fac_118d_4bcd_8b17_30888bf5f65b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_4329e83f_b032_433a_8dc4_10d2be605fc1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_11fcc1af_003f_41de_a0b0_d00f2655bb6f(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ca2a03d9_c4a8_497f_97b8_647f104cd21a(int n) {
        StringBuilder result = new StringBuilder();
        while (n!=0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_4f123fd6_8252_4150_a3c4_da3e954fa4cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_640b88a4_6660_47ba_a9ce_26effad2fa11(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_535a6df9_543c_4649_b037_f8975aaedce6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1ad7aaa4_6b6e_4598_90d0_6852053161b3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_40dc9176_bc33_4c25_beb8_8de1666b52a1(int n) {
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(binary.length() - 1);
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_9e1b60d5_52cb_4c4d_92bd_5668336e8539(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ca2a03d9_c4a8_497f_97b8_647f104cd21a(int n) {
        StringBuilder result = new StringBuilder();
        while (n!=0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_1ad7aaa4_6b6e_4598_90d0_6852053161b3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_9fd55be5_6547_4713_9433_9a5bbbfc6221(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e66b588f_a758_4c55_967b_fcdde4352e39(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0a64891d_4bf5_482f_a321_7b8a50083a25(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_68025084_a5f7_4ac8_9788_60c6fda927a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_00f16771_ab70_4c80_b670_80d8ee84f08a(int n) {
        String binary = "";
        int bitCount = 1;
        while ((n != 0) && (bitCount < 64)) {
            binary += (n & 1) + "";
            n = n >>> 1;
            bitCount++;
        }
        return binary.substring(0, bitCount - 1);
    }

    
    public static String decimalToBinary_Problem_0_f939a8ca_831e_403f_b606_62117c477b19(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_d9fb9001_cd89_44fa_90dc_de1747361529(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_245f0ae3_69f3_40a6_addb_3449546b6979(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c68fd123_2b55_4660_b64a_5f20c37c883c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c200c7a7_c58f_41d1_92b3_33890c9a04f5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c8f5f51d_833d_4730_9244_41f62ba0e312(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int remainder = n % 2;
            result.append(remainder);
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_0_e8a68b3d_f087_4bd5_b1b6_7d623e18d099(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_12a9d7ba_11a5_49fb_b4b9_dcc749066a12(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_0dbe6b67_206a_488b_ba56_0604864f2d75(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_092f1aa5_f1e3_4351_ac60_c7dad0ea3711(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_43c227e1_2c35_42b6_a5d3_0aabe91687f2(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1);
    }

    
    public static String decimalToBinary_Problem_1_f886fc5d_f3aa_4c3d_99a4_24208c634f66(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c4eb9380_8a40_4bb0_8021_8d166f1b7c3e(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_49816c3c_80b1_4819_914b_122d86ba956a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_64b78e19_92f8_43c3_925f_ed0867579f32(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_06ba7271_8c4b_44f1_ad85_42d5629f01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_cfd4507b_eeb6_4f6a_8655_57ccda902aa1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b170c4d1_f61a_4625_9e78_4c82bca8905a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_cfd4507b_eeb6_4f6a_8655_57ccda902aa1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_15c8f115_8b44_49f5_85f4_3b1b05853110(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ac8040b1_f71c_4c2e_b083_caea35f6ade7(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_254a4908_1c17_4d88_aa1e_c58843399467(int n) {
        return Integer.toString(n, 2);
    }

    
    public static String decimalToBinary_Problem_2_f74b18bb_36a0_4237_8296_b1d3046a61a9(int n) {
        return String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
    }

    
    public static String decimalToBinary_Problem_2_9f6deac2_167f_4fe8_8276_5111f72a2f89(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_5763595e_05f4_4edf_9466_8adc19255f4a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ca64d010_a222_4b16_85a9_119138c43e7f(int n) {
        String decimalToBinary_Problem_1_ca64d010_a222_4b16_85a9_119138c43e7f = "000000000000000000000000000000000000000000000000";
        while (n>0) {
            int digit = n%2;
            decimalToBinary_Problem_1_ca64d010_a222_4b16_85a9_119138c43e7f += "" + digit;
            n = n/2;
        }
        return decimalToBinary_Problem_1_ca64d010_a222_4b16_85a9_119138c43e7f;
    }

    
    public static String decimalToBinary_Problem_0_d0dbac3f_0aca_4aea_bd81_89cb27cf7036(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_6508864e_36c4_491d_b447_3a3d02a98bb1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_620a975c_374c_46e7_aca0_f5880ec71d3d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7460572e_9e90_4124_aecd_4edc4a096319(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3a3298bb_9f01_4fea_ba7f_7e12a887e679(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3e0ac21a_dd0b_4002_87a2_1a77eeeee888(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_9e1b60d5_52cb_4c4d_92bd_5668336e8539(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0f4c3a7d_2883_4fd9_8f44_e03a41fd8159(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0dbe6b67_206a_488b_ba56_0604864f2d75(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_9711f9f7_2603_4b7b_8984_3b9b66fe9fc9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7e77e636_bce3_4cb1_aac5_75a384abad9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            sb.append(n % 2);
            n = n / 2;
        }
        sb.insert(0, "0");
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_caca6d3e_ee78_47ff_96a4_4a0dbebad215(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int x = n % 2;
            result.append(x != 0 ? "1" : "0");
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_2_e6c29f4b_0c53_4799_8a51_c00330f2d66a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_966102fc_2861_4d16_9aaa_69e7f5eec6a1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_a5d75b3d_f566_4d2e_8b38_ae3a9b08593c(int n) {
        String binary = "";
        int x = 1;
        while (n>0) {
            if(n%2==1){
                binary=binary+x;
            }
            x=x*10;
            n=n/2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_fd8c1d81_bc0e_4de4_8f01_47e1e03c8fe6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_0dbe6b67_206a_488b_ba56_0604864f2d75(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c68fd123_2b55_4660_b64a_5f20c37c883c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7340c7ff_82f6_4b5b_9fda_d2e99061ea10(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_58359603_c194_4bd5_973e_6087b199383a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b7b3659d_a130_43c4_abde_799174254339(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_06f27199_5463_4b00_92f7_9a95332d579f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_72d3fac1_7b31_49c8_8bd8_d507b0311fdf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_9a695255_d460_4f5e_8558_3e9b476e192c(int n) {
        StringBuffer binary = new StringBuffer("");
        for(int i = 7; i >= 0; i--){
            if((n & (1 << i)) != 0){
                binary.insert(0, 1);
            }
            else{
                binary.insert(0, 0);
            }
        }
        return binary.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_7c70cac0_02ee_4fc5_86fb_2ca60f9e1bd9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_092f1aa5_f1e3_4351_ac60_c7dad0ea3711(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b900cb7d_fcef_4024_90a0_2826021573fd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_83bae978_2b4d_4f94_8c00_208ebcda8c8f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_4e1ae74e_8eb9_47e1_9d2e_685145e363d2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2087c879_9d44_488c_8867_0d8bfc5284c3(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1);
    }

    
    public static String decimalToBinary_Problem_0_3aae34ca_d21d_436d_912c_0521b6c12037(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b90d4d5b_7ce8_4903_a1cb_224c47db6023(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2d5c6720_75b6_4a56_b6fd_ea2210f15b9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_60038664_110b_48ac_8c80_929a52f4ad8b(int n) {
        String binary = Integer.toString(n, 2);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_cb65be60_f985_43f6_a885_8ae6d1834448(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_a1c5040d_5606_445d_a5fa_069372e48669(int n) {
        StringBuilder sb = new StringBuilder("");
        while (n > 0) {
            sb.append((n & 1) == 1 ? "1" : "0");
            n >>>= 1;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_23de8786_eebb_4318_afb9_9d7ed358eb4b(int n) {
        String binary = "";
        while (n > 0) {
            if (n % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_fd8c1d81_bc0e_4de4_8f01_47e1e03c8fe6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_33374f5d_b169_448a_b7d7_185b628b1644(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_72d3fac1_7b31_49c8_8bd8_d507b0311fdf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_df77942f_ded7_427b_b8b6_6f1c9810aed9(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_b5312a04_2c1f_44c6_86b2_002589faf81f(int n) {
        // TODO Complete the function
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append((n % 2 == 1 ? "1" : "0"));
            n /= 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_fffa94f7_16e6_4c25_9e13_a73562ef10fc(int n) {
        // your code here
        int n1 = Math.abs(n);
        String res = "";
        int n2 = n1;
        do {
            int x = n2;
            int y = n1;
            n1 = n2;
            n2 = x;
            String z = "1";
            if (n2 > 1){
                z = "0";
            }
            res = res + z;
        } while (n1 != n2);
        if(res.length() > 2)
            res = res.substring(1);
        return res;
    }

    
    public static String decimalToBinary_Problem_0_078e730d_7035_4129_8a06_461d4e99ed98(int n) {
        String res = "";
        while (n != 0) {
            res = Integer.toBinaryString(n) + res;
            n = n / 2;
        }
        return res;
    }

    
    public static String decimalToBinary_Problem_2_fd8c1d81_bc0e_4de4_8f01_47e1e03c8fe6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_58359603_c194_4bd5_973e_6087b199383a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_11db08e8_b5db_4987_96f3_0f60ab5e95a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_51d17aaa_28db_4ce3_b814_996389ed26e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_d0dbac3f_0aca_4aea_bd81_89cb27cf7036(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_53bc2b85_e5ea_4826_aa64_171fe10cd37c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f8055afe_3cbf_4c54_aeec_3158c36d9d50(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_049f9e4a_ec08_4efb_86da_ce75244633ac(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_e6c29f4b_0c53_4799_8a51_c00330f2d66a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_d8c8c516_b001_45a2_b4bf_25f73dd0ae76(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_54bf6021_7c03_4598_a263_974fc15836d0(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_18ac6874_a4e7_470e_9197_fb02d18a9da4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b6053083_d63d_4d89_a2d8_8fabafb6b6b8(int n) {
        String binary = "";
        while (n > 0) {
            binary += n % 2 == 0 ? "1" : "0";
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_84a0968f_8402_4bc1_bc02_0eeba88d7690(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_ee2e1cf6_d0bd_4634_b1f7_581d93a30361(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_055c45d6_096b_459f_aa34_d8ff434b445c(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_df33dba0_9f03_4ceb_991e_ef670a6f69a9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_a01e3df9_c4f5_4211_8e62_a6471468ebdd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0c6d7d47_111f_43b7_9374_64e439e24c0c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_847c65c7_d029_4cc7_8c18_7533781e2510(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_106ccc6a_6eaa_420d_9cc0_747c28741363(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3e0ac21a_dd0b_4002_87a2_1a77eeeee888(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3347c1ff_f053_4207_92a1_13eaba7a2880(int n) {
        String binary = Integer.toBinaryString(n);
        int remainder = binary.length() % 8;
        if (remainder == 0) {
            int pos = binary.length() - remainder;
            String zeros = "0000000000000000000000000000000000000000";
            binary = zeros.substring(pos, pos + 8);
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_ad007fb0_76b8_40c4_851e_2dbdaafb5606(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7c70cac0_02ee_4fc5_86fb_2ca60f9e1bd9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f886fc5d_f3aa_4c3d_99a4_24208c634f66(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b17c34d3_3ded_4a14_ad5e_1afc2bc3f32f(int n) {
        String binary = Integer.toString(n);
        int decimal = Integer.parseInt(binary);
        int remainder = decimal % 2;
        while (decimal >= 2) {
            decimal = decimal / 2;
            binary += Integer.toString(decimal).substring(1);
            decimal %= 2;
        }
        binary = binary + Integer.toString(remainder);
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_022d3279_e212_45b2_aed8_69f3e8582341(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_745219a1_c03e_46c8_b2ef_d01064b23624(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_fdb42f11_4070_4ff6_af03_e6fd9db7abd2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_822350df_09a9_469b_928a_ca2f345acd87(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9402f14d_f63a_4123_9f90_e6f8ee97d2e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_de44d344_0a61_448d_b5c5_2e83c7127d68(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_84a0968f_8402_4bc1_bc02_0eeba88d7690(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_8ae768f1_5f7c_4755_b819_153bea3a3a6e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_83b75cc9_1ac6_4352_84ed_9dbf78f5966f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b53d6b7c_4921_43b9_84b6_0bc42e636067(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n).length()+2);
        sb.append(Integer.toString(n));
        int p = 1;
        int q = 1;
        while (n > 0) {
            int c = n%10;
            if (c != 0) {
                if (p < 2) {
                    sb.insert(0,"0");
                    p = 0;
                }
                sb.insert(0, Integer.toString(c));
            }
            n = n/10;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_4c9845ae_944f_4314_acd7_fb7644e501ca(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f75a368f_b7af_4e78_b828_25f6705afc0d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f7056b9e_c3b5_4960_a903_b190660a43e4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_4262409e_0582_4def_be08_92be726f7685(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_83bae978_2b4d_4f94_8c00_208ebcda8c8f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_a01e3df9_c4f5_4211_8e62_a6471468ebdd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0617672f_f4a4_4ec6_8188_ac148077b6e0(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_4329e83f_b032_433a_8dc4_10d2be605fc1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_eb35ace5_13e7_4a87_8b7d_1619c20686cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_018c72a6_50d6_40f2_a948_74e108cc5a4c(int n) {
        BigInteger num = new BigInteger(Integer.toString(n));
        return num.toString(2);
    }

    
    public static String decimalToBinary_Problem_1_60038664_110b_48ac_8c80_929a52f4ad8b(int n) {
        String binary = Integer.toString(n, 2);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_de2b0c32_c83f_4edf_ada3_9f4491174a73(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_43d12aeb_8c9a_4289_a4cb_57265984daaf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_756dd34e_48c8_4358_bb78_04221be46d34(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b9e46734_5240_4cd3_87ee_2c27c7d7b9e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_4262409e_0582_4def_be08_92be726f7685(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b9e46734_5240_4cd3_87ee_2c27c7d7b9e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_049f9e4a_ec08_4efb_86da_ce75244633ac(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_9402f14d_f63a_4123_9f90_e6f8ee97d2e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c1d67aae_5aff_411a_bccc_a363196966b7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_8ae768f1_5f7c_4755_b819_153bea3a3a6e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_598c4ca4_75cb_4bcc_bfe5_d0a1c265861b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_577e0ecf_4ca5_4792_acb0_7753630e4603(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9711f9f7_2603_4b7b_8984_3b9b66fe9fc9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_7460572e_9e90_4124_aecd_4edc4a096319(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_ca2a03d9_c4a8_497f_97b8_647f104cd21a(int n) {
        StringBuilder result = new StringBuilder();
        while (n!=0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_da853ef1_0864_43cc_b4d9_0d6abda5484b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c695bccb_59e5_435d_add7_d1ca7d026ae1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_4d4d810c_a30f_43ab_bb9c_6f392b3a77b8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_7884c8f7_3a0a_473f_a784_705b655754cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_12e5e179_938c_4710_a646_267e3ee65c81(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_0617672f_f4a4_4ec6_8188_ac148077b6e0(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3d7942ab_0f25_4bc2_aed0_11364d6b5b46(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ad007fb0_76b8_40c4_851e_2dbdaafb5606(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_587b9c0d_ea07_4b6f_a0ce_4cc6a47f2738(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_fba97e87_7c24_45e8_be8b_3b57aaa0d7f8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_005e458d_a285_4578_94c3_42c49982181b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_254a4908_1c17_4d88_aa1e_c58843399467(int n) {
        return Integer.toString(n, 2);
    }

    
    public static String decimalToBinary_Problem_2_7c70cac0_02ee_4fc5_86fb_2ca60f9e1bd9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b53d6b7c_4921_43b9_84b6_0bc42e636067(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n).length()+2);
        sb.append(Integer.toString(n));
        int p = 1;
        int q = 1;
        while (n > 0) {
            int c = n%10;
            if (c != 0) {
                if (p < 2) {
                    sb.insert(0,"0");
                    p = 0;
                }
                sb.insert(0, Integer.toString(c));
            }
            n = n/10;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_fdb42f11_4070_4ff6_af03_e6fd9db7abd2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_83de2609_f76d_4a7a_85ec_652e7fbc542d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_26ca1a3d_750f_46e9_b8fd_f44d0e525a53(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        binary = new String(new char[binary.length()]).replace('\0', '1');
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_49816c3c_80b1_4819_914b_122d86ba956a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_53c3d113_ffce_4f24_9779_b37bdea82e55(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_26ca1a3d_750f_46e9_b8fd_f44d0e525a53(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        binary = new String(new char[binary.length()]).replace('\0', '1');
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_06ab20ef_ec54_431f_a4b7_b7fdd01d0be7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_addb941a_67c4_4cc9_b899_51d6cbe405f9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_df33dba0_9f03_4ceb_991e_ef670a6f69a9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_4262409e_0582_4def_be08_92be726f7685(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_c32aed19_16c7_4747_bca4_362464ad315d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f939a8ca_831e_403f_b606_62117c477b19(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_51d17aaa_28db_4ce3_b814_996389ed26e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_fdb42f11_4070_4ff6_af03_e6fd9db7abd2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_69e52326_a019_48a2_957b_bf2ae227d74b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_5b66d43d_a661_4b3b_8602_133305dbd701(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_53ef3491_ab97_4cf3_a618_2efc13853832(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_577e0ecf_4ca5_4792_acb0_7753630e4603(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_edcf8536_eeb8_445c_b935_e2b3f8d6a45f(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int temp = n % 2;
            sb.append(temp);
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_055c45d6_096b_459f_aa34_d8ff434b445c(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_035d8529_0387_44a7_b483_660c8c349f5e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9c75cebe_975b_4b5b_af50_98f560540d5c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1121fc1d_f653_4498_8505_f10a3ad7db29(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_822350df_09a9_469b_928a_ca2f345acd87(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_47551b0c_aa6a_4a79_a672_0f0f58075a1f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_587b9c0d_ea07_4b6f_a0ce_4cc6a47f2738(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_99baed7d_21d9_4499_aa4c_61798a0fd9d4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_39ab5ef3_3830_47a5_a0ac_c2ec607c0e58(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7884c8f7_3a0a_473f_a784_705b655754cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_ab4acb4a_0280_4ead_8cc8_6c855ec3ca12(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(n % 2);
            n /= 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_1_43ae6d62_1c90_4bb1_a8a8_9cfb56cf7dab(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_9c75cebe_975b_4b5b_af50_98f560540d5c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f47e30b6_17f6_4c40_bd07_322726a55744(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3e005187_8935_4f85_a46b_7f19788d7cdb(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3d7942ab_0f25_4bc2_aed0_11364d6b5b46(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f0ebb76a_14fd_4924_98d1_b0d9ed6f49e9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_4c9845ae_944f_4314_acd7_fb7644e501ca(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2087c879_9d44_488c_8867_0d8bfc5284c3(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1);
    }

    
    public static String decimalToBinary_Problem_1_b3262a46_2541_463c_abcc_9926b7e2984a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2732bc72_dbda_42ab_8e98_e82c87de0914(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_df33dba0_9f03_4ceb_991e_ef670a6f69a9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_07ae79e4_9ed1_41b8_839c_28a7b8ae25ba(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_4329e83f_b032_433a_8dc4_10d2be605fc1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_6508864e_36c4_491d_b447_3a3d02a98bb1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_078e730d_7035_4129_8a06_461d4e99ed98(int n) {
        String res = "";
        while (n != 0) {
            res = Integer.toBinaryString(n) + res;
            n = n / 2;
        }
        return res;
    }

    
    public static String decimalToBinary_Problem_1_15c8f115_8b44_49f5_85f4_3b1b05853110(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_7e77e636_bce3_4cb1_aac5_75a384abad9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            sb.append(n % 2);
            n = n / 2;
        }
        sb.insert(0, "0");
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_5b66d43d_a661_4b3b_8602_133305dbd701(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_37e2f8ef_f0e9_4851_a03e_2ed6250faca2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3cf9a6a5_7da0_4f2f_b6af_9ce58e4822f1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_43ae6d62_1c90_4bb1_a8a8_9cfb56cf7dab(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_15fbf38d_ac8c_4c82_83ae_cfa71edb37b6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f7b7ad92_03fd_4040_919e_78efbd7375d7(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder result = new StringBuilder();
        for(int i = binary.length()-1; i>=0; i--) {
            result.append(binary.charAt(i));
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_1_df77942f_ded7_427b_b8b6_6f1c9810aed9(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_53ef3491_ab97_4cf3_a618_2efc13853832(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f7b7ad92_03fd_4040_919e_78efbd7375d7(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder result = new StringBuilder();
        for(int i = binary.length()-1; i>=0; i--) {
            result.append(binary.charAt(i));
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_0_b22948f5_30e7_408d_8692_3d4561779b06(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_69e52326_a019_48a2_957b_bf2ae227d74b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3cf9a6a5_7da0_4f2f_b6af_9ce58e4822f1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_db1722c8_1a0c_4426_9dfa_1c8b7c026144(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_dc1f5871_10b4_4b7a_91f8_3e48e73805f2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_433aaa2c_4a4b_4cf8_b627_a6b3d1c47526(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_27bd9f6a_9d51_42e4_80e2_e2b05930c83f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_587b9c0d_ea07_4b6f_a0ce_4cc6a47f2738(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_0d2379cd_7788_409c_ac75_54031ab68d01(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_9711f9f7_2603_4b7b_8984_3b9b66fe9fc9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3cadb039_05f4_4fac_9f94_bcad5d979c22(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_d516c308_4798_4a52_a29a_7607dee5ea30(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_a1c5040d_5606_445d_a5fa_069372e48669(int n) {
        StringBuilder sb = new StringBuilder("");
        while (n > 0) {
            sb.append((n & 1) == 1 ? "1" : "0");
            n >>>= 1;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_eb336975_ce28_4ccf_beea_2fec72fbabab(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_09df0a27_8ce3_42c0_b7a1_c6d4adec2a7b(int n) {
        String binary = Integer.toBinaryString(n);
        int zeroCount = binary.length() - 1;
        return binary.substring(zeroCount);
    }

    
    public static String decimalToBinary_Problem_2_b6053083_d63d_4d89_a2d8_8fabafb6b6b8(int n) {
        String binary = "";
        while (n > 0) {
            binary += n % 2 == 0 ? "1" : "0";
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_ad007fb0_76b8_40c4_851e_2dbdaafb5606(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_6670e5ab_4d43_4127_b408_f9be95a0ff7e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_23de8786_eebb_4318_afb9_9d7ed358eb4b(int n) {
        String binary = "";
        while (n > 0) {
            if (n % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_85105e4a_805a_4b42_9f71_38ad2b257a57(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ee2e1cf6_d0bd_4634_b1f7_581d93a30361(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_434626e1_2cd3_4b23_a06c_1a86ee486fe6(int n) {
        if (n == 0) {
            return "0";
        }
        if (n % 2 == 0) {
            return decimalToBinary_Problem_2_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + "" + 1;
        } else {
            return decimalToBinary_Problem_2_434626e1_2cd3_4b23_a06c_1a86ee486fe6(n / 2) + 1;
        }
    }

    
    public static String decimalToBinary_Problem_1_254a4908_1c17_4d88_aa1e_c58843399467(int n) {
        return Integer.toString(n, 2);
    }

    
    public static String decimalToBinary_Problem_1_9ab9bca6_b868_4760_aebd_d706dc24018d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_eb336975_ce28_4ccf_beea_2fec72fbabab(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_60c78525_9967_4a56_870e_f3c6c68772ef(int n) {
        String binary = "";
        while ((n != 0L) && (n != 1L)) {
            if ((n % 2) == 1) {
                binary += "1";
            } else {
                binary += "0";
            }
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_83b75cc9_1ac6_4352_84ed_9dbf78f5966f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b900cb7d_fcef_4024_90a0_2826021573fd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c8f5f51d_833d_4730_9244_41f62ba0e312(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            int remainder = n % 2;
            result.append(remainder);
            n = n / 2;
        }
        return result.toString();
    }

    
    public static String decimalToBinary_Problem_2_e66b588f_a758_4c55_967b_fcdde4352e39(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_5b66d43d_a661_4b3b_8602_133305dbd701(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_a704d082_d34c_4285_9a22_e8a41429b739(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3d62e74c_1023_40f7_8d7f_2122ca1b5da9(int n) {
        String str = Integer.toString(n);
        str = str.replace('L', ' ');
        str = str.replace(',', ' ');
        str = str.substring(1);
        return str.substring(0, str.length()-1);
    }

    
    public static String decimalToBinary_Problem_1_9af97910_f469_43e8_b697_3e7d10ff4c34(int n) {
        // Write your code here
        int bit = 1;
        String binary = "";
        while (n != 0) {
            int rem =  (n % 2);
            n /= 2;
            binary = String.valueOf(1) + rem + binary;
            n =  n;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_515683b3_e951_409c_8ec0_e2275a793d8f(int n) {
        String decimal = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        char[] buf = new char[64];
        for (int i = 64; i >= 0; i--) {
            int val = decimal.charAt(i) - '0';
            if (val > 0) {
                sb.append(val % 2);
            }
            else {
                sb.append(val / 2);
            }
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_32ab712e_a533_4174_9f6e_776633d32394(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_12a9d7ba_11a5_49fb_b4b9_dcc749066a12(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_d9fb9001_cd89_44fa_90dc_de1747361529(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_7e77e636_bce3_4cb1_aac5_75a384abad9d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            sb.append(n % 2);
            n = n / 2;
        }
        sb.insert(0, "0");
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_433aaa2c_4a4b_4cf8_b627_a6b3d1c47526(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_11fcc1af_003f_41de_a0b0_d00f2655bb6f(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_11db08e8_b5db_4987_96f3_0f60ab5e95a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_83bae978_2b4d_4f94_8c00_208ebcda8c8f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_246cb88f_19be_473a_b039_db2922ea8e97(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_ca64d010_a222_4b16_85a9_119138c43e7f(int n) {
        String decimalToBinary_Problem_2_ca64d010_a222_4b16_85a9_119138c43e7f = "000000000000000000000000000000000000000000000000";
        while (n>0) {
            int digit = n%2;
            decimalToBinary_Problem_2_ca64d010_a222_4b16_85a9_119138c43e7f += "" + digit;
            n = n/2;
        }
        return decimalToBinary_Problem_2_ca64d010_a222_4b16_85a9_119138c43e7f;
    }

    
    public static String decimalToBinary_Problem_1_f6936e2f_e82c_4b1f_80b5_b1cb2f93caee(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_640b88a4_6660_47ba_a9ce_26effad2fa11(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_34bf2a10_1a8c_419e_af59_278c378acf71(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_cab2aa00_4900_4c91_a495_2d37455c56b2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3347c1ff_f053_4207_92a1_13eaba7a2880(int n) {
        String binary = Integer.toBinaryString(n);
        int remainder = binary.length() % 8;
        if (remainder == 0) {
            int pos = binary.length() - remainder;
            String zeros = "0000000000000000000000000000000000000000";
            binary = zeros.substring(pos, pos + 8);
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_337d89ef_5081_4355_98fa_7e0f91bbadb8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2586e5b4_95cb_4094_9aa0_d4a4a82594a6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b27d1f10_40f3_4e08_84bd_b6bd6f0ffcae(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_1df23e50_9941_417a_b7ca_7157d258a6a5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_26ca1a3d_750f_46e9_b8fd_f44d0e525a53(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        binary = new String(new char[binary.length()]).replace('\0', '1');
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_2586e5b4_95cb_4094_9aa0_d4a4a82594a6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f6936e2f_e82c_4b1f_80b5_b1cb2f93caee(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f74b18bb_36a0_4237_8296_b1d3046a61a9(int n) {
        return String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
    }

    
    public static String decimalToBinary_Problem_2_a1c5040d_5606_445d_a5fa_069372e48669(int n) {
        StringBuilder sb = new StringBuilder("");
        while (n > 0) {
            sb.append((n & 1) == 1 ? "1" : "0");
            n >>>= 1;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_0617672f_f4a4_4ec6_8188_ac148077b6e0(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_5f69ed40_133b_43b0_a29f_985d8a3c3efd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_66e0d0fe_7184_45fb_a619_d06601906745(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_18f4ad72_37d2_4b0d_b857_f11ffe91a914(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_4c9845ae_944f_4314_acd7_fb7644e501ca(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_2135e9f8_97ea_4f79_9516_a365b12eb982(int n) {
        String binary = "";
        for(int i = 63; i >= 0; i--) {
            if(n>=Math.pow(2,i))
                binary += ("1");
            else
                binary += ("0");
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_addb941a_67c4_4cc9_b899_51d6cbe405f9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_dc1f5871_10b4_4b7a_91f8_3e48e73805f2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_53bc2b85_e5ea_4826_aa64_171fe10cd37c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_e1a8c8e8_d345_47ce_a417_b93a600b75ca(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_53c3d113_ffce_4f24_9779_b37bdea82e55(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2959933e_c0ad_4fba_9c69_c208cdc3ec81(int n) {
        return Integer.toString(n).split("\\.")[1];
    }

    
    public static String decimalToBinary_Problem_1_f02a1f12_ad44_4754_aa49_bb8686da2ba3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_966102fc_2861_4d16_9aaa_69e7f5eec6a1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f6936e2f_e82c_4b1f_80b5_b1cb2f93caee(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_66e0d0fe_7184_45fb_a619_d06601906745(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_6670e5ab_4d43_4127_b408_f9be95a0ff7e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b7b3659d_a130_43c4_abde_799174254339(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_9fd55be5_6547_4713_9433_9a5bbbfc6221(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_598c4ca4_75cb_4bcc_bfe5_d0a1c265861b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f0ebb76a_14fd_4924_98d1_b0d9ed6f49e9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_60038664_110b_48ac_8c80_929a52f4ad8b(int n) {
        String binary = Integer.toString(n, 2);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_dbff9abc_7349_42c7_af97_3840ae53b611(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3f056fdb_551c_4e23_80fd_dc9a06b4d8b5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_7b4d2e8c_bb4d_4dd9_b4cc_4b4282aa07e2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_40dc9176_bc33_4c25_beb8_8de1666b52a1(int n) {
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(binary.length() - 1);
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_0a64891d_4bf5_482f_a321_7b8a50083a25(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2874eb5f_9fa9_4fc6_ab5e_f7bc25542993(int n) {
        String str = Integer.toString(n);
        if(str.charAt(0) == '0')
            str = str.substring(1);
        return str;
    }

    
    public static String decimalToBinary_Problem_2_2087c879_9d44_488c_8867_0d8bfc5284c3(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1);
    }

    
    public static String decimalToBinary_Problem_1_99baed7d_21d9_4499_aa4c_61798a0fd9d4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_abeff323_f9fc_45c7_bc5f_584fddab182e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_59785a25_c69b_441c_b554_c1c1b31beaa4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_a52ae820_b5cd_4162_a8d0_b3f1e6c5414c(int n) {
        BigInteger bi = new BigInteger(Integer.toString(n), 2);
        return bi.toString(2);
    }

    
    public static String decimalToBinary_Problem_1_337d89ef_5081_4355_98fa_7e0f91bbadb8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_6531a3af_d16b_490c_98f8_a4a162705dda(int n) {
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(binary.length() - binary.length() % 8); // if length is not a multiple of 8, remove last character
        StringBuilder sb = new StringBuilder(binary);
        while (sb.length() < 32) // pad if int is less than 32 characters int
            sb.insert(0, 0);
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_2135e9f8_97ea_4f79_9516_a365b12eb982(int n) {
        String binary = "";
        for(int i = 63; i >= 0; i--) {
            if(n>=Math.pow(2,i))
                binary += ("1");
            else
                binary += ("0");
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_30fc2a5e_7c83_4472_9c2a_250854403cf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_30fc2a5e_7c83_4472_9c2a_250854403cf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_8816c06d_7511_4c7e_b707_d3cb40e7a7e6(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 0) {
            while (n != 0) {
                sb.append(n % 2);
                n = n / 2;
            }
        } else {
            while (n != 0) {
                sb.append(n % 2);
                n = n / 2;
            }
            while (sb.length() < 32) {
                sb.insert(0, '0');
            }
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_515683b3_e951_409c_8ec0_e2275a793d8f(int n) {
        String decimal = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        char[] buf = new char[64];
        for (int i = 64; i >= 0; i--) {
            int val = decimal.charAt(i) - '0';
            if (val > 0) {
                sb.append(val % 2);
            }
            else {
                sb.append(val / 2);
            }
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_cb65be60_f985_43f6_a885_8ae6d1834448(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_cab2aa00_4900_4c91_a495_2d37455c56b2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_dac8d9a4_1963_4f8c_89c2_eb03a174d17f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_54123e31_afbf_4559_bb8b_67311584b1a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_cab2aa00_4900_4c91_a495_2d37455c56b2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_822350df_09a9_469b_928a_ca2f345acd87(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_cfd4507b_eeb6_4f6a_8655_57ccda902aa1(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_a5d75b3d_f566_4d2e_8b38_ae3a9b08593c(int n) {
        String binary = "";
        int x = 1;
        while (n>0) {
            if(n%2==1){
                binary=binary+x;
            }
            x=x*10;
            n=n/2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_5b49471e_e983_4e6e_9514_8e88509237a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_640b88a4_6660_47ba_a9ce_26effad2fa11(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_2959933e_c0ad_4fba_9c69_c208cdc3ec81(int n) {
        return Integer.toString(n).split("\\.")[1];
    }

    
    public static String decimalToBinary_Problem_1_022d3279_e212_45b2_aed8_69f3e8582341(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_5f69ed40_133b_43b0_a29f_985d8a3c3efd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_470ea73e_5e57_43be_af73_e1db4d3f4d55(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f7056b9e_c3b5_4960_a903_b190660a43e4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_c200c7a7_c58f_41d1_92b3_33890c9a04f5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b6053083_d63d_4d89_a2d8_8fabafb6b6b8(int n) {
        String binary = "";
        while (n > 0) {
            binary += n % 2 == 0 ? "1" : "0";
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_f02a1f12_ad44_4754_aa49_bb8686da2ba3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_5b49471e_e983_4e6e_9514_8e88509237a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ad064f5e_ee0f_461b_838a_5d428b8f0c6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_022d3279_e212_45b2_aed8_69f3e8582341(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b7b3659d_a130_43c4_abde_799174254339(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n = n / 2;
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_2_64b78e19_92f8_43c3_925f_ed0867579f32(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b27d1f10_40f3_4e08_84bd_b6bd6f0ffcae(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2135e9f8_97ea_4f79_9516_a365b12eb982(int n) {
        String binary = "";
        for(int i = 63; i >= 0; i--) {
            if(n>=Math.pow(2,i))
                binary += ("1");
            else
                binary += ("0");
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_b22948f5_30e7_408d_8692_3d4561779b06(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f7056b9e_c3b5_4960_a903_b190660a43e4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_8816c06d_7511_4c7e_b707_d3cb40e7a7e6(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 0) {
            while (n != 0) {
                sb.append(n % 2);
                n = n / 2;
            }
        } else {
            while (n != 0) {
                sb.append(n % 2);
                n = n / 2;
            }
            while (sb.length() < 32) {
                sb.insert(0, '0');
            }
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_83de2609_f76d_4a7a_85ec_652e7fbc542d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_1121fc1d_f653_4498_8505_f10a3ad7db29(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_bdfcdd26_dbe5_426d_a473_65656f543c52(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_34bf2a10_1a8c_419e_af59_278c378acf71(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

}
