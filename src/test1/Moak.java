package test1;


class Solution {
    public int[] solution(int[] answers) {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};

        int a_cnt1 =0;
        int a_cnt2 =0;
        int a_cnt3 =0;

        int k1 = 0;       
        int z1 = 0;
        while(true){
            if(answers[z1] == a1[k1]){
                a_cnt1++;
            }

            z1++; k1++;
            if(answers.length == z1) break;
            if(k1== a1.length) k1 = 0;
        }//정답 개수 체크 


            int k2 = 0;       
            int z2 = 0;
            while(true){
                if(answers[z2] == a2[k2]){
                    a_cnt2++;
                }

                z2++; k2++;
                if(answers.length == z2) break;
                if(k2== a2.length) k2 = 0;
            }//정답 개수 체크 



            int k3 = 0;       
            int z3 = 0;
            while(true){
                if(answers[z3] == a3[k3]){
                    a_cnt3++;
                }

                z3++; k3++;
                if(answers.length == z3) break;
                if(k3== a3.length) k3 = 0;
            }//정답 개수 체크 



        int max = 0;

        max = a_cnt1 > a_cnt2 ? a_cnt1 : a_cnt2;
        max = max  > a_cnt3 ? max : a_cnt3;
        int count = 0;  //답으로 생성할 배열의 크기 

        if(max == a_cnt1){
            count++;    
        }

        if(max == a_cnt2){
            count++;
        }

        if(max == a_cnt3){
            count++;
        }

        int[] ans = new int[count];

        boolean chk = false;

        int j = 0;

        while(!chk){

            if(max == a_cnt1){
                ans[j] = 1;
                j++;
            }

            if(max == a_cnt2){
                ans[j] = 2;
                j++;
            }

            if(max == a_cnt3){
                ans[j] = 3;
                j++;
            }

            if(j== count){
                chk = true;
            }
        }


        return ans;
    }
}