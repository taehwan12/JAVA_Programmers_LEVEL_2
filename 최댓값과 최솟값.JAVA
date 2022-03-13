import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numeralString = s.split(" ");
        int[] num = new int[numeralString.length];
        for(int i = 0; i < numeralString.length; i++){
            num[i] = Integer.parseInt(numeralString[i]);
        }
        Arrays.sort(num);
        answer += num[0] + " " + num[num.length - 1];
        return answer;
    }
}
