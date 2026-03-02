public class LightBoardTester {
    public static void main(String[] args) throws Exception {
        // -------------------------------
        // Test 1: Constructor (Random Board)
        // -------------------------------
        System.out.println("RANDOM BOARD TEST");
        LightBoard randomBoard = new LightBoard(5, 5);
        printBoard(randomBoard);
        System.out.println();

        // -------------------------------
        // Test 2: Controlled Board for evaluateLight
        // -------------------------------
        System.out.println("CONTROLLED BOARD TEST");

        LightBoard testBoard = new LightBoard(7, 5);

        // Manually setting lights for predictable testing
        // Column 0: 3 trues
        // Column 1: 4 trues
        // Column 2: 2 trues
        // Column 3: 6 trues
        // Column 4: 1 true

        boolean[][] preset = {
                { true, true, false, true, false },
                { false, true, true, true, false },
                { true, false, false, true, false },
                { false, true, false, true, false },
                { true, false, true, true, false },
                { false, true, false, true, false },
                { false, false, false, false, true }
        };

        testBoard.setLights(preset); // Requires students to temporarily add a setter
        printBoard(testBoard);

        System.out.println("\nEVALUATE TESTS");

        // Column 0 has 3 trues (divisible by 3)
        System.out.println("evaluateLight(0,0) Expected: true  Actual: "
                + testBoard.evaluateLight(0, 0));

        // Column 1 has 4 trues (even)
        System.out.println("evaluateLight(0,1) Expected: false Actual: "
                + testBoard.evaluateLight(0, 1));

        // Column 2 has 2 trues (even)
        System.out.println("evaluateLight(1,2) Expected: false Actual: "
                + testBoard.evaluateLight(1, 2));

        // Column 4 has 1 true
        System.out.println("evaluateLight(6,4) Expected: true  Actual: "
                + testBoard.evaluateLight(6, 4));
    }

    // Helper method to print the board
    public static void printBoard(LightBoard lb) {
        boolean[][] lights = lb.getLights(); // Requires students to add getter

        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                System.out.print(lights[r][c] + "\t");
            }
            System.out.println();
        }
    }

}
