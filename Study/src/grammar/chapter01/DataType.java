package grammar.chapter01;

import java.util.Scanner;

/**
 * 数据类型学习:
 * 1.基本数据类型
 *      数值型:  整数类型 byte(1),short(2),int(4),long(8)
 *              浮点型 float(4),double(8)
 *      字符型:  char()
 *      布尔型:  boolean(1)
 * 2.引用数据类型
 *      类:  class
 *      接口: interface
 *      数组: int[]
 */
public class DataType {
    public static void main(String[] args) {
        //1. 基本数据类型声明定义
        //byte 范围 -2^7 ~ 2^7 - 1 (-128 ~ 127)
        byte b = 1;
        //short 范围 -2^15 ~ 2^15 - 1 (-32768 ~ 32767)
        short s = 2;
        //int 范围 -2^31 ~ 2^31 - 1 (-2147483648 ~ 2147483647)
        int i = 49521;
        //long 范围 -2^63 ~ 2^63 - 1
        //注 ：long类型的变量后需加L或l
        long l = 122L;
        //float 范围 -3.403E+38 ~ 3.403E+38
        //注 ：float类型的变量后需加F或f
        float f = 3.6f;
        //double 范围 -1.798E+308 ~ 1.798E+308
        double d = 6.452;
        //浮点数也可以用科学计数法表示
        float f1 = 1.35E3f;//表示1.35 * 10^3 即1350.0
        double d1 = 1.3564E3;//表示1.3564 * 10^3 即1356.4
        //char 可以存放字符,汉字,转义字符 用单引号
        char c = 'q';
        char c1 = '\t';
        char c2 = '哈';
        //2.从键盘输入数据并显示
        //首先创建Scanner对象 new 关键字表示创建
        Scanner scanner = new Scanner(System.in);
        //然后用scanner从键盘读入数据 .操作符表示调用
        byte b1 = scanner.nextByte();
        short s1 = scanner.nextShort();
        int i1 = scanner.nextInt();
        long l1 = scanner.nextLong();
        float f2 = scanner.nextFloat();
        double d2 = scanner.nextDouble();
        char ch = scanner.next().charAt(0);
        //输出语句
        System.out.println(b1 + " " + s1 + " " + f2 + " " + ch);
    }
}
