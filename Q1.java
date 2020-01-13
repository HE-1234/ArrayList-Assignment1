import java.util.ArrayList;

class Q1 {
    
    public static ArrayList<String> reverse( ArrayList<String> myList ) {
        ArrayList list1 = new ArrayList<String>();
        int size = myList.size();
        for(int i = size-1; i >= 0; i--){
            list1.add(myList.get(i));
        
        }
        
        return list1;
        
    }
    
    public static void main (String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Why");
        words.add("do");
        words.add("we");
        words.add("fall");
        words.add("Bruce?");
        words.add("So");
        words.add("we");
        words.add("can");
        words.add("learn");
        words.add("to");
        words.add("pick");
        words.add("ourselves");
        words.add("up");
        System.out.println("List forwards reads: " + words);
        System.out.println("List backward reads: " + reverse(words));
    }
    
    
}
