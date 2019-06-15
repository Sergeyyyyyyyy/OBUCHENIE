class MyClass {

    public int addAll(int ... numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + ": get " + sum);
        }
        return sum;
    }


    public static class Test5 {

        public static void main(String[] args) {
            MyClass obj = new MyClass();

            System.out.println(obj.addAll(1,2));
            System.out.println(obj.addAll(1,2,3, 3, 6, 7));
        }
    }
}