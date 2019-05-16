package hackerRank;

public class BreakingtheRecords {

    static int[] getRecord(int[] s){
        int max = s[0];
        int min = s[0];
        int ans[] = new int[2];
        for(int sn:s){
            if(max < sn){
                max = sn;
                ans[0]++;
            }
            if(min > sn){
                min = sn;
                ans[1]++;
            }
        }
        return ans;
    }

}
