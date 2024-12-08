package mbpp_576_is_Sub_Array;

public class mbpp_576_is_Sub_Array {

    
    public static boolean isSubArray_Problem_2_3add8d4a_68f1_4dfb_9f0e_24ef6b785606(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_71357507_33c4_42b3_9cec_21c382877198(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_b1a2d8f8_ae25_4661_a131_2a192e83ba7c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer i : A) {
            sum += i;
        }
        int sum2 = 0;
        for (Integer i : B) {
            sum2 += i;
        }
        if (sum == sum2) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_73c4881d_37e4_423f_bcd5_23c47bc9380a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_01c20d3a_2635_4320_8911_be5b24fb6d8c(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size()+B.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(A.size()+B.size());
        
        // first add all elements of A at last
        A1.addAll(A);
        // then add all elements of B at last
        B1.addAll(B);
        
        // if both array lists are not equal then return False
        if(A1.size() != B1.size()) {
            return False;
        }
        // now sort the arraylist
        ArrayList<Integer> sortedA = new ArrayList<Integer>(A);
        Collections.sort(sortedA);
        ArrayList<Integer> sortedB = new ArrayList<Integer>(B);
        Collections.sort(sortedB);
        
        // now sort A1 & B1 in descending order
        ArrayList<Integer> descendingA = new ArrayList<Integer>(A1);
        Collections.sort(descendingA);
        ArrayList<Integer> descendingB = new ArrayList<Integer>(B1);
        Collections.sort(descendingB);
        
        // return True if A1 is subset of B1 in descending order else False
        return descendingA.equals(descendingB);
    }

    
    public static boolean isSubArray_Problem_1_77470699_e1d6_4079_960c_c62c7775ae03(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int size = A.size();
        if(size == 0)
            return True;
        else if(size == B.size())
            return False;
        int i = 0;
        for(Integer i1 : A) {
            if(i1 != B.get(i))
                return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_c79ef6a3_d556_4d3f_9595_b0c07421b6be(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_0_b490f6ef_f7ee_4ff7_8cae_37cffdea0947(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_1_779dd7f3_97fa_4bce_b970_b72c11b080af(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_2efe9357_a0f3_489a_9ae9_c5239f6f9919(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> listA = new ArrayList<>();
        for (Integer element : A) {
            listA.add(element);
        }
        List<Integer> listB = new ArrayList<>();
        for (Integer element : B) {
            listB.add(element);
        }
        boolean sub = False;
        if (A.size() > B.size()) {
            for (int i = 0; i < A.size() - B.size(); i++) {
                listA.remove(0);
                listB.remove(0);
            }
            sub = True;
        }
        return sub;
    }

    
    public static boolean isSubArray_Problem_0_7ca3dc85_d193_4ece_9bbc_fc05309f8fc8(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) > B.get(j)) {
                j++;
                k++;
                l++;
            } else {
                i++;
                k++;
                l++;
            }
        }
        return k == l;
    }

    
    public static boolean isSubArray_Problem_1_de236ef1_d7b8_43f7_8069_66bdd892077e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i=0; i<B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1);
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1);
        ArrayList<Integer> A3 = new ArrayList<Integer>();
        ArrayList<Integer> B3 = new ArrayList<Integer>();
        for(int i=0; i<A2.size(); i++) {
            A3.add(A2.get(i));
        }
        for(int i=0; i<B2.size(); i++) {
            B3.add(B2.get(i));
        }
        ArrayList<Integer> A4 = A3;
        ArrayList<Integer> B4 = B3;
        ArrayList<Integer> A5 = A3;
        ArrayList<Integer> B5 = B3;
        for(int i=0; i<A4.size(); i++) {
            for(int j=0; j<B4.size(); j++) {
                if(A4.get(i) == B5.get(j)) {
                    A5.remove(A4.get(i));
                    B5.remove(B4.get(j));
                }
            }
        }
        if(A5.size() != 0) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_587e98ff_e9cb_4521_82c2_75823dd4ebb2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_52a3b074_e8fd_465c_b5d7_16fdf2ccfd87(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;
        for (int i = 0; i < A.size(); i++) {
            if (!A.contains(B.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_7d92b1df_e257_410e_bea8_627099df7021(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(a -> B.contains(a)).collect(Collectors.toList()).equals(B);
    }

    
    public static boolean isSubArray_Problem_1_b53f6d80_cfdb_464d_8d9e_25e468127dbd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_1f161615_4981_4e3e_b7e0_4387859cb04e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(e -> B.stream().anyMatch(i -> i == e)).collect(Collectors.toList()).isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_c94c4cb9_fbf5_410a_8bf3_8682fd37b495(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_ = new ArrayList<>();
        A.forEach(x -> A_.add(x));

        ArrayList<Integer> B_ = new ArrayList<>();
        B.forEach(x -> B_.add(x));

        ArrayList<Integer> intersection = new ArrayList<>();
        intersection.addAll(A_);
        intersection.addAll(B_);

        return intersection.containsAll(A_) && intersection.containsAll(B_);
    }

    
    public static boolean isSubArray_Problem_1_99476bd8_eb44_48aa_a780_607a217028f6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_0_bc595fc1_1447_46c8_b608_690e4bb6962e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : A) {
            if (!temp.contains(i)) {
                temp.add(i);
                for (int j : B) {
                    if (j == i) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_313497bf_464a_4481_b298_662291841644(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_ccb93cde_f893_443a_ac03_0c621b9d8c96(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_a4d62ae6_0baa_475b_8195_dbc3505aac2f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_4760df71_00d6_40ab_9a29_1cb525b1ad48(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3efbf521_350a_4312_b1dc_7a040c731852(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while ( i < A.size() && j < B.size() ) {
            if ( A.get(i) == B.get(j) )
                i++;
            else
                j++;
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_0_bc3a4140_a096_422c_8c79_746404b90506(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.equals(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3696a4e2_b747_456a_9dcf_f4e26997bf61(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - 1, A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_e2ee21a4_91b3_4ef0_814e_3ed03d939d0c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_88e92c3b_f005_4ad0_a022_77f9a2fbe8ec(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        return a.containsAll(b);
    }

    
    public static boolean isSubArray_Problem_2_3696a4e2_b747_456a_9dcf_f4e26997bf61(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - 1, A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_34311485_663e_406a_8d03_40d4f1b0d653(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_05d433a9_4161_4e39_95f7_aac23496430d(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B.subList(0, B.size() - 1));
    }

    
    public static boolean isSubArray_Problem_0_b52fc875_b24c_48b2_bdad_b4bced139e46(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_99476bd8_eb44_48aa_a780_607a217028f6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_0_7fa59460_8e71_43cb_9e99_8c776e6290b5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> tempList = new ArrayList<>();
        Integer minInteger = A.get(0);
        for(Integer currentInteger : A) {
            if(currentInteger < minInteger) {
                minInteger = currentInteger;
            }
            tempList.add(currentInteger);
        }
        Integer maxInteger = B.get(0);
        for(Integer currentInteger : B) {
            if(currentInteger > maxInteger) {
                maxInteger = currentInteger;
            }
        }
        while(maxInteger != minInteger) {
            if(!tempList.contains(minInteger)) {
                return False;
            }
            minInteger++;
            tempList.remove(minInteger);
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_096f7f39_6505_4589_a1b1_63ee7b13d570(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b13fac2d_7259_4a59_b142_b253c6a8d046(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int flag = 0;
        if(A.size() != B.size()){
            return False;
        }
        for(int i=0; i<A.size(); i++){
            if(A.contains(B.get(i))){
                flag++;
            }
        }
        if(flag == A.size()){
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_4760df71_00d6_40ab_9a29_1cb525b1ad48(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_d8c8bf1d_d9c3_4707_b739_9247f3f9c5ba(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_637e0f1b_e268_49a7_a196_0c4baffeefd1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            for(int j=0;j<B1.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                }
            }
        }
        return C.equals(A1);
    }

    
    public static boolean isSubArray_Problem_1_1b751103_c4d8_4dd4_b7d0_d5e54deb6205(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        // check if both array have same length
        if (A.size() != B.size())
            return False;
        //loop over each element of first array
        for (int i = 0; i < A.size(); i++) {
            //loop over each element of second array
            for (int j = 0; j < B.size(); j++) {
                //if both have same index
                if (A.size() == B.size()) {
                    if (A.get(i) == B.get(j))
                        continue;
                    else {
                        return False;
                    }
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_b181c738_b1e3_4e7e_8b3a_d261c93f33ac(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() <= B.size())
            return False;
        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i=0; i<A.size(); i++)
            if(B.contains(A.get(i)))
                subArray.add(A.get(i));
        return subArray.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_0bcce17d_1c99_4d4d_befd_c1c129aa1c4d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
            }
            j++;
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_a8489644_bf94_468c_a868_135176f26302(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        int j = 0;
        boolean flag = True;
        while (a.size() > 0 && j < b.size()) {
            if (b.get(j) == a.get(j)) {
                j++;
            } else {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_990acc95_5053_4ba3_863d_8987292d41b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_1f161615_4981_4e3e_b7e0_4387859cb04e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(e -> B.stream().anyMatch(i -> i == e)).collect(Collectors.toList()).isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_00632c35_a34c_4c70_9465_97674e36d3dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Check if A is an empty array list or not.
        if (A.isEmpty()) {
            return False;
        }

        // Check if the length of A is equal to the length of B
        if (A.size() != B.size()) {
            return False;
        }

        // Loop through the two lists and compare the two elements at respective indices if they are equal
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }

        // If we made it here then all the elements are equal and A is a subarray of B
        return True;
    }

    
    public static boolean isSubArray_Problem_1_ce25d7bf_0523_4ca8_a97d_9132388e523d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_fec97311_a834_47fd_a7de_7cd6c5d9b637(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer element : A)
            sum += element;
        int i = 0;
        for (Integer element : B)
            sum += element;
        return sum == (A.size() * B.size()) - i;
    }

    
    public static boolean isSubArray_Problem_0_bb52e49e_002e_407c_aa01_8f20e62429d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) == B.get(0) && A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        if (C.size() == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_763edeef_9681_4b77_a6c1_a0388f3b2c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int j = 0;
        int l = 0;
        int i = 0;
        while (j < A.size() && l < B.size()) {
            if (A.get(j) == B.get(l)) {
                resultList.add(A.get(j));
                i++;
                j++;
                l++;
            } else if (A.get(j) < B.get(l)) {
                j++;
            } else {
                l++;
            }
        }
        if (l < B.size()) {
            return False;
        }
        if (j != A.size()) {
            return False;
        }
        if (A.size() == resultList.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_b13fac2d_7259_4a59_b142_b253c6a8d046(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int flag = 0;
        if(A.size() != B.size()){
            return False;
        }
        for(int i=0; i<A.size(); i++){
            if(A.contains(B.get(i))){
                flag++;
            }
        }
        if(flag == A.size()){
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_fa7fdbf0_4eca_4ccb_a541_71d541e05318(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if (size < B.size()) {
            return False;
        }
        ArrayList<Integer> copy = new ArrayList<>(A);
        Collections.sort(copy);
        ArrayList<Integer> list = new ArrayList<>(B);
        Collections.sort(list);
        boolean isSub = True;
        int smallestNumber = copy.get(0);
        for (int i = 0; i < size - 1; i++) {
            if (smallestNumber > list.get(i)) {
                isSub = False;
            }
            smallestNumber = list.get(i);
        }
        return isSub;
    }

    
    public static boolean isSubArray_Problem_2_614770b1_5052_409f_aaa7_28a1e80b0730(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_0_de236ef1_d7b8_43f7_8069_66bdd892077e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i=0; i<B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1);
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1);
        ArrayList<Integer> A3 = new ArrayList<Integer>();
        ArrayList<Integer> B3 = new ArrayList<Integer>();
        for(int i=0; i<A2.size(); i++) {
            A3.add(A2.get(i));
        }
        for(int i=0; i<B2.size(); i++) {
            B3.add(B2.get(i));
        }
        ArrayList<Integer> A4 = A3;
        ArrayList<Integer> B4 = B3;
        ArrayList<Integer> A5 = A3;
        ArrayList<Integer> B5 = B3;
        for(int i=0; i<A4.size(); i++) {
            for(int j=0; j<B4.size(); j++) {
                if(A4.get(i) == B5.get(j)) {
                    A5.remove(A4.get(i));
                    B5.remove(B4.get(j));
                }
            }
        }
        if(A5.size() != 0) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_67b67241_8e0d_4337_bd06_93345ec1e5c0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_fc10244a_78bd_4c9c_8580_5aeb928d86c6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_83a2092f_2f93_420d_8148_e124755c890b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_5eab6b94_b913_45b2_9d25_b42e51f8cec2(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(elem -> B.contains(elem));
    }

    
    public static boolean isSubArray_Problem_2_17998cce_7a3e_4405_869c_a9543a4b9ed8(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_9289599b_87cb_4d0f_9f37_8403fc0d40d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0; i<A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i=0; i<B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_1_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
                break;
            }
        }
        return isSubArray_Problem_1_9289599b_87cb_4d0f_9f37_8403fc0d40d2;
    }

    
    public static boolean isSubArray_Problem_1_d8c8bf1d_d9c3_4707_b739_9247f3f9c5ba(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_634b7018_bed2_4da8_9ebc_18f480031eb9(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_5f4ab65d_9c0d_4364_bc73_afea2d240646(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return False;
    }

    
    public static boolean isSubArray_Problem_0_01c20d3a_2635_4320_8911_be5b24fb6d8c(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size()+B.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(A.size()+B.size());
        
        // first add all elements of A at last
        A1.addAll(A);
        // then add all elements of B at last
        B1.addAll(B);
        
        // if both array lists are not equal then return False
        if(A1.size() != B1.size()) {
            return False;
        }
        // now sort the arraylist
        ArrayList<Integer> sortedA = new ArrayList<Integer>(A);
        Collections.sort(sortedA);
        ArrayList<Integer> sortedB = new ArrayList<Integer>(B);
        Collections.sort(sortedB);
        
        // now sort A1 & B1 in descending order
        ArrayList<Integer> descendingA = new ArrayList<Integer>(A1);
        Collections.sort(descendingA);
        ArrayList<Integer> descendingB = new ArrayList<Integer>(B1);
        Collections.sort(descendingB);
        
        // return True if A1 is subset of B1 in descending order else False
        return descendingA.equals(descendingB);
    }

    
    public static boolean isSubArray_Problem_1_ddd7fba9_b5b6_45aa_ac0a_56c289c28266(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .map(Integer::valueOf)
                .allMatch(e -> B.contains(e));
    }

    
    public static boolean isSubArray_Problem_1_c9437c2a_ec71_4ef7_8d7a_27bbe670e050(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() >= B.size()) {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) != B.get(i)) {
                    return False;
                }
            }
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_a6a54c32_f2dd_4f8b_8243_ae3e234a89e4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        A.stream().filter(x -> !B.contains(x)).forEach(x -> C.add(new Integer(x)));
        return C.stream().allMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_42818843_1d8a_4a3f_849c_3bb7529cbcfd(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        if (A.size() < B.size()) {
            return False;
        }
        // Copy array list B to array list C.
        for (int i = 0; i < B.size(); i++) {
            C.add(B.get(i));
        }
        // Copy array list A to array list D.
        for (int i = 0; i < A.size(); i++) {
            D.add(A.get(i));
        }
        // Perform the check using two nested loops.
        boolean result = False;
        for (int i = 0; i < C.size(); i++) {
            boolean found = False;
            for (int j = 0; j < D.size(); j++) {
                if (D.get(j).equals(C.get(i))) {
                    found = True;
                    break;
                }
            }
            if (found) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_2_0cc95c42_8006_4ea9_9451_46490431e056(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]==b[i]) {
                flag = True;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_c4c99957_a574_4eae_a2e9_0d6afa38abb1(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> Asub = new ArrayList<Integer>();
        for (Integer Ai : A) {
            Asub.add(Ai);
        }
        Collections.sort(Asub);
        List<Integer> Bsub = new ArrayList<Integer>();
        for (Integer Bi : B) {
            Bsub.add(Bi);
        }
        Collections.sort(Bsub);
        return (Asub.size() == Bsub.size());
    }

    
    public static boolean isSubArray_Problem_0_742ecb9e_af13_4529_97c3_b68e085ad928(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }

        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                return False;
            }
        }

        return True;
    }

    
    public static boolean isSubArray_Problem_2_634b7018_bed2_4da8_9ebc_18f480031eb9(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_48099bfc_38c1_4a61_aad9_d6515bcecd5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.size() == B.size() && A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_9e77df34_50a7_4f23_b3e3_a9416cc7dc78(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty()) return B.isEmpty();
        if (B.isEmpty()) return True;
        int n = A.size();
        int m = B.size();
        int k = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < m; j++) {
            if (B.get(j) > A.get(i))
                sum -= B.get(j);
            else
                sum += B.get(j);
            if (k == n)
                return sum == 0;
            if (sum < 0) {
                sum = 0;
                k = k + 1;
            }
            else if (sum > 0) {
                k = 0;
                i++;
                sum = 0;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_f5b1c3c0_aaff_496f_beb2_f3af81688778(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_d28b0446_fd6b_488f_ab44_66d191b0a72e(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean isSub = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_6208603a_9312_46a6_8022_8e3b2fddb01f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size()-1, A.size()).containsAll(B.subList(0, B.size()));
    }

    
    public static boolean isSubArray_Problem_2_e1851326_a976_4977_91cf_c64662f6330a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_c448691c_4348_4365_8e1d_b42fbdd3c752(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_1b8a8487_aedc_4b14_827b_fbe651b7a52b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_b490f6ef_f7ee_4ff7_8cae_37cffdea0947(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_2_f57b9932_9379_41f9_8109_fd297b1da044(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(i -> B.contains(i)).allMatch( i -> A.contains(i));
    }

    
    public static boolean isSubArray_Problem_0_1e233774_14c1_4166_8262_e90132f7be19(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> Anew = new ArrayList<>();
        ArrayList<Integer> Bnew = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            Anew.add(A.get(i));
        }
        for(int i=0;i<B.size();i++){
            Bnew.add(B.get(i));
        }
        return Anew.containsAll(Bnew);
    }

    
    public static boolean isSubArray_Problem_2_f3c7eb42_7a68_408b_8f65_0d085ded78b7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c6476c2f_bdd9_414e_acff_d77cbfb8c6c5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>(A);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(B);
        Collections.sort(temp);
        Collections.sort(temp2);
        return A==B;
    }

    
    public static boolean isSubArray_Problem_1_5b636d7b_1fa0_4f37_b8aa_049388859379(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>(B);
        int t = 0;
        for (int i = 0; i< A.size(); i++){
            t += A.get(i);
        }
        if (t != 0){
            C.sort(Comparator.reverseOrder());
            if (C.equals(B))
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_34311485_663e_406a_8d03_40d4f1b0d653(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_97b7724a_5d85_4cc8_9726_d1e49df6568b(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_97b7724a_5d85_4cc8_9726_d1e49df6568b = False;
        if (A.size() <= B.size()) {
            int i = 0;
            int j = 0;
            while (i < A.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
                if (i == A.size()) {
                    isSubArray_Problem_0_97b7724a_5d85_4cc8_9726_d1e49df6568b = True;
                }
            }
        }
        return isSubArray_Problem_0_97b7724a_5d85_4cc8_9726_d1e49df6568b;
    }

    
    public static boolean isSubArray_Problem_1_3ab105bd_f8fd_4ed5_8fdc_b24f4ba76cf4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A);
        ArrayList<Integer> B1 = new ArrayList<>(B);
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_f482b7d6_8da8_4e98_81be_d8fb4d6c9948(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(A1 -> B.stream().anyMatch(B1 -> A1.equals(B1)));
    }

    
    public static boolean isSubArray_Problem_0_67ddb410_83d2_45b9_9793_d20e2ca178d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if((A.get (j) == B.get(i)) && ((i + 1) == B.size())) {
                flag = True;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_d92384f6_e708_47e3_89dd_759abb268849(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_3e7d1a16_acaf_451b_9f2d_1ca62febbf4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .distinct()
                .map(a -> new AbstractMap.SimpleEntry<>(a, A.get(A.indexOf(a)))) // Map to keep only distinct elements and the element it beints to
                .allMatch(e -> B.contains(new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue())));
    }

    
    public static boolean isSubArray_Problem_0_a391ef02_88a7_4eb0_bc69_6d4ec76078d9(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> setA = new HashSet<Integer>(A);
        Set<Integer> setB = new HashSet<Integer>(B);
        return setA.containsAll(setB);
    }

    
    public static boolean isSubArray_Problem_2_5ed3ec52_a6c7_44e3_9b57_4ca997cf1f82(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean flag = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    flag = False;
                    break;
                }
            }
            if (flag) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_88e92c3b_f005_4ad0_a022_77f9a2fbe8ec(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        return a.containsAll(b);
    }

    
    public static boolean isSubArray_Problem_1_4e75c98f_7799_4ce1_9724_624c83cfc409(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code in java8
        List<Integer> intsA = A.stream().distinct().collect(Collectors.toList());
        List<Integer> intsB = B.stream().distinct().collect(Collectors.toList());
        List<Integer> intersection = new ArrayList<>();

        intersection.retainAll(intsA);
        if (intersection.size() != A.size())
            return False;

        intersection.retainAll(intsB);
        if (intersection.size() != B.size())
            return False;

        return True;
    }

    
    public static boolean isSubArray_Problem_1_55e5d5fe_5100_4faf_b1b2_129cd872e11c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write code here
        return False;
    }

    
    public static boolean isSubArray_Problem_2_5cb8796a_4611_4ed4_843a_b940fba0152c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        return False;
    }

    
    public static boolean isSubArray_Problem_0_64180fd8_8353_4dac_89e1_f703215b5c90(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) return False;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_38f4b724_6ca4_4339_89f0_210d39b1920f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .anyMatch(s -> B.stream().anyMatch(s1 -> s.equals(s1)));
    }

    
    public static boolean isSubArray_Problem_2_637e0f1b_e268_49a7_a196_0c4baffeefd1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            for(int j=0;j<B1.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                }
            }
        }
        return C.equals(A1);
    }

    
    public static boolean isSubArray_Problem_0_b1ebb9af_03f2_4916_a68b_afae59999b1a(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.stream().anyMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_47d6ae05_e5ab_465c_a33a_95c6574f441b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_f482b7d6_8da8_4e98_81be_d8fb4d6c9948(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(A1 -> B.stream().anyMatch(B1 -> A1.equals(B1)));
    }

    
    public static boolean isSubArray_Problem_1_63f87623_34b4_4672_86a8_5a239732e42b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_779dd7f3_97fa_4bce_b970_b72c11b080af(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_3167bc6e_6d56_444b_8eea_c4b7b153e699(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_2ce7e887_eca3_4cd7_b1f7_aa5eb5c4c475(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i) == B.get(j)) {
                    m++;
                }
            }
        }
        return m == A.size();
    }

    
    public static boolean isSubArray_Problem_0_17998cce_7a3e_4405_869c_a9543a4b9ed8(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_d1fd36e5_92de_4368_896f_a9a6158b0351(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty() || B.isEmpty())
            return False;
        int sizeA = A.size();
        int sizeB = B.size();
        if(sizeA != sizeB)
            return False;
        for(int i=0; i < sizeA; i++) {
            if(!A.equals(B))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_12b2904a_5252_4907_9cb5_92956aacf9d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        ArrayList<Integer> C = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            if(A.get(i) > B.get(i))
                C.add(A.get(i));
        }
        if(C.size() == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_1_dfa3092f_e12f_4ad7_9ac8_74b122a3bf14(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_6885c8af_afba_445a_baa9_1e145b3168bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_dbd627df_48bf_46f0_8156_758079b26c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_411eec7b_e337_4ed2_837b_5e7a04e0a711(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_0eac9ac3_92fd_4a81_9033_d1d06203231d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;

        int i = 0, j = 0, k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else if (A.get(i) > B.get(j)) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_dbd627df_48bf_46f0_8156_758079b26c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c476f97f_ae0a_4749_a750_07230b32f516(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_eab9b039_c7dc_4369_8041_8cd9d046de19(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_cf8caf77_b20b_4128_a918_56eff7129c8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return B.stream()
                .anyMatch(x -> A.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_dede25ee_3876_415b_9be2_ec70920640e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b40db3d4_ad6d_4cd4_a3fe_01aecf86c7b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty())
            return False;
        int n = A.size();
        int[] min = new int[n];
        int minIdx = n;
        int maxIdx = n;
        for(int i=0; i < n; i++) {
            if(A.contains(B.get(i)))
                min[i] = Math.min(i,minIdx);
            else
                min[i] = maxIdx;
            minIdx = min[i];
            for(int j=i+1; j < n; j++) {
                if(A.contains(B.get(j)))
                    maxIdx = Math.max(maxIdx,j);
            }
        }
        return minIdx == maxIdx; //True if subarray
    }

    
    public static boolean isSubArray_Problem_1_e6be59ea_5cc6_4be9_ac38_d309cf9cfdb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_3cf4b213_06be_4349_a986_48421f586418(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null) {
            return False;
        }
        int size = A.size();
        int subSize = B.size();
        int subListSize = subSize + 1;
        ArrayList<Integer> subList = new ArrayList<Integer>(subListSize);
        ArrayList<Integer> subArray = new ArrayList<Integer>(subListSize);
        for (int i = 0; i < size; i++) {
            subList.add(A.get(i));
            subArray.add(B.get(i));
        }
        subList.set(0, A.get(0));
        int j = 0;
        for (int i = subSize - 1; i >= 0; i--) {
            if (subList.get(i) != subArray.get(j)) {
                return False;
            }
            j++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_e1851326_a976_4977_91cf_c64662f6330a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_44480370_7820_4533_8c31_dd664918d8ae(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) < B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_47d6ae05_e5ab_465c_a33a_95c6574f441b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_3ac5c84e_45d0_4cc1_87ad_7661ed0d61a7(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_2_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = True;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    isSubArray_Problem_2_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_2_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff;
    }

    
    public static boolean isSubArray_Problem_2_9c5290fe_a78d_4a11_b823_ec3aa0d85e8e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = A;
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.get(i).compareTo(B.get(j)) < 0) {
                    temp.remove(i);
                    i--;
                }
            }
        }
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_9f0c4c1a_a4ac_4dd2_a3e1_6a0f51b2b27b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_5ed10caa_97a3_4669_b9f0_330bcbad9578(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_77470699_e1d6_4079_960c_c62c7775ae03(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int size = A.size();
        if(size == 0)
            return True;
        else if(size == B.size())
            return False;
        int i = 0;
        for(Integer i1 : A) {
            if(i1 != B.get(i))
                return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_bc595fc1_1447_46c8_b608_690e4bb6962e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : A) {
            if (!temp.contains(i)) {
                temp.add(i);
                for (int j : B) {
                    if (j == i) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_bdf3b1a1_4462_4ff9_bc00_29a29ea9c5d1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() <= B.size()) {
            return False;
        }
        // write your code here
        Iterator<Integer> it = A.iterator();
        int count = 0;
        boolean subArray = True;
        while(it.hasNext()) {
            count++;
            if (count == B.size()) {
                subArray = True;
                break;
            }
            boolean match = False;
            for(int i = 0; i < B.size(); i++) {
                if (it.next().equals(B.get(i))) {
                    match = True;
                    break;
                }
            }
            if (!match) {
                subArray = False;
                break;
            }
        }
        return subArray;
    }

    
    public static boolean isSubArray_Problem_2_742ecb9e_af13_4529_97c3_b68e085ad928(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }

        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                return False;
            }
        }

        return True;
    }

    
    public static boolean isSubArray_Problem_0_ea13a700_428a_4291_8706_37677367490e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        for (Integer value : A) {
            A1.add(value);
        }
        for (Integer value : B) {
            if (!A1.contains(value)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_a022cdaa_4612_4deb_b936_2a076c3f7443(ArrayList<Integer> A, ArrayList<Integer> B) {
        int flag = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.contains(B.get(i))) {
                flag++;
            }
        }
        if(flag == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_2_52e1a915_4d14_4b34_9244_52661f0fd5e1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty()) return True;
        if(B.isEmpty()) return False;
        if(A.size()!=B.size()) return False;
        int diff=A.size()-B.size();
        for(int i=0;i<A.size();i++)
        {
            if(A.contains(B.get(i)) && !B.contains(A.get(i)))
            {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_d66c1f65_4777_44d6_973f_3602d287cf0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_6c406197_ee16_44cd_9cb7_d785660c7d68(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        if(A.size() >= B.size()) {
            for(int i = 0; i <A.size(); i++) {
                if((A.get(i) == B.get(i))) flag = True;
            }
        } else {
            return False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_ac360527_38c2_4d55_80e7_1c7b58815691(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_b8c32503_78e9_47a3_a757_753d7c87ff0d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_1388bf2a_63fe_40e4_bdad_d09884a50ce5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_1f8d9bf7_9962_41c2_9e65_263b1809050e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_9bc6cdf7_5d6f_4aba_ba8b_07f50775cd16(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_copy = new ArrayList<>();
        for (int i : A) {
            A_copy.add(i);
        }
        ArrayList<Integer> B_copy = new ArrayList<>();
        for (int j : B) {
            B_copy.add(j);
        }
        return A_copy.containsAll(B_copy);
    }

    
    public static boolean isSubArray_Problem_0_e76267e9_4fe4_4de4_ad68_b5519fd96a59(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(Integer i : A) {
            for(Integer j : B) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        return temp.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_ca07abc6_12f6_4447_9c84_3be5a2435011(ArrayList<Integer> A, ArrayList<Integer> B) {
        // your code goes here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> subArr = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            if (!set.contains(B.get(i))) {
                subArr.add(B.get(i));
            }
        }
        return subArr.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_bc58a210_068e_40b5_8bd6_cf0e20a0ddd9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int temp=0;
        for (int i=0;i<A.size();i++)
        {
            temp=A.get(i);
            for (int j=0;j<B.size();j++)
            {
                temp=temp*B.get(j);
            }
            if (B.contains(temp))
            {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b52fc875_b24c_48b2_bdad_b4bced139e46(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_0eac9ac3_92fd_4a81_9033_d1d06203231d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;

        int i = 0, j = 0, k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else if (A.get(i) > B.get(j)) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_b2b0fb83_edc8_4756_bfba_748f34bb0129(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).equals(B);
    }

    
    public static boolean isSubArray_Problem_1_4c062bbe_3c54_4848_a7ed_2586a61cb2e7(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        int size = A.size();
        int arrSize1 = A.get(0).intValue();
        int arrSize2 = A.get(size-1).intValue();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (A.get(i).intValue() == arrSize2) {
                count++;
            }
            if (A.get(i).intValue() == arrSize1) {
                count--;
            }
        }
        if (count == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_19fac060_294a_413b_8b08_14aa5d6d0d1f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add((A.get(i))+B.get(i));
        }
        boolean result = False;
        if(A.size() == B.size()) {
            for(int i = 0; i < A.size(); i++) {
                for(int j = 0; j < B.size(); j++) {
                    if(A.get(i) == B.get(j)) {
                        result = True;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_0_4c062bbe_3c54_4848_a7ed_2586a61cb2e7(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        int size = A.size();
        int arrSize1 = A.get(0).intValue();
        int arrSize2 = A.get(size-1).intValue();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (A.get(i).intValue() == arrSize2) {
                count++;
            }
            if (A.get(i).intValue() == arrSize1) {
                count--;
            }
        }
        if (count == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_a8489644_bf94_468c_a868_135176f26302(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        int j = 0;
        boolean flag = True;
        while (a.size() > 0 && j < b.size()) {
            if (b.get(j) == a.get(j)) {
                j++;
            } else {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_a34cfdd5_9cc3_4627_b0ce_066a66e0228a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_577ae08e_2e2c_488a_9e81_20b9e44356ee(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() != B.size()) return False;
        int i = 0;
        int j = 0;
        for (i = A.size() - 1; i >= 0; i--)
            if (A.get(i) == B.get(j++)) return True;
        return False;
    }

    
    public static boolean isSubArray_Problem_2_0f763711_13e7_43d9_ad90_bb2394b1edb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_3c523f48_6224_4b72_9ef3_536cda4da001(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        boolean flag = True;
        for(int i=0; i<A1.size(); i++) {
            for(int j=0; j<B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                    A1.remove(i);
                    B1.remove(j);
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_624b6d59_def5_4225_b32d_85bb29ec971a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            C.add(A.get(i));
        }
        for(int i=0;i<m;i++) {
            C.add(B.get(i));
        }
        return A.subList(0,n).containsAll(C);
    }

    
    public static boolean isSubArray_Problem_2_700d96cb_00bd_4795_bc94_7520d83299c4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_3c6dc415_6fa1_4c70_b407_f2460daeb10d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() != B.size()) {
            return False;
        } else {
            int m = B.size();
            if (m == 0)
                return True;
            if (A.size() == 0)
                return False;
            ArrayList<Integer> c1 = new ArrayList<>();
            ArrayList<Integer> c2 = new ArrayList<>();
            int curVal = A.get(0);
            int nextVal = A.get(0);
            int prevVal = A.get(0);
            for (int i = 0; i < n; i++) {
                nextVal = A.get(i + 1);
                prevVal = A.get(i - 1);
                while (nextVal != curVal) {
                    if (prevVal <= curVal) {
                        c1.add(prevVal);
                        c2.add(curVal);
                    }
                    prevVal = curVal;
                    curVal = nextVal;
                    nextVal = A.get(i + 1);
                }
                curVal = nextVal;
            }
            for (int i = 0; i < m; i++) {
                nextVal = B.get(i + 1);
                prevVal = B.get(i - 1);
                while (nextVal != prevVal) {
                    if (curVal <= prevVal) {
                        c1.add(curVal);
                        c2.add(prevVal);
                    }
                    curVal = prevVal;
                    prevVal = nextVal;
                    nextVal = B.get(i + 1);
                }
                curVal = prevVal;
            }
            if (c1.equals(c2))
                return True;
            else
                return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_b3139b7b_e068_4f4c_a3b1_d925f10d6401(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_e9d8db3e_c7bc_4979_a36b_35c65c69ba4a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_f3c7eb42_7a68_408b_8f65_0d085ded78b7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_17f33352_54ca_4dd0_a6c8_8f766ae1133a(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = False;
        int sizeA = A.size();
        int sizeB = B.size();
        int minSize = Math.min(sizeA, sizeB);
        int sum = 0;
        for (int i = 0; i < minSize; i++) {
            sum+=A.get(i);
        }
        for (int j = 0; j < minSize; j++) {
            sum+=B.get(j);
        }
        for (int i = 0; i < minSize; i++) {
            for (int j = 0; j < minSize; j++) {
                if(sum == A.get(i) + B.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_59ad32ee_e773_4452_9cfd_da4d925cc254(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (n < m) return False;
        for (int i = 0; i <= n - m; i++) {
            boolean found = True;
            for (int j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_87f9c4d1_836e_4b7e_9c40_575259c2a064(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            A2.add(A1.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            B2.add(B1.get(i));
        }
        for(int i=0;i<A2.size();i++) {
            if(!A2.contains(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ee9f4d92_9bf5_4bf9_b96c_27e91c7d6654(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_0ec57a9b_26ab_4821_a32b_11c4e00dfb13(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int n = A.size();
        int m = B.size();
        if (n < m)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_befc2ace_caba_4acb_becd_509c41c162ce(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = A.size();
        int n = B.size();
        if (m == 0 || n == 0)
            return False;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else
                return True;
        }
        return i == m && j == n;
    }

    
    public static boolean isSubArray_Problem_0_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_0_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
                break;
            }
        }
        return isSubArray_Problem_0_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15;
    }

    
    public static boolean isSubArray_Problem_0_d92384f6_e708_47e3_89dd_759abb268849(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_13dd9afa_81a6_4251_a38d_fa69c132d444(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_8dc1b77f_bc86_40df_a233_e7bd7e964be6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.contains(B.get(i)) && B.contains(A.get(j)))
                    sub.add(A.get(i));
            }
        }
        return sub.isEmpty();
    }

    
    public static boolean isSubArray_Problem_0_fb35b8e9_f348_4374_a6b1_f0d4ff3e10f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        int flag = 0;
        for (int i = 0; i < A.size(); i++) {
            if (B.get(i) > A.get(i)) flag = 1;
            if (flag == 1) {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }

    
    public static boolean isSubArray_Problem_1_24ea4e4c_3ca9_465e_9594_6192d7e0c3c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_197fad79_c03c_47fb_b2f5_15f841ad1c9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_65b05002_8a56_40a3_a52b_2aee6efb16c1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int index = 0;
        for (Integer val : A) {
            if (B.contains(val)) {
                result.add(val);
                index++;
            } else {
                if (index != 0) {
                    result.add(A.get(index));
                    index++;
                }
            }
        }
        return result.size() == B.size();
    }

    
    public static boolean isSubArray_Problem_0_2f36f281_77ba_47bc_99ad_074ab20e2ed5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        boolean equal = True;
        for(int i=0; i<A.size() && equal; i++ ) {
            for(int j=0; j<B.size() && equal; j++ ) {
                if(A.get(i) == B.get(j)) {
                    equal = False;
                }
            }
        }
        return equal;
    }

    
    public static boolean isSubArray_Problem_2_cb763dc1_5240_483a_834e_444fea7f0ec9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_83a2092f_2f93_420d_8148_e124755c890b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_cd368e91_9514_4c74_9c01_fca031fc61a9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_d37377be_d7ae_4c7c_9548_4664345291aa(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_2_353e777f_629a_4634_b719_86cd1ed176a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A==null)return B==null;
        if(B==null)return False;
        if(A.size()==0)return B.size()==0;
        if(B.size()==0)return False;
        if(A.size()!=B.size())return False;
        Iterator<Integer> Aitr=A.iterator();
        Iterator<Integer> Bitr=B.iterator();
        while(Aitr.hasNext()){
            Integer Aval = Aitr.next();
            Integer Bval = Bitr.next();
            if(!Aval.equals(Bval))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_bbee3f90_58a7_4003_a051_1308ea5ac513(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_7badae59_e78f_4884_a761_d252e47c6e5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_71e12411_173d_494d_8a78_ab4ee013d99d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!C.contains(i)) {
                C.add(i);
            }
        }
        for(Integer i : B) {
            if(!C.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_edaffb95_ac2e_4239_a45c_743f936a8e08(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_05d433a9_4161_4e39_95f7_aac23496430d(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B.subList(0, B.size() - 1));
    }

    
    public static boolean isSubArray_Problem_0_096f7f39_6505_4589_a1b1_63ee7b13d570(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c9ccaf7b_29d6_4723_b9c1_087fd7d00bfc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean flag = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_4ba0ba9d_68a8_4deb_9f9a_7ef99e6b48d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return (j == m);
    }

    
    public static boolean isSubArray_Problem_0_b1a2d8f8_ae25_4661_a131_2a192e83ba7c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer i : A) {
            sum += i;
        }
        int sum2 = 0;
        for (Integer i : B) {
            sum2 += i;
        }
        if (sum == sum2) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_2da7307a_f62a_43fd_839c_7229421fa5e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_0_48099bfc_38c1_4a61_aad9_d6515bcecd5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.size() == B.size() && A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_2_97b7724a_5d85_4cc8_9726_d1e49df6568b(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_97b7724a_5d85_4cc8_9726_d1e49df6568b = False;
        if (A.size() <= B.size()) {
            int i = 0;
            int j = 0;
            while (i < A.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
                if (i == A.size()) {
                    isSubArray_Problem_2_97b7724a_5d85_4cc8_9726_d1e49df6568b = True;
                }
            }
        }
        return isSubArray_Problem_2_97b7724a_5d85_4cc8_9726_d1e49df6568b;
    }

    
    public static boolean isSubArray_Problem_2_44480370_7820_4533_8c31_dd664918d8ae(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) < B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_2_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
                break;
            }
        }
        return isSubArray_Problem_2_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15;
    }

    
    public static boolean isSubArray_Problem_1_aed045ed_ca4e_497d_b0af_88de03a40158(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_ad604b88_c977_4269_97e3_3154d6c053a6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<B.size();i++)
            c.add(B.get(i));
        for(int i=0;i<A.size();i++)
            if(!c.contains(A.get(i)))
                return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_0_a858207d_b4d6_4096_8c25_7c51c4ac14c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) < B.get(j)) {
                i++;
                k++;
            } else {
                j++;
                l++;
            }
        }
        return (i == A.size() && j == B.size() && k == l);
    }

    
    public static boolean isSubArray_Problem_1_990acc95_5053_4ba3_863d_8987292d41b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_a15c8b9a_54c7_4534_86aa_3219dc44e75f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_0_6e09c54d_5c71_4e22_abdd_508d211c99a4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_04576e2a_1bc0_4426_9119_398bcb172fa1(ArrayList<Integer> A, ArrayList<Integer> B) {
        int start = A.get(0), end = A.get(A.size() - 1);
        int startB = B.get(0), endB = B.get(B.size() - 1);
        // System.out.println("Start: " + start + " End: " + end + " StartB: " + startB + " EndB: " + endB);
        boolean check = True;
        int i = 0;
        while (i != A.size() && (start <= end)) {
            if (check) {
                if (start <= startB && startB <= end) {
                    return True;
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
        }
        i = 0;
        while (i != B.size() && (startB <= endB)) {
            if (check) {
                if (startB <= start && start <= endB) {
                    return True;
                }
            }
            i++;
            startB = B.get(i-1);
            endB = B.get(i);
        }
        i = 0;
        while (i != A.size() || i != B.size()) {
            if (start != A.size() && end != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                    if (start <= end && end <= endB) {
                        return True;
                    }
                }
            } else if (start != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
            startB = B.get(i-1);
            endB = B.get(i);
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_683c9f4f_95b4_4d54_bf01_c173b5d1c343(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
        int aSize = A.size();
        int bSize = B.size();
        if (aSize == bSize) {
            isSubArray_Problem_0_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = True;
            for (int i = 0; i < aSize; i++) {
                if (A.get(i) != B.get(i)) {
                    isSubArray_Problem_0_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_0_683c9f4f_95b4_4d54_bf01_c173b5d1c343;
    }

    
    public static boolean isSubArray_Problem_2_f11c61bb_82fd_496b_b8fe_4a82d487abbe(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != A2.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.get(i).equals(A2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_3586f536_e855_449e_85e6_b078abff2c87(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_35411b54_06bd_46a7_9332_34343bc8edd3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_fc638cb2_f31b_4a13_8afe_bef19dff66a8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList newA = new ArrayList(A.size());
        for(Integer i: A) {
            newA.add(new Integer(i));
        }
        ArrayList newB = new ArrayList(B.size());
        for(Integer i: B) {
            newB.add(new Integer(i));
        }

        ArrayList tempA = new ArrayList(newA.size());
        ArrayList tempB = new ArrayList(newB.size());

        boolean flag = False;
        for(int i=0; i<newA.size(); i++) {
            tempA.add(i+1);
        }

        for(int i=0; i<newB.size(); i++) {
            tempB.add(i+1);
        }
        tempA.addAll(newA);
        tempB.addAll(newB);
        for(int i=0; i<newA.size() && i<newB.size(); i++) {
            if(tempB.contains(tempA.get(i))) flag = True;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_2c9e43ef_a008_40c0_ad0b_994d626caaa6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_21a03ba4_98ad_4e0b_b889_f7e3792e8992(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_4760df71_00d6_40ab_9a29_1cb525b1ad48(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_38f4b724_6ca4_4339_89f0_210d39b1920f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .anyMatch(s -> B.stream().anyMatch(s1 -> s.equals(s1)));
    }

    
    public static boolean isSubArray_Problem_0_1ea45fd1_fd7e_4d0e_bd3a_0b4dc4096e12(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B) || B.equals(A);
    }

    
    public static boolean isSubArray_Problem_0_88e92c3b_f005_4ad0_a022_77f9a2fbe8ec(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        return a.containsAll(b);
    }

    
    public static boolean isSubArray_Problem_2_00632c35_a34c_4c70_9465_97674e36d3dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Check if A is an empty array list or not.
        if (A.isEmpty()) {
            return False;
        }

        // Check if the length of A is equal to the length of B
        if (A.size() != B.size()) {
            return False;
        }

        // Loop through the two lists and compare the two elements at respective indices if they are equal
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }

        // If we made it here then all the elements are equal and A is a subarray of B
        return True;
    }

    
    public static boolean isSubArray_Problem_0_17b40f2d_a2c5_46a1_b41d_101dc41cf3af(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> A2 = new ArrayList<>(A.subList(0, A.size()));
        ArrayList<Integer> B1 = new ArrayList<>(B.subList(0, B.size()));
        ArrayList<Integer> B2 = new ArrayList<>(B.subList(0, B.size()));
        if (A1.equals(B1)) {
            return True;
        }
        if (A2.equals(B2)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ccb93cde_f893_443a_ac03_0c621b9d8c96(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_8aa4c57b_b653_44f8_af41_1caf8037d8e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        // Iterate through array A
        for (Integer element : A) {
            count += 1;
            int index = 0;
            // Iterate through array B
            for (Integer elementB : B) {
                // If we found an element in B, then break the loop
                if (element == elementB) {
                    break;
                } else {
                    index += 1;
                }
            }
            // If the count of element in B is equal to count of element in A, then return True
            if (count == index) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ddd7fba9_b5b6_45aa_ac0a_56c289c28266(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .map(Integer::valueOf)
                .allMatch(e -> B.contains(e));
    }

    
    public static boolean isSubArray_Problem_0_63f87623_34b4_4672_86a8_5a239732e42b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_3ac5c84e_45d0_4cc1_87ad_7661ed0d61a7(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_17998cce_7a3e_4405_869c_a9543a4b9ed8(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_187d1217_22f1_49ae_895f_ac2106ea0382(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> array1 = new ArrayList<>(A);
        List<Integer> array2 = new ArrayList<>(B);
        return array1.stream().anyMatch(i -> array2.contains(i));
    }

    
    public static boolean isSubArray_Problem_1_ccbab410_8dc2_4247_aaa8_43c0af929b6f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_bbee3f90_58a7_4003_a051_1308ea5ac513(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_ec15ca08_9985_4c11_926b_b6de148aadc4(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_9bc6cdf7_5d6f_4aba_ba8b_07f50775cd16(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_copy = new ArrayList<>();
        for (int i : A) {
            A_copy.add(i);
        }
        ArrayList<Integer> B_copy = new ArrayList<>();
        for (int j : B) {
            B_copy.add(j);
        }
        return A_copy.containsAll(B_copy);
    }

    
    public static boolean isSubArray_Problem_0_2da7307a_f62a_43fd_839c_7229421fa5e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_0_0a6fa127_38c0_4515_b4a5_85b652cc2cff(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        return C.equals(B);
    }

    
    public static boolean isSubArray_Problem_2_8cc6bf3f_8477_4d03_a79a_37ef126f8ccd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3726b99d_f1cf_4a99_9529_b3ad7d010955(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (A.contains(B.get(i)) && (A.get(j).compareTo(B.get(i)) > 0)) {
                    return False;
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_b331e7df_a22a_4c05_9076_ba74cb060c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_a7c79533_62bb_40b2_b20e_d91a51187f49(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_d2633a58_2c3a_49c1_91e8_cdc91151e5ca(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_cce3ea5c_9093_4470_8a2a_f03d79b3c79b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minA = A.get(0);
        int maxA = A.get(0);
        for (int i : A) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        for (int i : B) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        if (minA > maxA) {
            return False;
        }
        for (int i : A) {
            if (A.contains(i)) {
                result.add(i);
            }
        }
        for (int i : B) {
            if (B.contains(i)) {
                result.add(i);
            }
        }
        if (result.size() < A.size() / 2) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_5682fe26_f164_46ea_91f4_ac713e274260(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_cc9c51b0_b6a4_4fa1_8056_9991b1f64904(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_21a03ba4_98ad_4e0b_b889_f7e3792e8992(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_0ec57a9b_26ab_4821_a32b_11c4e00dfb13(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int n = A.size();
        int m = B.size();
        if (n < m)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ccbab410_8dc2_4247_aaa8_43c0af929b6f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_9eebf9f0_c9fb_4893_9ebf_ef5c8affb35f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_f225f521_0807_43d4_9641_6b9537ea377a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = A.get(i);
        }
        Arrays.sort(array);
        int[] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = B.get(i);
        }
        Arrays.sort(arrayB);
        for (int i = 0; i < m && i < n; i++) {
            if (array[i] != arrayB[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_de4f352f_a376_46b4_b718_1f2b31ae7328(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minA = A.get(0).intValue();
        int maxA = A.get(0).intValue();
        for (Integer n : A) {
            if (n.intValue() < minA) minA = n.intValue();
            if (n.intValue() > maxA) maxA = n.intValue();
        }
        int minB = B.get(0).intValue();
        int maxB = B.get(0).intValue();
        for (Integer n : B) {
            if (n.intValue() < minB) minB = n.intValue();
            if (n.intValue() > maxB) maxB = n.intValue();
        }
        return maxA > minB && maxB > minA;
    }

    
    public static boolean isSubArray_Problem_1_b40db3d4_ad6d_4cd4_a3fe_01aecf86c7b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty())
            return False;
        int n = A.size();
        int[] min = new int[n];
        int minIdx = n;
        int maxIdx = n;
        for(int i=0; i < n; i++) {
            if(A.contains(B.get(i)))
                min[i] = Math.min(i,minIdx);
            else
                min[i] = maxIdx;
            minIdx = min[i];
            for(int j=i+1; j < n; j++) {
                if(A.contains(B.get(j)))
                    maxIdx = Math.max(maxIdx,j);
            }
        }
        return minIdx == maxIdx; //True if subarray
    }

    
    public static boolean isSubArray_Problem_1_891f0b4a_62ee_4232_93fc_9058f1d5f0a1(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean issubArray = True;
        for (int i = 0; i < A.size(); i++) {
            if (B.size() > i) {
                issubArray = issubArray && ((A.get(i) == B.get(i)));
            }
        }
        return issubArray;
    }

    
    public static boolean isSubArray_Problem_0_ba305467_1476_4d20_a756_27969ddcac0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if(size == 0) return False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i)) {
                return False;
            }
            result.add(A.get(i));
        }
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i) && result.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_0f763711_13e7_43d9_ad90_bb2394b1edb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_7fc22c76_813a_44c8_96b5_4771fe7cd4bb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_bdf3b1a1_4462_4ff9_bc00_29a29ea9c5d1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() <= B.size()) {
            return False;
        }
        // write your code here
        Iterator<Integer> it = A.iterator();
        int count = 0;
        boolean subArray = True;
        while(it.hasNext()) {
            count++;
            if (count == B.size()) {
                subArray = True;
                break;
            }
            boolean match = False;
            for(int i = 0; i < B.size(); i++) {
                if (it.next().equals(B.get(i))) {
                    match = True;
                    break;
                }
            }
            if (!match) {
                subArray = False;
                break;
            }
        }
        return subArray;
    }

    
    public static boolean isSubArray_Problem_2_53151210_ea00_478f_8188_bd2424430673(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
                C.add(B.get(i));
            }
        }
        if (A.size() == C.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_befc2ace_caba_4acb_becd_509c41c162ce(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = A.size();
        int n = B.size();
        if (m == 0 || n == 0)
            return False;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else
                return True;
        }
        return i == m && j == n;
    }

    
    public static boolean isSubArray_Problem_0_637e0f1b_e268_49a7_a196_0c4baffeefd1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            for(int j=0;j<B1.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                }
            }
        }
        return C.equals(A1);
    }

    
    public static boolean isSubArray_Problem_0_b40db3d4_ad6d_4cd4_a3fe_01aecf86c7b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty())
            return False;
        int n = A.size();
        int[] min = new int[n];
        int minIdx = n;
        int maxIdx = n;
        for(int i=0; i < n; i++) {
            if(A.contains(B.get(i)))
                min[i] = Math.min(i,minIdx);
            else
                min[i] = maxIdx;
            minIdx = min[i];
            for(int j=i+1; j < n; j++) {
                if(A.contains(B.get(j)))
                    maxIdx = Math.max(maxIdx,j);
            }
        }
        return minIdx == maxIdx; //True if subarray
    }

    
    public static boolean isSubArray_Problem_1_55719a00_9f58_498f_a9c9_6d98482c2086(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_3cf4b213_06be_4349_a986_48421f586418(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null) {
            return False;
        }
        int size = A.size();
        int subSize = B.size();
        int subListSize = subSize + 1;
        ArrayList<Integer> subList = new ArrayList<Integer>(subListSize);
        ArrayList<Integer> subArray = new ArrayList<Integer>(subListSize);
        for (int i = 0; i < size; i++) {
            subList.add(A.get(i));
            subArray.add(B.get(i));
        }
        subList.set(0, A.get(0));
        int j = 0;
        for (int i = subSize - 1; i >= 0; i--) {
            if (subList.get(i) != subArray.get(j)) {
                return False;
            }
            j++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_096f7f39_6505_4589_a1b1_63ee7b13d570(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_4bdf3caa_3ab8_4500_a447_cfbe70e026e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            if (A.equals(new ArrayList<Integer>(B.subList(i, i + A.size())))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_0cc95c42_8006_4ea9_9451_46490431e056(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]==b[i]) {
                flag = True;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_d2633a58_2c3a_49c1_91e8_cdc91151e5ca(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_9e77df34_50a7_4f23_b3e3_a9416cc7dc78(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty()) return B.isEmpty();
        if (B.isEmpty()) return True;
        int n = A.size();
        int m = B.size();
        int k = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < m; j++) {
            if (B.get(j) > A.get(i))
                sum -= B.get(j);
            else
                sum += B.get(j);
            if (k == n)
                return sum == 0;
            if (sum < 0) {
                sum = 0;
                k = k + 1;
            }
            else if (sum > 0) {
                k = 0;
                i++;
                sum = 0;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_c6ec68c0_f439_4ae6_9edd_3f493bfc0cc5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        int count = 0;
        int minA = A.get(0);
        int maxB = B.get(0);
        for(int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            count += 1;
            if(sum == minA) {
                minA = A.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        for(int i = 1; i < B.size(); i++) {
            sum += B.get(i);
            count += 1;
            if(sum == minA) {
                minA = B.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_d455083a_92ef_44f2_9675_ab3ee378ff46(ArrayList<Integer> A, ArrayList<Integer> B) {
        A.retainAll(B);
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_a75d8da8_5b26_4164_9324_efe7ee1d2233(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_c35810e8_fc36_4b6f_8e7b_9d6779ed8f06(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Return True or False.
        if (A.size() > B.size()) {
            return False;
        }
        if (A.size() < B.size()) {
            return True;
        }
        // Iterate A and B both arrays to compare each element.
        for (int i = 0; i < A.size(); i++) {
            if (!B.get(i).equals(A.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_3add8d4a_68f1_4dfb_9f0e_24ef6b785606(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_c448691c_4348_4365_8e1d_b42fbdd3c752(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_9289599b_87cb_4d0f_9f37_8403fc0d40d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0; i<A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i=0; i<B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_2_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
                break;
            }
        }
        return isSubArray_Problem_2_9289599b_87cb_4d0f_9f37_8403fc0d40d2;
    }

    
    public static boolean isSubArray_Problem_2_78f0eb2e_368f_4853_830b_87259cede7a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == A.size()) {
            flag = True;
        } else {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_e10f6695_6595_4a74_89af_dfb557f8ce69(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_bc3a4140_a096_422c_8c79_746404b90506(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.equals(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_1_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15 = False;
                break;
            }
        }
        return isSubArray_Problem_1_78c28a33_0e4e_4900_bfc7_a6fb91b7cd15;
    }

    
    public static boolean isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        if (A.size() > B.size()) {
            isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        } else {
            isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166 = True;
            int i = 0;
            int j = 0;
            while (i < A.size() && j < B.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_2_bb5aa91f_d29e_4899_9fde_02c20f136166;
    }

    
    public static boolean isSubArray_Problem_1_44480370_7820_4533_8c31_dd664918d8ae(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) < B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_79e80917_5fc8_4eda_bfca_70612ca29110(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSubArray_Problem_1_79e80917_5fc8_4eda_bfca_70612ca29110 = True;
                for (int j = 0; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSubArray_Problem_1_79e80917_5fc8_4eda_bfca_70612ca29110 = False;
                        break;
                    }
                }
                if (isSubArray_Problem_1_79e80917_5fc8_4eda_bfca_70612ca29110) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_961d4c66_c1ab_4348_ab82_64ff79bb3b78(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_d26a9f6b_2102_4494_bef2_155e244295e5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer element : A) {
            if(!B.contains(element)) {
                result.add(element);
            }
        }
        return result.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_1f11bc3f_9994_46e0_b461_ba5f0362ec9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code to check if array A is subarray of B or not.
        // If yes, then return True, otherwise return False.
        for(int i=0;i<A.size();i++) {
            if(A.get(i) < B.size() && A.get(i) > -1 && A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_1b751103_c4d8_4dd4_b7d0_d5e54deb6205(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        // check if both array have same length
        if (A.size() != B.size())
            return False;
        //loop over each element of first array
        for (int i = 0; i < A.size(); i++) {
            //loop over each element of second array
            for (int j = 0; j < B.size(); j++) {
                //if both have same index
                if (A.size() == B.size()) {
                    if (A.get(i) == B.get(j))
                        continue;
                    else {
                        return False;
                    }
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ba305467_1476_4d20_a756_27969ddcac0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if(size == 0) return False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i)) {
                return False;
            }
            result.add(A.get(i));
        }
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i) && result.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ac360527_38c2_4d55_80e7_1c7b58815691(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_cd368e91_9514_4c74_9c01_fca031fc61a9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_b8c32503_78e9_47a3_a757_753d7c87ff0d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_f0cdedbb_0e07_4b07_821e_18537d3c19dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size_A=A.size();
        int size_B=B.size();
        if(size_B <= size_A) {
            return False;
        }
        ArrayList<Integer> newList = new ArrayList<>(B.size());
        for (int i = size_A - 1; i >= 0; i--) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_1ea45fd1_fd7e_4d0e_bd3a_0b4dc4096e12(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B) || B.equals(A);
    }

    
    public static boolean isSubArray_Problem_2_875fa284_6b43_4981_bc40_28244b753577(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A == null || A.size() < B.size() || B == null || B.size() < A.size()) return False;
        int Apos = A.size() - 1;
        int Bpos = B.size() - 1;
        while(Apos >= 0 && Bpos >= 0) {
            if(A.get(Apos) == B.get(Bpos)) return True;
            Apos--;
            Bpos--;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_c6b684c8_7704_4221_9aad_13f58993f0df(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            for(int j=0;j<A1.size();j++) {
                if(B1.get(i)==A1.get(j)) {
                    C.add(B1.get(i));
                }
            }
        }
        if(C.size()==B1.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_da4bdd0d_b719_4115_85a1_08f4736f8a13(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_eab9b039_c7dc_4369_8041_8cd9d046de19(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_2ce7e887_eca3_4cd7_b1f7_aa5eb5c4c475(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i) == B.get(j)) {
                    m++;
                }
            }
        }
        return m == A.size();
    }

    
    public static boolean isSubArray_Problem_2_77470699_e1d6_4079_960c_c62c7775ae03(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int size = A.size();
        if(size == 0)
            return True;
        else if(size == B.size())
            return False;
        int i = 0;
        for(Integer i1 : A) {
            if(i1 != B.get(i))
                return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_22363d43_0570_4e81_8b2c_758b5cc775df(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_624b6d59_def5_4225_b32d_85bb29ec971a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            C.add(A.get(i));
        }
        for(int i=0;i<m;i++) {
            C.add(B.get(i));
        }
        return A.subList(0,n).containsAll(C);
    }

    
    public static boolean isSubArray_Problem_2_55719a00_9f58_498f_a9c9_6d98482c2086(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_0a6fa127_38c0_4515_b4a5_85b652cc2cff(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        return C.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_700d96cb_00bd_4795_bc94_7520d83299c4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_d28b0446_fd6b_488f_ab44_66d191b0a72e(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean isSub = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_3e7d1a16_acaf_451b_9f2d_1ca62febbf4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .distinct()
                .map(a -> new AbstractMap.SimpleEntry<>(a, A.get(A.indexOf(a)))) // Map to keep only distinct elements and the element it beints to
                .allMatch(e -> B.contains(new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue())));
    }

    
    public static boolean isSubArray_Problem_2_7b366cf3_8092_4cb7_a01d_36c30d232188(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().allMatch(element -> B.contains(element));
    }

    
    public static boolean isSubArray_Problem_0_b09729cb_289f_42a5_bf8e_7d8c99eacf2b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_280af11a_ea59_4d84_b59f_54acf281a2f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    count++;
                }
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_c3ecda57_e892_4699_9f12_8bf91d83b009(ArrayList<Integer> A, ArrayList<Integer> B) {
        int startOfSubArray = A.size() - B.size();
        for (int i = 0; i < startOfSubArray; i++) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_9eebf9f0_c9fb_4893_9ebf_ef5c8affb35f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_7a4fe354_4524_456d_9e3a_01d91753a8b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        // return True;
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!B.contains(i))
                C.add(i);
        }
        return C.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_3e1b29b8_eebc_4dca_b01d_5c9d2b76a26d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b3fb9541_f3eb_42c4_ac5c_6b258f76e265(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_6e09c54d_5c71_4e22_abdd_508d211c99a4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_3cf4b213_06be_4349_a986_48421f586418(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null) {
            return False;
        }
        int size = A.size();
        int subSize = B.size();
        int subListSize = subSize + 1;
        ArrayList<Integer> subList = new ArrayList<Integer>(subListSize);
        ArrayList<Integer> subArray = new ArrayList<Integer>(subListSize);
        for (int i = 0; i < size; i++) {
            subList.add(A.get(i));
            subArray.add(B.get(i));
        }
        subList.set(0, A.get(0));
        int j = 0;
        for (int i = subSize - 1; i >= 0; i--) {
            if (subList.get(i) != subArray.get(j)) {
                return False;
            }
            j++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_54908839_3780_49f8_92c3_c44d94176cbf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3c523f48_6224_4b72_9ef3_536cda4da001(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        boolean flag = True;
        for(int i=0; i<A1.size(); i++) {
            for(int j=0; j<B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    C.add(A1.get(i));
                    A1.remove(i);
                    B1.remove(j);
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_a23cc699_6a03_4e11_8d55_99dac03cd84e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_fa7fdbf0_4eca_4ccb_a541_71d541e05318(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if (size < B.size()) {
            return False;
        }
        ArrayList<Integer> copy = new ArrayList<>(A);
        Collections.sort(copy);
        ArrayList<Integer> list = new ArrayList<>(B);
        Collections.sort(list);
        boolean isSub = True;
        int smallestNumber = copy.get(0);
        for (int i = 0; i < size - 1; i++) {
            if (smallestNumber > list.get(i)) {
                isSub = False;
            }
            smallestNumber = list.get(i);
        }
        return isSub;
    }

    
    public static boolean isSubArray_Problem_2_cc633bc2_e9d3_473a_aafa_ec4087c4d888(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> left = new ArrayList<Integer>(A.subList(0, Math.min(A.size(), B.size())));
        ArrayList<Integer> right = new ArrayList<Integer>(B.subList(0, Math.min(A.size(), B.size())));

        if (left.size() == 0 || right.size() == 0) {
            return True;
        }

        int firstLeftElement = left.get(0); // take the first element of left and right and compare them
        int firstRightElement = right.get(0);

        // check whether all the elements from left are present in the right
        for (int i = 1; i < left.size(); i++) {
            if (left.get(i) != firstLeftElement) {
                return False;
            }
        }
        // check whether all the elements from right are present in the left
        for (int i = 1; i < right.size(); i++) {
            if (right.get(i) != firstRightElement) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_683c9f4f_95b4_4d54_bf01_c173b5d1c343(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
        int aSize = A.size();
        int bSize = B.size();
        if (aSize == bSize) {
            isSubArray_Problem_1_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = True;
            for (int i = 0; i < aSize; i++) {
                if (A.get(i) != B.get(i)) {
                    isSubArray_Problem_1_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_1_683c9f4f_95b4_4d54_bf01_c173b5d1c343;
    }

    
    public static boolean isSubArray_Problem_2_3bb3282e_7505_4605_8d9d_650c19c5e951(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_e2ee21a4_91b3_4ef0_814e_3ed03d939d0c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_875fa284_6b43_4981_bc40_28244b753577(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A == null || A.size() < B.size() || B == null || B.size() < A.size()) return False;
        int Apos = A.size() - 1;
        int Bpos = B.size() - 1;
        while(Apos >= 0 && Bpos >= 0) {
            if(A.get(Apos) == B.get(Bpos)) return True;
            Apos--;
            Bpos--;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_145f8785_ccff_416d_b348_aa69c72d459e(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = True;
        for (int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                result = False;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_0ec57a9b_26ab_4821_a32b_11c4e00dfb13(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int n = A.size();
        int m = B.size();
        if (n < m)
            return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (A.get(i + j) != B.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_7daae09b_e5ce_4037_b81f_dc3fb867c930(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_fc10244a_78bd_4c9c_8580_5aeb928d86c6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_763edeef_9681_4b77_a6c1_a0388f3b2c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int j = 0;
        int l = 0;
        int i = 0;
        while (j < A.size() && l < B.size()) {
            if (A.get(j) == B.get(l)) {
                resultList.add(A.get(j));
                i++;
                j++;
                l++;
            } else if (A.get(j) < B.get(l)) {
                j++;
            } else {
                l++;
            }
        }
        if (l < B.size()) {
            return False;
        }
        if (j != A.size()) {
            return False;
        }
        if (A.size() == resultList.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_fdbf5fe0_c033_441f_a3c7_85947421e87c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_74672463_eb4f_4524_bba4_c73cd6d1ce81(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (!A1.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_52a3b074_e8fd_465c_b5d7_16fdf2ccfd87(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;
        for (int i = 0; i < A.size(); i++) {
            if (!A.contains(B.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b528dd32_5565_406b_96f6_739bac2dddfa(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            for(int j=0; j<B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( A.get(i));
                }
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_f11c61bb_82fd_496b_b8fe_4a82d487abbe(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != A2.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.get(i).equals(A2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_69e300da_218b_4ce2_85d4_d3498fa2a2ab(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Return True if both arrays are same
        if (A.size() == B.size()) {
            // Sort the array list
            ArrayList<Integer> sortedA = new ArrayList<>(A);
            Collections.sort(sortedA);
            ArrayList<Integer> sortedB = new ArrayList<>(B);
            Collections.sort(sortedB);
            // compare the first element of both arrays
            return ((sortedA.get(0)).equals(sortedB.get(0)));
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_a4d62ae6_0baa_475b_8195_dbc3505aac2f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_67ddb410_83d2_45b9_9793_d20e2ca178d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if((A.get (j) == B.get(i)) && ((i + 1) == B.size())) {
                flag = True;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_b73a7345_9fc4_4106_a6a7_0044373590cb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_1b8a8487_aedc_4b14_827b_fbe651b7a52b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_54908839_3780_49f8_92c3_c44d94176cbf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_2efe9357_a0f3_489a_9ae9_c5239f6f9919(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> listA = new ArrayList<>();
        for (Integer element : A) {
            listA.add(element);
        }
        List<Integer> listB = new ArrayList<>();
        for (Integer element : B) {
            listB.add(element);
        }
        boolean sub = False;
        if (A.size() > B.size()) {
            for (int i = 0; i < A.size() - B.size(); i++) {
                listA.remove(0);
                listB.remove(0);
            }
            sub = True;
        }
        return sub;
    }

    
    public static boolean isSubArray_Problem_0_b1177358_4a08_4af8_8be9_cac000b16c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i = 0; i < A1.size(); i++) {
            A2.add(A1.get(i));
        }
        for(int i = 0; i < B1.size(); i++) {
            B2.add(B1.get(i));
        }
        if(A2.size() != B2.size()) {
            return False;
        }
        for(int i = 0; i < A2.size(); i++) {
            if(!A2.get(i).equals(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_c4ad1563_3b97_4c7b_aad3_3968ab143d7d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_891f0b4a_62ee_4232_93fc_9058f1d5f0a1(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean issubArray = True;
        for (int i = 0; i < A.size(); i++) {
            if (B.size() > i) {
                issubArray = issubArray && ((A.get(i) == B.get(i)));
            }
        }
        return issubArray;
    }

    
    public static boolean isSubArray_Problem_2_cc9c51b0_b6a4_4fa1_8056_9991b1f64904(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_763edeef_9681_4b77_a6c1_a0388f3b2c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int j = 0;
        int l = 0;
        int i = 0;
        while (j < A.size() && l < B.size()) {
            if (A.get(j) == B.get(l)) {
                resultList.add(A.get(j));
                i++;
                j++;
                l++;
            } else if (A.get(j) < B.get(l)) {
                j++;
            } else {
                l++;
            }
        }
        if (l < B.size()) {
            return False;
        }
        if (j != A.size()) {
            return False;
        }
        if (A.size() == resultList.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_2ce7e887_eca3_4cd7_b1f7_aa5eb5c4c475(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i) == B.get(j)) {
                    m++;
                }
            }
        }
        return m == A.size();
    }

    
    public static boolean isSubArray_Problem_2_a391ef02_88a7_4eb0_bc69_6d4ec76078d9(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> setA = new HashSet<Integer>(A);
        Set<Integer> setB = new HashSet<Integer>(B);
        return setA.containsAll(setB);
    }

    
    public static boolean isSubArray_Problem_1_dc3d5a46_8803_4d5d_8535_3a716ff54199(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_1_bbee3f90_58a7_4003_a051_1308ea5ac513(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_3e1b29b8_eebc_4dca_b01d_5c9d2b76a26d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_cd368e91_9514_4c74_9c01_fca031fc61a9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_2c9e43ef_a008_40c0_ad0b_994d626caaa6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_634b7018_bed2_4da8_9ebc_18f480031eb9(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_12b2904a_5252_4907_9cb5_92956aacf9d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        ArrayList<Integer> C = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            if(A.get(i) > B.get(i))
                C.add(A.get(i));
        }
        if(C.size() == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_0_5682fe26_f164_46ea_91f4_ac713e274260(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_cbf2db63_b2c8_4ff1_b362_af4d5fbf927b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_47d6ae05_e5ab_465c_a33a_95c6574f441b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_3bb3282e_7505_4605_8d9d_650c19c5e951(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_8a21e03a_40a3_4a7f_bb8a_56b1682338de(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_8dc1b77f_bc86_40df_a233_e7bd7e964be6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.contains(B.get(i)) && B.contains(A.get(j)))
                    sub.add(A.get(i));
            }
        }
        return sub.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_7daae09b_e5ce_4037_b81f_dc3fb867c930(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_03879239_a673_4678_9d7f_6b46d1377576(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_f3c7eb42_7a68_408b_8f65_0d085ded78b7(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_878d30a0_bb55_4b2e_86ba_79a4300ac674(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_73590c6e_6acc_421a_b737_2eb935aad919(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_4bdf3caa_3ab8_4500_a447_cfbe70e026e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            if (A.equals(new ArrayList<Integer>(B.subList(i, i + A.size())))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_cce3ea5c_9093_4470_8a2a_f03d79b3c79b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minA = A.get(0);
        int maxA = A.get(0);
        for (int i : A) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        for (int i : B) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        if (minA > maxA) {
            return False;
        }
        for (int i : A) {
            if (A.contains(i)) {
                result.add(i);
            }
        }
        for (int i : B) {
            if (B.contains(i)) {
                result.add(i);
            }
        }
        if (result.size() < A.size() / 2) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ca07abc6_12f6_4447_9c84_3be5a2435011(ArrayList<Integer> A, ArrayList<Integer> B) {
        // your code goes here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> subArr = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            if (!set.contains(B.get(i))) {
                subArr.add(B.get(i));
            }
        }
        return subArr.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_a75d8da8_5b26_4164_9324_efe7ee1d2233(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_ed86bda6_579b_47d5_8aa2_bb2937057817(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_73a41bd6_432b_488f_b8b8_96fd64ec9ecc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_0_3e1b29b8_eebc_4dca_b01d_5c9d2b76a26d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_5ed3ec52_a6c7_44e3_9b57_4ca997cf1f82(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean flag = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    flag = False;
                    break;
                }
            }
            if (flag) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ad604b88_c977_4269_97e3_3154d6c053a6(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<B.size();i++)
            c.add(B.get(i));
        for(int i=0;i<A.size();i++)
            if(!c.contains(A.get(i)))
                return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_1_a858207d_b4d6_4096_8c25_7c51c4ac14c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) < B.get(j)) {
                i++;
                k++;
            } else {
                j++;
                l++;
            }
        }
        return (i == A.size() && j == B.size() && k == l);
    }

    
    public static boolean isSubArray_Problem_2_1ea45fd1_fd7e_4d0e_bd3a_0b4dc4096e12(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B) || B.equals(A);
    }

    
    public static boolean isSubArray_Problem_1_3696a4e2_b747_456a_9dcf_f4e26997bf61(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - 1, A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_fa7fdbf0_4eca_4ccb_a541_71d541e05318(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if (size < B.size()) {
            return False;
        }
        ArrayList<Integer> copy = new ArrayList<>(A);
        Collections.sort(copy);
        ArrayList<Integer> list = new ArrayList<>(B);
        Collections.sort(list);
        boolean isSub = True;
        int smallestNumber = copy.get(0);
        for (int i = 0; i < size - 1; i++) {
            if (smallestNumber > list.get(i)) {
                isSub = False;
            }
            smallestNumber = list.get(i);
        }
        return isSub;
    }

    
    public static boolean isSubArray_Problem_1_fc5941d0_851c_4e7e_9cb7_a8849da9a266(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(!A1.contains(B.get(i))) {
                C.add(i);
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_8cc6bf3f_8477_4d03_a79a_37ef126f8ccd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b53f6d80_cfdb_464d_8d9e_25e468127dbd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_bc58a210_068e_40b5_8bd6_cf0e20a0ddd9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int temp=0;
        for (int i=0;i<A.size();i++)
        {
            temp=A.get(i);
            for (int j=0;j<B.size();j++)
            {
                temp=temp*B.get(j);
            }
            if (B.contains(temp))
            {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_c4c99957_a574_4eae_a2e9_0d6afa38abb1(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> Asub = new ArrayList<Integer>();
        for (Integer Ai : A) {
            Asub.add(Ai);
        }
        Collections.sort(Asub);
        List<Integer> Bsub = new ArrayList<Integer>();
        for (Integer Bi : B) {
            Bsub.add(Bi);
        }
        Collections.sort(Bsub);
        return (Asub.size() == Bsub.size());
    }

    
    public static boolean isSubArray_Problem_1_ae0ab445_fba9_461c_ba18_7c468016ee8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.containsAll(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b8e595e8_331c_4d0f_bd04_61bd424b5206(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_a15c8b9a_54c7_4534_86aa_3219dc44e75f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_0_b607d969_11df_4882_bf45_a339ff67cacb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty() || A.size() != B.size())
            return False;
        Set<Integer> setA = new HashSet<>(A);
        Set<Integer> setB = new HashSet<>(B);
        setA.retainAll(setB);
        setB.retainAll(setA);
        return setA.size() == 0 && setB.size() == 0;
    }

    
    public static boolean isSubArray_Problem_1_a0c9bec2_450c_427b_938c_b51efd93de1d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_01c20d3a_2635_4320_8911_be5b24fb6d8c(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size()+B.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(A.size()+B.size());
        
        // first add all elements of A at last
        A1.addAll(A);
        // then add all elements of B at last
        B1.addAll(B);
        
        // if both array lists are not equal then return False
        if(A1.size() != B1.size()) {
            return False;
        }
        // now sort the arraylist
        ArrayList<Integer> sortedA = new ArrayList<Integer>(A);
        Collections.sort(sortedA);
        ArrayList<Integer> sortedB = new ArrayList<Integer>(B);
        Collections.sort(sortedB);
        
        // now sort A1 & B1 in descending order
        ArrayList<Integer> descendingA = new ArrayList<Integer>(A1);
        Collections.sort(descendingA);
        ArrayList<Integer> descendingB = new ArrayList<Integer>(B1);
        Collections.sort(descendingB);
        
        // return True if A1 is subset of B1 in descending order else False
        return descendingA.equals(descendingB);
    }

    
    public static boolean isSubArray_Problem_0_17f33352_54ca_4dd0_a6c8_8f766ae1133a(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = False;
        int sizeA = A.size();
        int sizeB = B.size();
        int minSize = Math.min(sizeA, sizeB);
        int sum = 0;
        for (int i = 0; i < minSize; i++) {
            sum+=A.get(i);
        }
        for (int j = 0; j < minSize; j++) {
            sum+=B.get(j);
        }
        for (int i = 0; i < minSize; i++) {
            for (int j = 0; j < minSize; j++) {
                if(sum == A.get(i) + B.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_b09729cb_289f_42a5_bf8e_7d8c99eacf2b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_145f8785_ccff_416d_b348_aa69c72d459e(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = True;
        for (int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                result = False;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_0_2c1a2f83_577a_4218_a4db_ca5dc0b18a07(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (B.get(i + j) != A.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_4ba0ba9d_68a8_4deb_9f9a_7ef99e6b48d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return (j == m);
    }

    
    public static boolean isSubArray_Problem_2_3c6dc415_6fa1_4c70_b407_f2460daeb10d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() != B.size()) {
            return False;
        } else {
            int m = B.size();
            if (m == 0)
                return True;
            if (A.size() == 0)
                return False;
            ArrayList<Integer> c1 = new ArrayList<>();
            ArrayList<Integer> c2 = new ArrayList<>();
            int curVal = A.get(0);
            int nextVal = A.get(0);
            int prevVal = A.get(0);
            for (int i = 0; i < n; i++) {
                nextVal = A.get(i + 1);
                prevVal = A.get(i - 1);
                while (nextVal != curVal) {
                    if (prevVal <= curVal) {
                        c1.add(prevVal);
                        c2.add(curVal);
                    }
                    prevVal = curVal;
                    curVal = nextVal;
                    nextVal = A.get(i + 1);
                }
                curVal = nextVal;
            }
            for (int i = 0; i < m; i++) {
                nextVal = B.get(i + 1);
                prevVal = B.get(i - 1);
                while (nextVal != prevVal) {
                    if (curVal <= prevVal) {
                        c1.add(curVal);
                        c2.add(prevVal);
                    }
                    curVal = prevVal;
                    prevVal = nextVal;
                    nextVal = B.get(i + 1);
                }
                curVal = prevVal;
            }
            if (c1.equals(c2))
                return True;
            else
                return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_145f8785_ccff_416d_b348_aa69c72d459e(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = True;
        for (int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                result = False;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = True;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    isSubArray_Problem_1_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_1_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff;
    }

    
    public static boolean isSubArray_Problem_2_92585f02_37d6_42a9_ae19_32f8e776b837(ArrayList<Integer> A, ArrayList<Integer> B) {
        //Write a code here
        if(A.size() != B.size())
            return False;
        
        ArrayList<Integer> sub = new ArrayList<Integer>();
        int temp;
        for(int i = 0; i < A.size(); i++) {
            temp = A.get(i);
            for(int j = i; j < A.size(); j++) {
                if(temp == B.get(j)) {
                    sub.add(temp);
                    j++;
                }
            }
        }
        
        for(int i = 0; i < A.size(); i++) {
            if(sub.contains(A.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_97b7724a_5d85_4cc8_9726_d1e49df6568b(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_97b7724a_5d85_4cc8_9726_d1e49df6568b = False;
        if (A.size() <= B.size()) {
            int i = 0;
            int j = 0;
            while (i < A.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
                if (i == A.size()) {
                    isSubArray_Problem_1_97b7724a_5d85_4cc8_9726_d1e49df6568b = True;
                }
            }
        }
        return isSubArray_Problem_1_97b7724a_5d85_4cc8_9726_d1e49df6568b;
    }

    
    public static boolean isSubArray_Problem_2_d26a9f6b_2102_4494_bef2_155e244295e5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer element : A) {
            if(!B.contains(element)) {
                result.add(element);
            }
        }
        return result.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_1d5e534b_6cbd_47d1_993d_b6652cfebcf7(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Write your code here
        
        return B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_1_c4ad1563_3b97_4c7b_aad3_3968ab143d7d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_0f763711_13e7_43d9_ad90_bb2394b1edb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_875fa284_6b43_4981_bc40_28244b753577(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A == null || A.size() < B.size() || B == null || B.size() < A.size()) return False;
        int Apos = A.size() - 1;
        int Bpos = B.size() - 1;
        while(Apos >= 0 && Bpos >= 0) {
            if(A.get(Apos) == B.get(Bpos)) return True;
            Apos--;
            Bpos--;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_d37377be_d7ae_4c7c_9548_4664345291aa(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_1_4c5fdc71_8002_439e_a331_0127ce9b89e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_8a21e03a_40a3_4a7f_bb8a_56b1682338de(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_2f36f281_77ba_47bc_99ad_074ab20e2ed5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        boolean equal = True;
        for(int i=0; i<A.size() && equal; i++ ) {
            for(int j=0; j<B.size() && equal; j++ ) {
                if(A.get(i) == B.get(j)) {
                    equal = False;
                }
            }
        }
        return equal;
    }

    
    public static boolean isSubArray_Problem_0_614770b1_5052_409f_aaa7_28a1e80b0730(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_0_e10f6695_6595_4a74_89af_dfb557f8ce69(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_a6a54c32_f2dd_4f8b_8243_ae3e234a89e4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        A.stream().filter(x -> !B.contains(x)).forEach(x -> C.add(new Integer(x)));
        return C.stream().allMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_1_befc2ace_caba_4acb_becd_509c41c162ce(ArrayList<Integer> A, ArrayList<Integer> B) {
        int m = A.size();
        int n = B.size();
        if (m == 0 || n == 0)
            return False;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else
                return True;
        }
        return i == m && j == n;
    }

    
    public static boolean isSubArray_Problem_1_05d433a9_4161_4e39_95f7_aac23496430d(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B.subList(0, B.size() - 1));
    }

    
    public static boolean isSubArray_Problem_1_b3fb9541_f3eb_42c4_ac5c_6b258f76e265(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_79702e2a_caf2_4f59_a985_b7407eef175d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_d2633a58_2c3a_49c1_91e8_cdc91151e5ca(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_eab9b039_c7dc_4369_8041_8cd9d046de19(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_391e1b6a_125b_44b7_ada8_64dd94bda872(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        if(A.size() != B.size())
            return False;
        HashSet<Integer> setA = new HashSet<Integer>(A);
        HashSet<Integer> setB = new HashSet<Integer>(B);
        setA.removeAll(setB);
        for(Integer i : setA) {
            if(B.contains(i) == False) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_38f4b724_6ca4_4339_89f0_210d39b1920f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .anyMatch(s -> B.stream().anyMatch(s1 -> s.equals(s1)));
    }

    
    public static boolean isSubArray_Problem_0_c6b684c8_7704_4221_9aad_13f58993f0df(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            for(int j=0;j<A1.size();j++) {
                if(B1.get(i)==A1.get(j)) {
                    C.add(B1.get(i));
                }
            }
        }
        if(C.size()==B1.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b8e595e8_331c_4d0f_bd04_61bd424b5206(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_ce25d7bf_0523_4ca8_a97d_9132388e523d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_8715ea4f_7366_41d7_8426_b43679b6e2d7(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_1f161615_4981_4e3e_b7e0_4387859cb04e(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(e -> B.stream().anyMatch(i -> i == e)).collect(Collectors.toList()).isEmpty();
    }

    
    public static boolean isSubArray_Problem_0_cc9c51b0_b6a4_4fa1_8056_9991b1f64904(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ec15ca08_9985_4c11_926b_b6de148aadc4(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(B.size() - 1, B.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_0_3e7d1a16_acaf_451b_9f2d_1ca62febbf4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .distinct()
                .map(a -> new AbstractMap.SimpleEntry<>(a, A.get(A.indexOf(a)))) // Map to keep only distinct elements and the element it beints to
                .allMatch(e -> B.contains(new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue())));
    }

    
    public static boolean isSubArray_Problem_2_2c1a2f83_577a_4218_a4db_ca5dc0b18a07(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (B.get(i + j) != A.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_de236ef1_d7b8_43f7_8069_66bdd892077e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i=0; i<B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1);
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1);
        ArrayList<Integer> A3 = new ArrayList<Integer>();
        ArrayList<Integer> B3 = new ArrayList<Integer>();
        for(int i=0; i<A2.size(); i++) {
            A3.add(A2.get(i));
        }
        for(int i=0; i<B2.size(); i++) {
            B3.add(B2.get(i));
        }
        ArrayList<Integer> A4 = A3;
        ArrayList<Integer> B4 = B3;
        ArrayList<Integer> A5 = A3;
        ArrayList<Integer> B5 = B3;
        for(int i=0; i<A4.size(); i++) {
            for(int j=0; j<B4.size(); j++) {
                if(A4.get(i) == B5.get(j)) {
                    A5.remove(A4.get(i));
                    B5.remove(B4.get(j));
                }
            }
        }
        if(A5.size() != 0) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_f0cdedbb_0e07_4b07_821e_18537d3c19dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size_A=A.size();
        int size_B=B.size();
        if(size_B <= size_A) {
            return False;
        }
        ArrayList<Integer> newList = new ArrayList<>(B.size());
        for (int i = size_A - 1; i >= 0; i--) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_c6b684c8_7704_4221_9aad_13f58993f0df(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            for(int j=0;j<A1.size();j++) {
                if(B1.get(i)==A1.get(j)) {
                    C.add(B1.get(i));
                }
            }
        }
        if(C.size()==B1.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_878d30a0_bb55_4b2e_86ba_79a4300ac674(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_9f0c4c1a_a4ac_4dd2_a3e1_6a0f51b2b27b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_38fb64c8_c68e_4c0a_903b_c29de1520d44(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ccb93cde_f893_443a_ac03_0c621b9d8c96(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_c94c4cb9_fbf5_410a_8bf3_8682fd37b495(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_ = new ArrayList<>();
        A.forEach(x -> A_.add(x));

        ArrayList<Integer> B_ = new ArrayList<>();
        B.forEach(x -> B_.add(x));

        ArrayList<Integer> intersection = new ArrayList<>();
        intersection.addAll(A_);
        intersection.addAll(B_);

        return intersection.containsAll(A_) && intersection.containsAll(B_);
    }

    
    public static boolean isSubArray_Problem_1_306527f8_9fc3_44c4_99b2_690457724fde(ArrayList<Integer> A, ArrayList<Integer> B) {
        // TODO: implement this function
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b607d969_11df_4882_bf45_a339ff67cacb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty() || A.size() != B.size())
            return False;
        Set<Integer> setA = new HashSet<>(A);
        Set<Integer> setB = new HashSet<>(B);
        setA.retainAll(setB);
        setB.retainAll(setA);
        return setA.size() == 0 && setB.size() == 0;
    }

    
    public static boolean isSubArray_Problem_0_cc633bc2_e9d3_473a_aafa_ec4087c4d888(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> left = new ArrayList<Integer>(A.subList(0, Math.min(A.size(), B.size())));
        ArrayList<Integer> right = new ArrayList<Integer>(B.subList(0, Math.min(A.size(), B.size())));

        if (left.size() == 0 || right.size() == 0) {
            return True;
        }

        int firstLeftElement = left.get(0); // take the first element of left and right and compare them
        int firstRightElement = right.get(0);

        // check whether all the elements from left are present in the right
        for (int i = 1; i < left.size(); i++) {
            if (left.get(i) != firstLeftElement) {
                return False;
            }
        }
        // check whether all the elements from right are present in the left
        for (int i = 1; i < right.size(); i++) {
            if (right.get(i) != firstRightElement) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_411eec7b_e337_4ed2_837b_5e7a04e0a711(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_52e1a915_4d14_4b34_9244_52661f0fd5e1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty()) return True;
        if(B.isEmpty()) return False;
        if(A.size()!=B.size()) return False;
        int diff=A.size()-B.size();
        for(int i=0;i<A.size();i++)
        {
            if(A.contains(B.get(i)) && !B.contains(A.get(i)))
            {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_a022cdaa_4612_4deb_b936_2a076c3f7443(ArrayList<Integer> A, ArrayList<Integer> B) {
        int flag = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.contains(B.get(i))) {
                flag++;
            }
        }
        if(flag == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_0_e0891221_f213_45fe_8f89_a8dc6c4f7a55(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> A2 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B.size());
        for (Integer i : A) {
            A1.remove(i);
        }
        boolean flag = False;
        int i = 0;
        while (i < A1.size() && i < B1.size()) {
            if (A1.get(i) == B1.get(i)) {
                A2.remove(i);
                i++;
            } else if (A1.get(i) > B1.get(i)) {
                flag = True;
                break;
            } else {
                B2.remove(i);
                i++;
            }
        }
        if (A1.size() < B1.size()) {
            flag = True;
        }
        if (A2.size() > B2.size()) {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_7b366cf3_8092_4cb7_a01d_36c30d232188(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().allMatch(element -> B.contains(element));
    }

    
    public static boolean isSubArray_Problem_0_2c9e43ef_a008_40c0_ad0b_994d626caaa6(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_de8e0b39_52d8_4d37_9106_66dab47762d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b3139b7b_e068_4f4c_a3b1_d925f10d6401(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_bac96cb3_a342_4f09_ac54_f6ef1558845f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < A.size(); i++) {
            B1.add(A.get(i));
        }
        for (j = 0; j < B.size(); j++) {
            B2.add(B.get(j));
        }
        for (i = 0; i <= B1.size() - B2.get(i); i++) {
            for (j = 0; j <= B2.size() - B1.get(j); j++) {
                if (B1.get(i) == B2.get(j)) {
                    k = k + 1;
                }
            }
        }
        if (k == B2.get(i)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_7fa59460_8e71_43cb_9e99_8c776e6290b5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> tempList = new ArrayList<>();
        Integer minInteger = A.get(0);
        for(Integer currentInteger : A) {
            if(currentInteger < minInteger) {
                minInteger = currentInteger;
            }
            tempList.add(currentInteger);
        }
        Integer maxInteger = B.get(0);
        for(Integer currentInteger : B) {
            if(currentInteger > maxInteger) {
                maxInteger = currentInteger;
            }
        }
        while(maxInteger != minInteger) {
            if(!tempList.contains(minInteger)) {
                return False;
            }
            minInteger++;
            tempList.remove(minInteger);
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c3ecda57_e892_4699_9f12_8bf91d83b009(ArrayList<Integer> A, ArrayList<Integer> B) {
        int startOfSubArray = A.size() - B.size();
        for (int i = 0; i < startOfSubArray; i++) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = True;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    isSubArray_Problem_0_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_0_ad6495d9_efde_4fcd_95b2_cf2e5cd0aeff;
    }

    
    public static boolean isSubArray_Problem_1_bb52e49e_002e_407c_aa01_8f20e62429d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) == B.get(0) && A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        if (C.size() == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_1f8d9bf7_9962_41c2_9e65_263b1809050e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_831da2b0_d529_4cfa_b2f7_5175d85ab217(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(AA -> B.stream().noneMatch(BB -> AA.intValue() == BB.intValue()));
    }

    
    public static boolean isSubArray_Problem_0_73590c6e_6acc_421a_b737_2eb935aad919(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_de4f352f_a376_46b4_b718_1f2b31ae7328(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minA = A.get(0).intValue();
        int maxA = A.get(0).intValue();
        for (Integer n : A) {
            if (n.intValue() < minA) minA = n.intValue();
            if (n.intValue() > maxA) maxA = n.intValue();
        }
        int minB = B.get(0).intValue();
        int maxB = B.get(0).intValue();
        for (Integer n : B) {
            if (n.intValue() < minB) minB = n.intValue();
            if (n.intValue() > maxB) maxB = n.intValue();
        }
        return maxA > minB && maxB > minA;
    }

    
    public static boolean isSubArray_Problem_2_e6be59ea_5cc6_4be9_ac38_d309cf9cfdb0(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_391e1b6a_125b_44b7_ada8_64dd94bda872(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        if(A.size() != B.size())
            return False;
        HashSet<Integer> setA = new HashSet<Integer>(A);
        HashSet<Integer> setB = new HashSet<Integer>(B);
        setA.removeAll(setB);
        for(Integer i : setA) {
            if(B.contains(i) == False) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_a7c79533_62bb_40b2_b20e_d91a51187f49(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b09729cb_289f_42a5_bf8e_7d8c99eacf2b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_6f0539ef_2bb9_4a83_9ae3_15cb0e93f300(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<B.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_587e98ff_e9cb_4521_82c2_75823dd4ebb2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_9eebf9f0_c9fb_4893_9ebf_ef5c8affb35f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found)
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_38fb64c8_c68e_4c0a_903b_c29de1520d44(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3a10e654_46cc_470a_88ae_c195652f5472(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your logic here
        return True; // <- the actual logic
    }

    
    public static boolean isSubArray_Problem_1_fb35b8e9_f348_4374_a6b1_f0d4ff3e10f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        int flag = 0;
        for (int i = 0; i < A.size(); i++) {
            if (B.get(i) > A.get(i)) flag = 1;
            if (flag == 1) {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }

    
    public static boolean isSubArray_Problem_0_a75d8da8_5b26_4164_9324_efe7ee1d2233(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_64180fd8_8353_4dac_89e1_f703215b5c90(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) return False;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_71357507_33c4_42b3_9cec_21c382877198(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_5c79f354_2bc5_484c_9b16_b396f80d29bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        return False;
    }

    
    public static boolean isSubArray_Problem_1_e76267e9_4fe4_4de4_ad68_b5519fd96a59(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(Integer i : A) {
            for(Integer j : B) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        return temp.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_ac360527_38c2_4d55_80e7_1c7b58815691(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_eaffa1ec_b7ca_49ac_86d4_e2973f6c038c(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(B);
        for (int i : A) if (!set.contains(i)) return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_1_78f0eb2e_368f_4853_830b_87259cede7a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == A.size()) {
            flag = True;
        } else {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_ca07abc6_12f6_4447_9c84_3be5a2435011(ArrayList<Integer> A, ArrayList<Integer> B) {
        // your code goes here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> subArr = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            set.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            if (!set.contains(B.get(i))) {
                subArr.add(B.get(i));
            }
        }
        return subArr.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_de8e0b39_52d8_4d37_9106_66dab47762d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_7b366cf3_8092_4cb7_a01d_36c30d232188(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().allMatch(element -> B.contains(element));
    }

    
    public static boolean isSubArray_Problem_2_42818843_1d8a_4a3f_849c_3bb7529cbcfd(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        if (A.size() < B.size()) {
            return False;
        }
        // Copy array list B to array list C.
        for (int i = 0; i < B.size(); i++) {
            C.add(B.get(i));
        }
        // Copy array list A to array list D.
        for (int i = 0; i < A.size(); i++) {
            D.add(A.get(i));
        }
        // Perform the check using two nested loops.
        boolean result = False;
        for (int i = 0; i < C.size(); i++) {
            boolean found = False;
            for (int j = 0; j < D.size(); j++) {
                if (D.get(j).equals(C.get(i))) {
                    found = True;
                    break;
                }
            }
            if (found) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_2_dc3d5a46_8803_4d5d_8535_3a716ff54199(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_2_9e77df34_50a7_4f23_b3e3_a9416cc7dc78(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty()) return B.isEmpty();
        if (B.isEmpty()) return True;
        int n = A.size();
        int m = B.size();
        int k = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < m; j++) {
            if (B.get(j) > A.get(i))
                sum -= B.get(j);
            else
                sum += B.get(j);
            if (k == n)
                return sum == 0;
            if (sum < 0) {
                sum = 0;
                k = k + 1;
            }
            else if (sum > 0) {
                k = 0;
                i++;
                sum = 0;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_c476f97f_ae0a_4749_a750_07230b32f516(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_6885c8af_afba_445a_baa9_1e145b3168bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_c9ccaf7b_29d6_4723_b9c1_087fd7d00bfc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean flag = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_21a03ba4_98ad_4e0b_b889_f7e3792e8992(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_de4f352f_a376_46b4_b718_1f2b31ae7328(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minA = A.get(0).intValue();
        int maxA = A.get(0).intValue();
        for (Integer n : A) {
            if (n.intValue() < minA) minA = n.intValue();
            if (n.intValue() > maxA) maxA = n.intValue();
        }
        int minB = B.get(0).intValue();
        int maxB = B.get(0).intValue();
        for (Integer n : B) {
            if (n.intValue() < minB) minB = n.intValue();
            if (n.intValue() > maxB) maxB = n.intValue();
        }
        return maxA > minB && maxB > minA;
    }

    
    public static boolean isSubArray_Problem_1_5cb8796a_4611_4ed4_843a_b940fba0152c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        return False;
    }

    
    public static boolean isSubArray_Problem_1_3efbf521_350a_4312_b1dc_7a040c731852(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while ( i < A.size() && j < B.size() ) {
            if ( A.get(i) == B.get(j) )
                i++;
            else
                j++;
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_1_bdbcc40e_ade6_433c_b414_38608089b9a5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < B.size() && A.get(i) == B.get(index)) {
                index++;
            }
            C.add(A.get(i));
        }
        ArrayList<Integer> D = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < C.size() && A.get(i) == C.get(index)) {
                index++;
            }
            D.add(A.get(i));
        }
        return A.equals(D);
    }

    
    public static boolean isSubArray_Problem_1_e1851326_a976_4977_91cf_c64662f6330a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_ee9f4d92_9bf5_4bf9_b96c_27e91c7d6654(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_742ecb9e_af13_4529_97c3_b68e085ad928(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }

        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) {
                return False;
            }
        }

        return True;
    }

    
    public static boolean isSubArray_Problem_2_2016edef_0fbb_4413_af1e_30c1c29db4af(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_7a4fe354_4524_456d_9e3a_01d91753a8b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        // return True;
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!B.contains(i))
                C.add(i);
        }
        return C.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_0_bc58a210_068e_40b5_8bd6_cf0e20a0ddd9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int temp=0;
        for (int i=0;i<A.size();i++)
        {
            temp=A.get(i);
            for (int j=0;j<B.size();j++)
            {
                temp=temp*B.get(j);
            }
            if (B.contains(temp))
            {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_946189aa_2b0d_4838_9b71_22b19cfe28ed(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_a8489644_bf94_468c_a868_135176f26302(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = new ArrayList<>(A);
        ArrayList<Integer> b = new ArrayList<>(B);
        int j = 0;
        boolean flag = True;
        while (a.size() > 0 && j < b.size()) {
            if (b.get(j) == a.get(j)) {
                j++;
            } else {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_5682fe26_f164_46ea_91f4_ac713e274260(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_cf8caf77_b20b_4128_a918_56eff7129c8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return B.stream()
                .anyMatch(x -> A.contains(x));
    }

    
    public static boolean isSubArray_Problem_2_2bf0a6c1_b181_499b_872a_ccb699ed996f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_ce698eda_306d_4187_8613_d739ee4657de(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_cce3ea5c_9093_4470_8a2a_f03d79b3c79b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minA = A.get(0);
        int maxA = A.get(0);
        for (int i : A) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        for (int i : B) {
            if (i < minA) {
                minA = i;
            }
            if (i > maxA) {
                maxA = i;
            }
        }
        if (minA > maxA) {
            return False;
        }
        for (int i : A) {
            if (A.contains(i)) {
                result.add(i);
            }
        }
        for (int i : B) {
            if (B.contains(i)) {
                result.add(i);
            }
        }
        if (result.size() < A.size() / 2) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_d66c1f65_4777_44d6_973f_3602d287cf0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_de8e0b39_52d8_4d37_9106_66dab47762d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_83a2092f_2f93_420d_8148_e124755c890b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_fb35b8e9_f348_4374_a6b1_f0d4ff3e10f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        int flag = 0;
        for (int i = 0; i < A.size(); i++) {
            if (B.get(i) > A.get(i)) flag = 1;
            if (flag == 1) {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }

    
    public static boolean isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        if (A.size() > B.size()) {
            isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        } else {
            isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166 = True;
            int i = 0;
            int j = 0;
            while (i < A.size() && j < B.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_1_bb5aa91f_d29e_4899_9fde_02c20f136166;
    }

    
    public static boolean isSubArray_Problem_1_04576e2a_1bc0_4426_9119_398bcb172fa1(ArrayList<Integer> A, ArrayList<Integer> B) {
        int start = A.get(0), end = A.get(A.size() - 1);
        int startB = B.get(0), endB = B.get(B.size() - 1);
        // System.out.println("Start: " + start + " End: " + end + " StartB: " + startB + " EndB: " + endB);
        boolean check = True;
        int i = 0;
        while (i != A.size() && (start <= end)) {
            if (check) {
                if (start <= startB && startB <= end) {
                    return True;
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
        }
        i = 0;
        while (i != B.size() && (startB <= endB)) {
            if (check) {
                if (startB <= start && start <= endB) {
                    return True;
                }
            }
            i++;
            startB = B.get(i-1);
            endB = B.get(i);
        }
        i = 0;
        while (i != A.size() || i != B.size()) {
            if (start != A.size() && end != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                    if (start <= end && end <= endB) {
                        return True;
                    }
                }
            } else if (start != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
            startB = B.get(i-1);
            endB = B.get(i);
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_49f10157_70a9_48e0_95c2_555630a36f9b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( i);
                    C.add( j);
                }
            }
        }
        boolean result = False;
        if(C.size() == A.size() && C.size() == B.size()) {
            result = True;
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_54908839_3780_49f8_92c3_c44d94176cbf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_fc10244a_78bd_4c9c_8580_5aeb928d86c6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_2016edef_0fbb_4413_af1e_30c1c29db4af(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b2b0fb83_edc8_4756_bfba_748f34bb0129(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).equals(B);
    }

    
    public static boolean isSubArray_Problem_2_04576e2a_1bc0_4426_9119_398bcb172fa1(ArrayList<Integer> A, ArrayList<Integer> B) {
        int start = A.get(0), end = A.get(A.size() - 1);
        int startB = B.get(0), endB = B.get(B.size() - 1);
        // System.out.println("Start: " + start + " End: " + end + " StartB: " + startB + " EndB: " + endB);
        boolean check = True;
        int i = 0;
        while (i != A.size() && (start <= end)) {
            if (check) {
                if (start <= startB && startB <= end) {
                    return True;
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
        }
        i = 0;
        while (i != B.size() && (startB <= endB)) {
            if (check) {
                if (startB <= start && start <= endB) {
                    return True;
                }
            }
            i++;
            startB = B.get(i-1);
            endB = B.get(i);
        }
        i = 0;
        while (i != A.size() || i != B.size()) {
            if (start != A.size() && end != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                    if (start <= end && end <= endB) {
                        return True;
                    }
                }
            } else if (start != B.size()) {
                if (check) {
                    if (start <= startB && startB <= end) {
                        return True;
                    }
                }
            }
            i++;
            start = A.get(i-1);
            end = A.get(i);
            startB = B.get(i-1);
            endB = B.get(i);
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_c35810e8_fc36_4b6f_8e7b_9d6779ed8f06(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Return True or False.
        if (A.size() > B.size()) {
            return False;
        }
        if (A.size() < B.size()) {
            return True;
        }
        // Iterate A and B both arrays to compare each element.
        for (int i = 0; i < A.size(); i++) {
            if (!B.get(i).equals(A.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_a6a54c32_f2dd_4f8b_8243_ae3e234a89e4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        A.stream().filter(x -> !B.contains(x)).forEach(x -> C.add(new Integer(x)));
        return C.stream().allMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_38fb64c8_c68e_4c0a_903b_c29de1520d44(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_a0c9bec2_450c_427b_938c_b51efd93de1d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_5f4ab65d_9c0d_4364_bc73_afea2d240646(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return False;
    }

    
    public static boolean isSubArray_Problem_0_187d1217_22f1_49ae_895f_ac2106ea0382(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> array1 = new ArrayList<>(A);
        List<Integer> array2 = new ArrayList<>(B);
        return array1.stream().anyMatch(i -> array2.contains(i));
    }

    
    public static boolean isSubArray_Problem_2_71357507_33c4_42b3_9cec_21c382877198(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_b528dd32_5565_406b_96f6_739bac2dddfa(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++) {
            for(int j=0; j<B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( A.get(i));
                }
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_831da2b0_d529_4cfa_b2f7_5175d85ab217(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(AA -> B.stream().noneMatch(BB -> AA.intValue() == BB.intValue()));
    }

    
    public static boolean isSubArray_Problem_1_6453842a_57f5_4888_9245_97c222d21fbc(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.equals(B); // If A and B are of same size, then A and B are subarrays.
    }

    
    public static boolean isSubArray_Problem_2_64180fd8_8353_4dac_89e1_f703215b5c90(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) return False;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_dede25ee_3876_415b_9be2_ec70920640e6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b331e7df_a22a_4c05_9076_ba74cb060c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_f225f521_0807_43d4_9641_6b9537ea377a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = A.get(i);
        }
        Arrays.sort(array);
        int[] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = B.get(i);
        }
        Arrays.sort(arrayB);
        for (int i = 0; i < m && i < n; i++) {
            if (array[i] != arrayB[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_22363d43_0570_4e81_8b2c_758b5cc775df(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_24ea4e4c_3ca9_465e_9594_6192d7e0c3c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_19838443_8552_473f_955d_46c2d587d30f(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Your code goes here
        return A.containsAll(B.subList(B.size() - 1, B.size()));
    }

    
    public static boolean isSubArray_Problem_0_19838443_8552_473f_955d_46c2d587d30f(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Your code goes here
        return A.containsAll(B.subList(B.size() - 1, B.size()));
    }

    
    public static boolean isSubArray_Problem_0_55e5d5fe_5100_4faf_b1b2_129cd872e11c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write code here
        return False;
    }

    
    public static boolean isSubArray_Problem_1_e44d11ec_b894_4ead_9a7c_25112d166857(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = i;
            while (j < m && k < n && A.get(k) == B.get(j)) {
                j++;
                k++;
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_d455083a_92ef_44f2_9675_ab3ee378ff46(ArrayList<Integer> A, ArrayList<Integer> B) {
        A.retainAll(B);
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_0cc95c42_8006_4ea9_9451_46490431e056(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]==b[i]) {
                flag = True;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_b3fb9541_f3eb_42c4_ac5c_6b258f76e265(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_79702e2a_caf2_4f59_a985_b7407eef175d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_73c4881d_37e4_423f_bcd5_23c47bc9380a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_a2359daa_8f7c_4487_a9ba_720bb5152bf3(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        int i = 0;
        for(i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_71e12411_173d_494d_8a78_ab4ee013d99d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!C.contains(i)) {
                C.add(i);
            }
        }
        for(Integer i : B) {
            if(!C.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_614770b1_5052_409f_aaa7_28a1e80b0730(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_b1ebb9af_03f2_4916_a68b_afae59999b1a(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.stream().anyMatch(x -> B.contains(x));
    }

    
    public static boolean isSubArray_Problem_1_8715ea4f_7366_41d7_8426_b43679b6e2d7(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_2_7fc22c76_813a_44c8_96b5_4771fe7cd4bb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3c6dc415_6fa1_4c70_b407_f2460daeb10d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() != B.size()) {
            return False;
        } else {
            int m = B.size();
            if (m == 0)
                return True;
            if (A.size() == 0)
                return False;
            ArrayList<Integer> c1 = new ArrayList<>();
            ArrayList<Integer> c2 = new ArrayList<>();
            int curVal = A.get(0);
            int nextVal = A.get(0);
            int prevVal = A.get(0);
            for (int i = 0; i < n; i++) {
                nextVal = A.get(i + 1);
                prevVal = A.get(i - 1);
                while (nextVal != curVal) {
                    if (prevVal <= curVal) {
                        c1.add(prevVal);
                        c2.add(curVal);
                    }
                    prevVal = curVal;
                    curVal = nextVal;
                    nextVal = A.get(i + 1);
                }
                curVal = nextVal;
            }
            for (int i = 0; i < m; i++) {
                nextVal = B.get(i + 1);
                prevVal = B.get(i - 1);
                while (nextVal != prevVal) {
                    if (curVal <= prevVal) {
                        c1.add(curVal);
                        c2.add(prevVal);
                    }
                    curVal = prevVal;
                    prevVal = nextVal;
                    nextVal = B.get(i + 1);
                }
                curVal = prevVal;
            }
            if (c1.equals(c2))
                return True;
            else
                return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_8cc6bf3f_8477_4d03_a79a_37ef126f8ccd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (A.get(i + j) != B.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_8e9fd48b_e49c_4bb7_b62e_efb9c6d68c19(ArrayList<Integer> A, ArrayList<Integer> B) {
        //write your logic here
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ce25d7bf_0523_4ca8_a97d_9132388e523d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_0b2c4e37_eba1_4478_9f97_0c03da193bd4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_8a21e03a_40a3_4a7f_bb8a_56b1682338de(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        return A.containsAll(B);
    }

    
    public static boolean isSubArray_Problem_2_c9ccaf7b_29d6_4723_b9c1_087fd7d00bfc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean flag = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_0f063614_5bdf_41ef_b26d_9b4fd2624764(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_2da7307a_f62a_43fd_839c_7229421fa5e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_1_ddb9a9ed_fc29_4d43_9831_d3915c2018f9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_3586f536_e855_449e_85e6_b078abff2c87(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_f6e562b6_d433_4323_ae5b_18a99236e8eb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_53151210_ea00_478f_8188_bd2424430673(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
                C.add(B.get(i));
            }
        }
        if (A.size() == C.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_90d20c93_304f_4a3d_bf86_e27b44024cdf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_391e1b6a_125b_44b7_ada8_64dd94bda872(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        if(A.size() != B.size())
            return False;
        HashSet<Integer> setA = new HashSet<Integer>(A);
        HashSet<Integer> setB = new HashSet<Integer>(B);
        setA.removeAll(setB);
        for(Integer i : setA) {
            if(B.contains(i) == False) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_1388bf2a_63fe_40e4_bdad_d09884a50ce5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_c9437c2a_ec71_4ef7_8d7a_27bbe670e050(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() >= B.size()) {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) != B.get(i)) {
                    return False;
                }
            }
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_a022cdaa_4612_4deb_b936_2a076c3f7443(ArrayList<Integer> A, ArrayList<Integer> B) {
        int flag = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.contains(B.get(i))) {
                flag++;
            }
        }
        if(flag == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_2_2f36f281_77ba_47bc_99ad_074ab20e2ed5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        boolean equal = True;
        for(int i=0; i<A.size() && equal; i++ ) {
            for(int j=0; j<B.size() && equal; j++ ) {
                if(A.get(i) == B.get(j)) {
                    equal = False;
                }
            }
        }
        return equal;
    }

    
    public static boolean isSubArray_Problem_1_87f9c4d1_836e_4b7e_9c40_575259c2a064(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            A2.add(A1.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            B2.add(B1.get(i));
        }
        for(int i=0;i<A2.size();i++) {
            if(!A2.contains(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_0b2c4e37_eba1_4478_9f97_0c03da193bd4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_1e233774_14c1_4166_8262_e90132f7be19(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> Anew = new ArrayList<>();
        ArrayList<Integer> Bnew = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            Anew.add(A.get(i));
        }
        for(int i=0;i<B.size();i++){
            Bnew.add(B.get(i));
        }
        return Anew.containsAll(Bnew);
    }

    
    public static boolean isSubArray_Problem_1_c79ef6a3_d556_4d3f_9595_b0c07421b6be(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_2_1b751103_c4d8_4dd4_b7d0_d5e54deb6205(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write code here
        // check if both array have same length
        if (A.size() != B.size())
            return False;
        //loop over each element of first array
        for (int i = 0; i < A.size(); i++) {
            //loop over each element of second array
            for (int j = 0; j < B.size(); j++) {
                //if both have same index
                if (A.size() == B.size()) {
                    if (A.get(i) == B.get(j))
                        continue;
                    else {
                        return False;
                    }
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_946189aa_2b0d_4838_9b71_22b19cfe28ed(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_2fb849bd_9efe_46f8_8b19_89264e028ae5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        if (A.size() > B.size()) {
            isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
        } else {
            isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166 = True;
            int i = 0;
            int j = 0;
            while (i < A.size() && j < B.size()) {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else {
                    isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_0_bb5aa91f_d29e_4899_9fde_02c20f136166;
    }

    
    public static boolean isSubArray_Problem_2_313497bf_464a_4481_b298_662291841644(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_8aa4c57b_b653_44f8_af41_1caf8037d8e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        // Iterate through array A
        for (Integer element : A) {
            count += 1;
            int index = 0;
            // Iterate through array B
            for (Integer elementB : B) {
                // If we found an element in B, then break the loop
                if (element == elementB) {
                    break;
                } else {
                    index += 1;
                }
            }
            // If the count of element in B is equal to count of element in A, then return True
            if (count == index) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_fec97311_a834_47fd_a7de_7cd6c5d9b637(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer element : A)
            sum += element;
        int i = 0;
        for (Integer element : B)
            sum += element;
        return sum == (A.size() * B.size()) - i;
    }

    
    public static boolean isSubArray_Problem_0_c4ad1563_3b97_4c7b_aad3_3968ab143d7d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_0f063614_5bdf_41ef_b26d_9b4fd2624764(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_9a60510b_169f_4060_abd0_7df032688de8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A2.contains(A1.get(i))) {
                return False;
            }
        }
        for(int i = 0; i < B1.size(); i++) {
            if(!B2.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c6ec68c0_f439_4ae6_9edd_3f493bfc0cc5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        int count = 0;
        int minA = A.get(0);
        int maxB = B.get(0);
        for(int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            count += 1;
            if(sum == minA) {
                minA = A.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        for(int i = 1; i < B.size(); i++) {
            sum += B.get(i);
            count += 1;
            if(sum == minA) {
                minA = B.get(i);
            }
            if(sum > maxB) {
                maxB = B.get(i);
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_6c406197_ee16_44cd_9cb7_d785660c7d68(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        if(A.size() >= B.size()) {
            for(int i = 0; i <A.size(); i++) {
                if((A.get(i) == B.get(i))) flag = True;
            }
        } else {
            return False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_b1a2d8f8_ae25_4661_a131_2a192e83ba7c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (Integer i : A) {
            sum += i;
        }
        int sum2 = 0;
        for (Integer i : B) {
            sum2 += i;
        }
        if (sum == sum2) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_65b05002_8a56_40a3_a52b_2aee6efb16c1(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int index = 0;
        for (Integer val : A) {
            if (B.contains(val)) {
                result.add(val);
                index++;
            } else {
                if (index != 0) {
                    result.add(A.get(index));
                    index++;
                }
            }
        }
        return result.size() == B.size();
    }

    
    public static boolean isSubArray_Problem_2_dfa3092f_e12f_4ad7_9ac8_74b122a3bf14(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_ebc57fca_09cd_49cb_a004_b8dee126d774(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : A) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : B) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp.size() == A.size();
    }

    
    public static boolean isSubArray_Problem_0_313497bf_464a_4481_b298_662291841644(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_bc595fc1_1447_46c8_b608_690e4bb6962e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : A) {
            if (!temp.contains(i)) {
                temp.add(i);
                for (int j : B) {
                    if (j == i) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_d1fd36e5_92de_4368_896f_a9a6158b0351(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty() || B.isEmpty())
            return False;
        int sizeA = A.size();
        int sizeB = B.size();
        if(sizeA != sizeB)
            return False;
        for(int i=0; i < sizeA; i++) {
            if(!A.equals(B))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_f5b1c3c0_aaff_496f_beb2_f3af81688778(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_5cb8796a_4611_4ed4_843a_b940fba0152c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        return False;
    }

    
    public static boolean isSubArray_Problem_0_946189aa_2b0d_4838_9b71_22b19cfe28ed(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_d26a9f6b_2102_4494_bef2_155e244295e5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer element : A) {
            if(!B.contains(element)) {
                result.add(element);
            }
        }
        return result.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_db6e1c63_9fcc_4d76_99f1_8e7901924ad1(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A.stream().filter(x -> B.stream().anyMatch(y -> y.equals(x)))).isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_b73a7345_9fc4_4106_a6a7_0044373590cb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_990acc95_5053_4ba3_863d_8987292d41b6(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_a0c9bec2_450c_427b_938c_b51efd93de1d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_78f0eb2e_368f_4853_830b_87259cede7a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == A.size()) {
            flag = True;
        } else {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_49f10157_70a9_48e0_95c2_555630a36f9b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( i);
                    C.add( j);
                }
            }
        }
        boolean result = False;
        if(C.size() == A.size() && C.size() == B.size()) {
            result = True;
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_2_ed86bda6_579b_47d5_8aa2_bb2937057817(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_c4c99957_a574_4eae_a2e9_0d6afa38abb1(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> Asub = new ArrayList<Integer>();
        for (Integer Ai : A) {
            Asub.add(Ai);
        }
        Collections.sort(Asub);
        List<Integer> Bsub = new ArrayList<Integer>();
        for (Integer Bi : B) {
            Bsub.add(Bi);
        }
        Collections.sort(Bsub);
        return (Asub.size() == Bsub.size());
    }

    
    public static boolean isSubArray_Problem_2_587e98ff_e9cb_4521_82c2_75823dd4ebb2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_71e12411_173d_494d_8a78_ab4ee013d99d(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        for(Integer i : A) {
            if(!C.contains(i)) {
                C.add(i);
            }
        }
        for(Integer i : B) {
            if(!C.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_ae0ab445_fba9_461c_ba18_7c468016ee8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.containsAll(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_0f063614_5bdf_41ef_b26d_9b4fd2624764(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_683c9f4f_95b4_4d54_bf01_c173b5d1c343(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_2_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
        int aSize = A.size();
        int bSize = B.size();
        if (aSize == bSize) {
            isSubArray_Problem_2_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = True;
            for (int i = 0; i < aSize; i++) {
                if (A.get(i) != B.get(i)) {
                    isSubArray_Problem_2_683c9f4f_95b4_4d54_bf01_c173b5d1c343 = False;
                    break;
                }
            }
        }
        return isSubArray_Problem_2_683c9f4f_95b4_4d54_bf01_c173b5d1c343;
    }

    
    public static boolean isSubArray_Problem_1_c6476c2f_bdd9_414e_acff_d77cbfb8c6c5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>(A);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(B);
        Collections.sort(temp);
        Collections.sort(temp2);
        return A==B;
    }

    
    public static boolean isSubArray_Problem_1_197fad79_c03c_47fb_b2f5_15f841ad1c9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_19fac060_294a_413b_8b08_14aa5d6d0d1f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add((A.get(i))+B.get(i));
        }
        boolean result = False;
        if(A.size() == B.size()) {
            for(int i = 0; i < A.size(); i++) {
                for(int j = 0; j < B.size(); j++) {
                    if(A.get(i) == B.get(j)) {
                        result = True;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_0_1388bf2a_63fe_40e4_bdad_d09884a50ce5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_d817dc7b_9f96_487c_bbd0_932cf90f1fe2(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_abfd79fb_5c83_4f80_974a_7176c029df4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_24ea4e4c_3ca9_465e_9594_6192d7e0c3c9(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_9c5290fe_a78d_4a11_b823_ec3aa0d85e8e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = A;
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.get(i).compareTo(B.get(j)) < 0) {
                    temp.remove(i);
                    i--;
                }
            }
        }
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_3167bc6e_6d56_444b_8eea_c4b7b153e699(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_0_831da2b0_d529_4cfa_b2f7_5175d85ab217(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(AA -> B.stream().noneMatch(BB -> AA.intValue() == BB.intValue()));
    }

    
    public static boolean isSubArray_Problem_1_e10f6695_6595_4a74_89af_dfb557f8ce69(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_a2359daa_8f7c_4487_a9ba_720bb5152bf3(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        int i = 0;
        for(i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_b1177358_4a08_4af8_8be9_cac000b16c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i = 0; i < A1.size(); i++) {
            A2.add(A1.get(i));
        }
        for(int i = 0; i < B1.size(); i++) {
            B2.add(B1.get(i));
        }
        if(A2.size() != B2.size()) {
            return False;
        }
        for(int i = 0; i < A2.size(); i++) {
            if(!A2.get(i).equals(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_32631fe9_d91d_468d_bcfd_c785a0103600(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        } else if (A.size() < B.size()) {
            return True;
        }
        Integer[] arrayA = new Integer[A.size()];
        Integer[] arrayB = new Integer[B.size()];
        for (int i = 0; i < A.size(); i++) {
            arrayA[i] = A.get(i);
        }
        for (int j = 0; j < B.size(); j++) {
            arrayB[j] = B.get(j);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
    }

    
    public static boolean isSubArray_Problem_2_d37377be_d7ae_4c7c_9548_4664345291aa(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_1_7fa59460_8e71_43cb_9e99_8c776e6290b5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> tempList = new ArrayList<>();
        Integer minInteger = A.get(0);
        for(Integer currentInteger : A) {
            if(currentInteger < minInteger) {
                minInteger = currentInteger;
            }
            tempList.add(currentInteger);
        }
        Integer maxInteger = B.get(0);
        for(Integer currentInteger : B) {
            if(currentInteger > maxInteger) {
                maxInteger = currentInteger;
            }
        }
        while(maxInteger != minInteger) {
            if(!tempList.contains(minInteger)) {
                return False;
            }
            minInteger++;
            tempList.remove(minInteger);
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_fdbf5fe0_c033_441f_a3c7_85947421e87c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_0_c8e55bc8_a517_49b8_a19c_fbb3649414fd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_8aa4c57b_b653_44f8_af41_1caf8037d8e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        // Iterate through array A
        for (Integer element : A) {
            count += 1;
            int index = 0;
            // Iterate through array B
            for (Integer elementB : B) {
                // If we found an element in B, then break the loop
                if (element == elementB) {
                    break;
                } else {
                    index += 1;
                }
            }
            // If the count of element in B is equal to count of element in A, then return True
            if (count == index) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_779dd7f3_97fa_4bce_b970_b72c11b080af(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_4c5fdc71_8002_439e_a331_0127ce9b89e0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_cb763dc1_5240_483a_834e_444fea7f0ec9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_7341ad5e_9573_4f7c_8fb8_8c3c556cc79a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_35411b54_06bd_46a7_9332_34343bc8edd3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_3726b99d_f1cf_4a99_9529_b3ad7d010955(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (A.contains(B.get(i)) && (A.get(j).compareTo(B.get(i)) > 0)) {
                    return False;
                }
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_67b67241_8e0d_4337_bd06_93345ec1e5c0(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_306527f8_9fc3_44c4_99b2_690457724fde(ArrayList<Integer> A, ArrayList<Integer> B) {
        // TODO: implement this function
        return False;
    }

    
    public static boolean isSubArray_Problem_2_b46c3290_2777_4fae_92e6_b23f54f10683(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        int aSize = A.size(), bSize = B.size();
        ArrayList<Integer> aTemp = new ArrayList<>(aSize);
        ArrayList<Integer> bTemp = new ArrayList<>(bSize);
        for (int i = 0; i < aSize; i++) {
            aTemp.add(A.get(i));
        }
        for (int i = 0; i < bSize; i++) {
            bTemp.add(B.get(i));
        }
        aTemp.removeAll(bTemp);
        if (0 != aTemp.size())
            return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_1_f57b9932_9379_41f9_8109_fd297b1da044(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(i -> B.contains(i)).allMatch( i -> A.contains(i));
    }

    
    public static boolean isSubArray_Problem_1_73590c6e_6acc_421a_b737_2eb935aad919(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_700d96cb_00bd_4795_bc94_7520d83299c4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_3efbf521_350a_4312_b1dc_7a040c731852(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while ( i < A.size() && j < B.size() ) {
            if ( A.get(i) == B.get(j) )
                i++;
            else
                j++;
        }
        return (i == A.size() && j == B.size());
    }

    
    public static boolean isSubArray_Problem_1_7ca3dc85_d193_4ece_9bbc_fc05309f8fc8(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) > B.get(j)) {
                j++;
                k++;
                l++;
            } else {
                i++;
                k++;
                l++;
            }
        }
        return k == l;
    }

    
    public static boolean isSubArray_Problem_2_e44d11ec_b894_4ead_9a7c_25112d166857(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = i;
            while (j < m && k < n && A.get(k) == B.get(j)) {
                j++;
                k++;
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_9f0c4c1a_a4ac_4dd2_a3e1_6a0f51b2b27b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_63f87623_34b4_4672_86a8_5a239732e42b(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_d66c1f65_4777_44d6_973f_3602d287cf0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            if(!C.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_cbf2db63_b2c8_4ff1_b362_af4d5fbf927b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_d455083a_92ef_44f2_9675_ab3ee378ff46(ArrayList<Integer> A, ArrayList<Integer> B) {
        A.retainAll(B);
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_1_1d5e534b_6cbd_47d1_993d_b6652cfebcf7(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        // Write your code here
        
        return B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_dbd627df_48bf_46f0_8156_758079b26c8d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_dc34e281_3505_4e9c_b17a_bc85af920265(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_c79ef6a3_d556_4d3f_9595_b0c07421b6be(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_0_2016edef_0fbb_4413_af1e_30c1c29db4af(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_64ed271d_9738_48d4_82a1_c9efd2e823d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_6453842a_57f5_4888_9245_97c222d21fbc(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.equals(B); // If A and B are of same size, then A and B are subarrays.
    }

    
    public static boolean isSubArray_Problem_2_ddd7fba9_b5b6_45aa_ac0a_56c289c28266(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream()
                .map(Integer::valueOf)
                .allMatch(e -> B.contains(e));
    }

    
    public static boolean isSubArray_Problem_1_6f0539ef_2bb9_4a83_9ae3_15cb0e93f300(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<B.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_2efe9357_a0f3_489a_9ae9_c5239f6f9919(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> listA = new ArrayList<>();
        for (Integer element : A) {
            listA.add(element);
        }
        List<Integer> listB = new ArrayList<>();
        for (Integer element : B) {
            listB.add(element);
        }
        boolean sub = False;
        if (A.size() > B.size()) {
            for (int i = 0; i < A.size() - B.size(); i++) {
                listA.remove(0);
                listB.remove(0);
            }
            sub = True;
        }
        return sub;
    }

    
    public static boolean isSubArray_Problem_1_42818843_1d8a_4a3f_849c_3bb7529cbcfd(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        if (A.size() < B.size()) {
            return False;
        }
        // Copy array list B to array list C.
        for (int i = 0; i < B.size(); i++) {
            C.add(B.get(i));
        }
        // Copy array list A to array list D.
        for (int i = 0; i < A.size(); i++) {
            D.add(A.get(i));
        }
        // Perform the check using two nested loops.
        boolean result = False;
        for (int i = 0; i < C.size(); i++) {
            boolean found = False;
            for (int j = 0; j < D.size(); j++) {
                if (D.get(j).equals(C.get(i))) {
                    found = True;
                    break;
                }
            }
            if (found) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_1_cc633bc2_e9d3_473a_aafa_ec4087c4d888(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> left = new ArrayList<Integer>(A.subList(0, Math.min(A.size(), B.size())));
        ArrayList<Integer> right = new ArrayList<Integer>(B.subList(0, Math.min(A.size(), B.size())));

        if (left.size() == 0 || right.size() == 0) {
            return True;
        }

        int firstLeftElement = left.get(0); // take the first element of left and right and compare them
        int firstRightElement = right.get(0);

        // check whether all the elements from left are present in the right
        for (int i = 1; i < left.size(); i++) {
            if (left.get(i) != firstLeftElement) {
                return False;
            }
        }
        // check whether all the elements from right are present in the left
        for (int i = 1; i < right.size(); i++) {
            if (right.get(i) != firstRightElement) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_b8e595e8_331c_4d0f_bd04_61bd424b5206(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_b52fc875_b24c_48b2_bdad_b4bced139e46(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_19fac060_294a_413b_8b08_14aa5d6d0d1f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            C.add((A.get(i))+B.get(i));
        }
        boolean result = False;
        if(A.size() == B.size()) {
            for(int i = 0; i < A.size(); i++) {
                for(int j = 0; j < B.size(); j++) {
                    if(A.get(i) == B.get(j)) {
                        result = True;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_0_4e75c98f_7799_4ce1_9724_624c83cfc409(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code in java8
        List<Integer> intsA = A.stream().distinct().collect(Collectors.toList());
        List<Integer> intsB = B.stream().distinct().collect(Collectors.toList());
        List<Integer> intersection = new ArrayList<>();

        intersection.retainAll(intsA);
        if (intersection.size() != A.size())
            return False;

        intersection.retainAll(intsB);
        if (intersection.size() != B.size())
            return False;

        return True;
    }

    
    public static boolean isSubArray_Problem_0_c9437c2a_ec71_4ef7_8d7a_27bbe670e050(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() >= B.size()) {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) != B.get(i)) {
                    return False;
                }
            }
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_20ee2403_90b0_4b26_95b2_7de679b08858(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_3ab105bd_f8fd_4ed5_8fdc_b24f4ba76cf4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A);
        ArrayList<Integer> B1 = new ArrayList<>(B);
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_1_90d20c93_304f_4a3d_bf86_e27b44024cdf(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() > B.size()) return False;
        for(int i = 0; i < A.size(); i++) {
            if(!B.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_da4bdd0d_b719_4115_85a1_08f4736f8a13(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_187d1217_22f1_49ae_895f_ac2106ea0382(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> array1 = new ArrayList<>(A);
        List<Integer> array2 = new ArrayList<>(B);
        return array1.stream().anyMatch(i -> array2.contains(i));
    }

    
    public static boolean isSubArray_Problem_0_73a41bd6_432b_488f_b8b8_96fd64ec9ecc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_0_87f9c4d1_836e_4b7e_9c40_575259c2a064(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i=0;i<A1.size();i++) {
            A2.add(A1.get(i));
        }
        for(int i=0;i<B1.size();i++) {
            B2.add(B1.get(i));
        }
        for(int i=0;i<A2.size();i++) {
            if(!A2.contains(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_92585f02_37d6_42a9_ae19_32f8e776b837(ArrayList<Integer> A, ArrayList<Integer> B) {
        //Write a code here
        if(A.size() != B.size())
            return False;
        
        ArrayList<Integer> sub = new ArrayList<Integer>();
        int temp;
        for(int i = 0; i < A.size(); i++) {
            temp = A.get(i);
            for(int j = i; j < A.size(); j++) {
                if(temp == B.get(j)) {
                    sub.add(temp);
                    j++;
                }
            }
        }
        
        for(int i = 0; i < A.size(); i++) {
            if(sub.contains(A.get(i))) {
                return True;
            }
        }
        return False;
    }

}
