import java.util.ArrayList;

class Q2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        int small = nums.get(0);
        int seq = 0;
        for(int i = 0; i < nums.size(); i++){
            
            if (nums.get(i)<small){
                seq = i;
                small = nums.get(i);
            }
        }
        
        nums.remove(seq);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
