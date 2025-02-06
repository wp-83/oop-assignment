public class Map {
    private char map[] = new char[9];
    private int position;
    private int dashedSum = 9;

    public Map(){
        for (int i = 0; i < 9; i++){
            map[i] = '-';
        }
    }

    public int validateLocation(int position){
        if (map[position] != '-'){
            System.out.println("Place is filled! Please input again!");
            return 0;
        } else {
            return 1;
        }
    }

    public void getInput(int position, int player){
        if (player == 0){
            map[position] = 'O';
        } else {
            map[position] = 'X';
        }

        this.position = position;
        dashedSum--;
    }

    public void printMap(){
        for (int i = 0; i < 9; i++){
            if (i % 3 == 0 && i != 0){
                System.out.print("\n");
                System.out.print(map[i] + " ");
            } else {
                System.out.print(map[i]);
                System.out.print(" ");
            }
        }

        System.out.println("\n");
    }

    final int winPos[][] = {
        {0, 1, 2}, //horizontal
        {3, 4, 5}, 
        {6, 7, 8},
        {0, 3, 6}, //vertical
        {1, 4, 7}, 
        {2, 5, 8}, 
        {0, 4, 8}, //diagonal
        {2, 4, 6}
    };

    public int winnerCheck(){
        char check = map[position];
        int countValid = 0;

        for (int i[] : winPos){
            for (int j : i){
                if (map[j] == check){
                    countValid++;
                }
            }

            if (countValid < 3){
                countValid = 0;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public int dash(){
        return dashedSum;
    }
}