public class LightBoard {
    /**
     * The lights on the board, where true represents on and false represents
     * off.
     */
    private boolean[][] lights;

   /** Constructs a LightBoard object having numRows rows and numCols columns.
     *  Precondition: numRows > 0, numCols > 0
     *  Postcondition: each light has a 40% probability of being set to on.
   */
   public LightBoard(int numRows, int numCols)
   {  
        /* to be implemented in part (a) */  
        lights = new boolean[numRows][numCols];

        for(int row = 0; row < lights.length; row++){
            for(int col = 0; col < lights[0].length; col++){
                if(Math.random() < 0.4){
                    lights[row][col] = true;
                }
            }
        }

   }

    /**
     * Evaluates a light in row index row and column index col and returns
     * status as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */

    public boolean evaluateLight(int row, int col) {
        /* to be implemented in part (b) */
        int count = 0;
        for(int r = 0; r < lights.length; r++){
            if(lights[r][col]) count++;
        }

        if(lights[row][col] && count % 2 == 0) return false;
        else if(!lights[row][col] && count % 3 == 0) return false;
        else return lights[row][col];

    }


    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }

}
