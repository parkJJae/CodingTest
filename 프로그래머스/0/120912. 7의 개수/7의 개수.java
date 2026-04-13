class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 그럼 숫자 배열 인덱스에 있는 숫자 하나씩 꺼내서 비교를 해야겠네
        for(int i=0; i<array.length; i++){
            String strNum = String.valueOf(array[i]);
        for(int j = 0; j<strNum.length(); j++){
            if(strNum.charAt(j) == '7'){
                answer ++;
            }            
        }
        }
        return answer;
    }
}