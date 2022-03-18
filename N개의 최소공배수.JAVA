class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++){
            answer = getLCM(answer, arr[i]);
        }
        return answer;
    }
    public int getGCD(int a, int b){
        if(a % b != 0)
            return getGCD(b, a % b);
        else
            return b;
    }
    public int getLCM(int a, int b){
        return (a * b) / getGCD(a, b);
    }
}
