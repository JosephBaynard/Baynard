class function {
    static int GradYear = 2021;
    static int Age = 16;
    static int CurrentYear = 2018;

    public static void main(String args[]) {
    int x = computeGradAge(GradYear, Age);
    outPutGradAge(x);
    }

    public static int computeGradAge (int gradYear, int Age) {
    
     int CalculatedGradAge = (gradYear - CurrentYear) + Age;

    return CalculatedGradAge;
    }

    public static void outPutGradAge (int gradAge) {
        System.out.println("I will be " + gradAge + " when I Graduate");
    }
}                                                                               
