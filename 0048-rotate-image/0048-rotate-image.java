import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        int top=0;
        int bottom = matrix.length;
        int right = matrix[0].length;
        int left =0;
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        

            for(int j =0;j<=bottom-1;j++)
            {
          
        for (int i = bottom-1;i>=0;i--)
        {
        list.add(new ArrayList<Integer>());  
                list.get(j).add(matrix[i][left]);
                
            }
            left++;
      
    }
    for(int i =0;i<=bottom-1;i++)
    {
        for(int j=0;j<=bottom-1;j++)
        {
            matrix[i][j]=list.get(i).get(j);
        }
    }
    System.out.println(bottom);
        
    }
}