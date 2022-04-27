public class BinOps {

    public void binaryOperation() {
        String sum = sum("101", "111");//5+7
        String mult = mult("1010", "010");//10*2
        System.out.println(sum);
        System.out.println(mult);
    }

    public String sum(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c = a1 + b1;
        String res = Integer.toBinaryString(c);
        sb.append("Результат сложения чисел: ").append(a1).append(" и ").append(b1);
        sb.append("\nРавен: ");
        sb.append(res);
        sb.append("\n");
        return sb.toString();
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    }

    public String mult(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c = a1 * b1;
        String res = Integer.toBinaryString(c);
        sb.append("Результат умножения чисел: ").append(a1).append(" и ").append(b1);
        sb.append("\nРавен: ");
        sb.append(res);
        sb.append("\n");
        return sb.toString();
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
    }
}
