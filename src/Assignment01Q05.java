public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if(i == j) return 0;
        if(m[i][j] == 1) return 1;

        int n = m.length;
        int head = 0; int tail = 1;
        int[][] Q = new int[n*n][2];
        Q[0][0] = i; Q[0][1] = 0;
        
        int min = n; int curr; int d;
        boolean found = false;
        
        while(head != tail){
            curr = Q[head][0];
            d = Q[head][1];
            head = (head + 1) % (n*n);
            if (d > n || curr == j)  continue;        
            for (int k = 0; k < n; k++){
                if(m[curr][k] == 1){
                    if(k==j){
                        found = true;
                        if (d+1 < min) min = d+1;
                    }
                    else {  
                        Q[tail][0] = k;
                        Q[tail][1] = d + 1;
                        tail = (tail + 1) % (n*n);
                    }
                }                
            }
            
        }
        if (found) return min;
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,1,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1}, {0,0,0,0,0}}, 0, 4)); // 3
        System.out.println(
            findShortestPath(new int[][]{{0,1,1,0,0}, {0,0,1,0,0}, {0,0,0,1,1}, {0,0,1,0,0}, {0,0,0,0,0}}, 0, 4)); // 2
     
    }
}