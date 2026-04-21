public class FootballTeamHeightAnalyser {
    public int calculateSumOfHeights(int[] playerHeights) {
        int sumOfHeights = 0;
        for (int index = 0; index < playerHeights.length; index++) {
            sumOfHeights += playerHeights[index];
        }
        return sumOfHeights;
    }

    public double calculateMeanHeight(int[] playerHeights) {
        int sumOfHeights = calculateSumOfHeights(playerHeights);
        return (double) sumOfHeights / playerHeights.length;
    }

    public int findShortestHeight(int[] playerHeights) {
        int shortestHeight = playerHeights[0];
        for (int index = 1; index < playerHeights.length; index++) {
            if (playerHeights[index] < shortestHeight) {
                shortestHeight = playerHeights[index];
            }
        }
        return shortestHeight;
    }

    public int findTallestHeight(int[] playerHeights) {
        int tallestHeight = playerHeights[0];
        for (int index = 1; index < playerHeights.length; index++) {
            if (playerHeights[index] > tallestHeight) {
                tallestHeight = playerHeights[index];
            }
        }
        return tallestHeight;
    }

    public static void main(String[] arguments) {
        int[] playerHeights = new int[11];
        
        for (int index = 0; index < playerHeights.length; index++) {
            playerHeights[index] = (int) (Math.random() * 101) + 150;
        }
        
        FootballTeamHeightAnalyser heightAnalyser = new FootballTeamHeightAnalyser();
        
        int shortestHeight = heightAnalyser.findShortestHeight(playerHeights);
        int tallestHeight = heightAnalyser.findTallestHeight(playerHeights);
        double meanHeight = heightAnalyser.calculateMeanHeight(playerHeights);
        
        System.out.println("The Shortest Height is: " + shortestHeight + " cms");
        System.out.println("The Tallest Height is: " + tallestHeight + " cms");
        System.out.println("The Mean Height is: " + meanHeight + " cms");
    }
}
