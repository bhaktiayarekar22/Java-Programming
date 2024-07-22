public class Linear_Search_String {
    public static void main(String[] args) {
        System.out.println("Linear Search - String");
        String name = "kunal";
        char target = 'u';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for (int i = 0; i < str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
            
        }
        return false;
    }

}
