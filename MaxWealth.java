public class MaxWealth {
    public static void main(String[] args) {
        // System.out.println("Hello!! Expt 4 ");
        System.out.println("This is the Expt 4"); // Changed Line
        System.out.println("This is the Expt 4 but copied line"); // Changed in Github website
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            // when you start a new column , take  new sum for that row
            int rowkasum = 0;
            for (int bankAccount = 0; bankAccount< accounts[person].length; bankAccount++){
                rowkasum += accounts[person][bankAccount];
            }
            // here , we have answer of sum of accounts of person
            // check with overall answer
            if(rowkasum>max){
                max = rowkasum;
            }
        }
        return max; // returns maximum wealth
    }
}
