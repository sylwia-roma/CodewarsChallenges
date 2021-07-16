package GetTheExcelColumnTitle;

//Hi there! You have to implement the
//
//        String get_column_title(int num) // syntax depends on programming language
//
//        function that takes an integer number (index of the Excel column) and returns the string represents the title of this column.
//
//        Intro
//
//        In the MS Excel lines are numbered by decimals, columns - by sets of letters.
//
//        For example, the first column has the title "A", second column - "B", 26th - "Z", 27th - "AA".
//
//        "BA"(53) comes after "AZ"(52), "AAA" comes after "ZZ".

public class GetTheExcelColumnTitle {
    public static void main(String[] args) {
        //System.out.println(getColumnTitle(3));
        System.out.println(getColumnTitle(28));
    }
    public static String getColumnTitle(int n) {
        StringBuilder result = new StringBuilder();

        if(n<=0){
            throw new IllegalArgumentException("Invalid value");
        }

        if(n>0) {
            while (n > 0) {
                int index = (n - 1) % 26;
                result.append((char) (index + 'A'));
                n = (n - 1) / 26;
            }
        }
        return result.reverse().toString();


//        if(num<=0) throw new IllegalArgumentException(Integer.toString(num));
//        String arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//        String result="";
//
//        int n = num;
//
//        int order=-1;
//        while (n!=0) {
//            order = (n-1)%26;
//            n=(n-1)/26;
//            char ch = arr.charAt(order);
//            result = ch + result;
//        }
//
//        return result;
    }
}
