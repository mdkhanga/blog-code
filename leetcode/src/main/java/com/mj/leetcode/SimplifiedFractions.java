package com.mj.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {

    public List<String> simplifiedFractions(int n) {

        List<String> ret = new ArrayList<>();

        for (int denom = 2 ; denom <= n ; denom++) {

            for (int i = 1 ; i < denom; i++) {

                boolean pure = true;
                for (int j = 2 ; j <=  i  ; j++ ) {
                    if (i % j == 0 && denom %j == 0) {
                        pure = false ;
                        break;
                    }

                }

                if (pure) {
                    ret.add(String.format("%d/%d", i, denom));
                }
            }


        }



        return ret;

    }
}
