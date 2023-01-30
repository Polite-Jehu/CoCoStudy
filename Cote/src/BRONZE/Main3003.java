import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3003 {
    public static void main (String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(temp," ");
        int[] array = {1,1,2,2,2,8};
        int[] answerArray = new int[6];
        int i=0;
        while(st.hasMoreElements())
        {
            answerArray[i] = array[i]-Integer.parseInt(st.nextToken()) ;
            System.out.print(answerArray[i]+" ");
            i++;
        }

    }
}
