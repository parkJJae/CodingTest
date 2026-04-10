class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String front = my_string.substring(0,s);
        String middle = my_string.substring(s, e+1);
        String back = my_string.substring(e+1);
        
        for(int i=0; i<middle.length(); i++){
            answer += middle.charAt(e-s-i);
        }
        
        return front+answer+back;
    }
}