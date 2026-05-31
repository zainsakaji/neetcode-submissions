class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> closedToOpen= new HashMap<>();
        Stack<Character> stack= new Stack<>();

        closedToOpen.put(')', '(');
        closedToOpen.put('}', '{');
        closedToOpen.put(']', '[');


        for (Character c: s.toCharArray()){
            //case 1: closed brackets 
            if (closedToOpen.containsKey(c)){
                if (!stack.isEmpty() && stack.peek()==closedToOpen.get(c)){
                    stack.pop();
                }
                else {return false;}
            }
            else {stack.push(c);}
        }

        if (stack.isEmpty())
            return true;
        else 
            return false;
        
    }
}
