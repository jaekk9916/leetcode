class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int curCnt = 0;
        int h = 0;
        
        for(int i = 0; i < n; i++){
            if(citations[i] == 0) continue;
            
            int curNumber = citations[i];
            curCnt = 0;
            
            for(int j = 0; j < n; j++){
                if(citations[j] >= curNumber) curCnt++;
            }
            
            if(curCnt >= curNumber) {
                h = Math.max(h, curNumber);
            } else if(curCnt > h) {
                h = curCnt;
            }
        }
        return h;
    }
}

