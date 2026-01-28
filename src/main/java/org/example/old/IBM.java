package org.example.old;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IBM {
        /*
         * Complete the 'getLatestKRequests' function below.
         *
         * The function is expected to return a STRING_ARRAY.
         * The function accepts following parameters:
         *  1. STRING_ARRAY requests
         *  2. INTEGER K
         */


        public static List<String> getLatestKRequests(List<String> requests, int K) {
            // Write your code here
            Set<String> single = new LinkedHashSet<>();
            int count = 0;

            for (int i= (requests.size()-1); i>=0; i--  ) {

                boolean added =  single.add(requests.get(i) );
                if (added ){
                    count++;
                    if(count == K ){
                        break;
                    }
                }
            }
            requests.clear();

            requests.addAll(single);
            return requests;
        }
    }
