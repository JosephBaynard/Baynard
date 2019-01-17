class DiceGame {
    public static void main(String args[]){
    int x = GetD4();
    int y = GetD6();
    int z = GetD20();
    System.out.println("Dice Aswner " + x);
    System.out.println("Dice Aswner " + y);

    System.out.println("Dice Aswner " + z);
}
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
    
