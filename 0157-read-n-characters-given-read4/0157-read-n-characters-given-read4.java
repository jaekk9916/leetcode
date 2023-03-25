/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char[] buf4 = new char[4];
        int readChars = 4;
        int copyChars = 0;

        while(readChars==4){
            readChars = read4(buf4);

            
            for(int i=0;i<readChars;i++){
                if(copyChars == n){
                    return copyChars;
                }
                buf[copyChars] = buf4[i];
                copyChars++;
            }
        }
        return copyChars;
    }
}