package Chapter01;

/**
 * 变量学习
 * 1.变量不能使用关键字
 * 2.变量只能由字母,数字,下划线和 $ 开头
 * 3.不能由数字开头
 * 4.必须先声明后使用
 */
public class Variable {
    public static void main(String[] args) {
        //1.声明时就初始化
        int num = 10;
        System.out.println(num);
        //2.声明后再初始化
        int n;
        n = 16;
        System.out.println(n);
        /**
         * + 的使用
         * 1.当 + 号左右两边都是数值时,做加法运算
         * 2.当 + 号左右两边存在字符串时,做拼接运算
         */
        //结果为26Hello num + n 先做加法运算 然后再与"Hello"拼接
        System.out.println(num + n + "Hello");
        //结果为10Hello16 num 与"Hello"拼接 然后再与n拼接
        System.out.println(num + "Hello" + n);
        //结果为Hello1016 "Hello" 与num拼接 然后再与n拼接
        System.out.println("Hello" + num + n);
        //结果为Hello26 ()优先级高,先算(num + n) 然后"Hello"再与n拼接
        System.out.println("Hello" + (num + n));
    }
}
