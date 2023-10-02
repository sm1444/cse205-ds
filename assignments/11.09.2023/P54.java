public class P54 {
    int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length -1;
        List<Integer> result = new ArrayList<>();
        while(startRow <= endRow && startCol<=endCol)
        {
            //top
            for(int j=startCol;j<=endCol;j++)
            {
                result.add(matrix[startRow][j]);
            }

            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                result.add(matrix[i][endCol]);
            }

            //bottom
            if(startRow<endRow){
                for(int j=endCol-1;j>=startRow;j--)
                {
                    result.add(matrix[endRow][j]);
                }
            }

            //left
            if(startCol<endCol)
            {
                for(int i=endRow-1;i>startRow;i--)
                {
                    result.add(matrix[i][startCol]);
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return result;
}
