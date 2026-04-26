public class ValidParenthesis {
    public boolean isValid(String s) {

        if(s.isEmpty()) return true;
        if(s.length() % 2 !=0) return false; //the opening brackets must be equal to closing brackets so the length of the string must be even

        int len = s.length();
        Stack <Character> stack = new Stack<>();

        for(int i=0; i < len; i++)
        {
            char c = s.charAt(i);

            if(isOpenBracket(c))
                stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!isMatching(top,c))
                    return false;
            }   
        }
        return stack.isEmpty(); //if all characters are popped - i.e matching brackets are found
    }

    public boolean isOpenBracket(char c)
    {
        return c=='(' || c == '{' || c == '[';
    }

    public boolean isMatching(char open, char close)
    {
        if(open == '(' && close == ')') return true;
        if(open == '[' && close == ']') return true;
        if(open == '{' && close == '}') return true;
        else
            return false;
    }
}
