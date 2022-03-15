class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fb = new int[n + 1];
        fb[0] = 0;
        fb[1] = 1;
        for(int i = 2; i < n + 1; i++){
            fb[i] = (fb[i - 1] + fb[i - 2]) % 1234567;
            //일반적인 피보나치와 다르게 % 1234567을 같이 한 이유는
            //int 자료형의 범위를 넘어가버리는 것을 방지하기 위함이다
        }
        answer = fb[n] % 1234567;
        return answer;
    }
}
