class GradClass {
    static int CurrentYear = 2018;
    static int Age = 16;

    public static void main(String args[]) {
    int x = computeGradAge(CurrentYear, Age);

    outPutGradAge(x);
    }

    public static int computeGradAge (int gradYear, int Age){
    int CalculatedGradYear;
     CalculatedGradYear = (gradYear - CurrentYear) + Age;

    return gradYear;
    }

    public static void outPutGradAge (int gradYear) {
        System.out.println("I will be 18" + gradYear + "when I Graduate");
    }
}


"function.java" 23 lines, 523 characters

