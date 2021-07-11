package RemoveAnchorFromURL;

//Complete the function/method so that it returns the url with anything after the anchor (#) removed.
//
//        Examples
//
//// returns 'www.codewars.com'
//        removeUrlAnchor('www.codewars.com#about')
//
//// returns 'www.codewars.com?page=1'
//        removeUrlAnchor('www.codewars.com?page=1')

public class RemoveAnchorFromURL {
    public static void main(String[] args) {
        System.out.println(remove("www.codewars.com#about"));
        System.out.println(remove("www.codewars.com/katas/?page=1#about"));
        System.out.println(remove("www.codewars.com/katas/"));
    }
    public static String remove(String s){
        s = s.replaceAll("\\#.*$", "");

        return s;
    }
}
