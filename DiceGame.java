class DiceGame {
    public static void main(String args[]){
    int roll4 = GetD4();
    int roll6 = GetD6();
    int roll20 = GetD20();
    System.out.println("Dice Aswner " + roll4);
    System.out.println("Dice Aswner " + roll6);
    System.out.println("Dice Aswner " + roll20);
    
    int n = 1;
    while(n <= 10){
        System.out.println(n);
        n++;
    }
    System.out.println(n);
    }
    



    //for(int i = 0; i < rolls.length; i++) {
        //System.out.println("Number of rolls for the value [" + i + "]: " + rolls[i]);
    //}
//}

    public static int GetD4(){
    return (int)(Math.random()*4)+1;
    }

    public static int GetD6(){
    return (int)(Math.random()*6)+1;
    }    
    public static int GetD20(){
    return (int)(Math.random()*20)+1;    

    }
}
    
