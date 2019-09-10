int leastFactorial(int n) {
    int a = 0;
        int b = 1;
        int reus = 0;
        while(true){
            a = factorial(b);
            if (n <= a){
                reus = a;
                break;
            }if(n == 1){
                reus = 1;
                break;
            }
            b += 1;
        }

        return reus;
}

static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
}