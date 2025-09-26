class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        if(type==1)
        {
            while(k-->0)
            {
                if(!dq.isEmpty())
                {
                    int x=dq.removeLast();
                    dq.addFirst(x);
                }
            }
        }
        else
        {
            while(k-->0)
            {
                if(!dq.isEmpty())
                {
                    int x=dq.removeFirst();
                    dq.addLast(x);
                }
            }
        }
    }
}