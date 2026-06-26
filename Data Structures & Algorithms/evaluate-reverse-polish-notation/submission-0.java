class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<tokens.length;i++){
            String ch = tokens[i];
            if(!ch.equals("+") &&
         !ch.equals("-") &&
         !ch.equals("*") &&
         !ch.equals("/")){
                stack.push(Integer.parseInt(ch));
            }
            else{
            if(!(stack.isEmpty())){
            int first = stack.pop();
            int second = stack.pop();
            if(ch.equals("+")){
                stack.push(first+second);
            }
            else if(ch.equals("-")){
                stack.push(second-first);
            }
            else if(ch.equals("*")){
                stack.push(first*second);
            }
            else if(ch.equals("/")){
                stack.push(second/first);
            }
            }}
        }
          return stack.pop();
        
    }
    }
