import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> completion = new ArrayList<Integer>();
        int cnt = 0;
        
        for(int i = 0; i < progresses.length; i++){
            queue.add(progresses[i]);
        }
        
        int j = 0;
        int pollCount = 0;
        while(!queue.isEmpty()){
            cnt++;
            if((queue.peek() + speeds[j] * cnt) >= 100){
                queue.poll();   //마지막 큐의 작업이 끝나면(예외) 그것도 completion.add
                pollCount++;
                j++;
                cnt--;
                if(queue.isEmpty()){
                    completion.add(pollCount);
                }
            }
            else{
                if(pollCount != 0){
                    completion.add(pollCount);
                }
                pollCount = 0;
            }
        }
        
        answer = new int[completion.size()];
        for(int i = 0; i < completion.size(); i++){
            answer[i] = completion.get(i);
        }
        return answer;
    }
}
