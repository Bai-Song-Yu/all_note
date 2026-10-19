import java.util.Scanner;//import是导入某个类的语句，必须放到Java源代码的开头
import java.util.Arrays;//导入Arrays类，Arrays类是一个工具类，提供了很多操作数组的方法

public class Note { //class是类的关键字，note是类名，public是访问修饰符，表示该类可以被其他类访问
    public static void main(String[] args) { //主方法，程序的入口，首先从此处开始运行   static是静态的，表示该方法可以直接通过类名调用，void是返回类型，表示该方法没有返回值，String[] args是参数，表示命令行参数
        System.out.println("Hello, World!"); //输出Hello, World!    system是系统类，out是输出流，println是打印方法

        //Java程序的入口是main方法，而main方法可以接受一个命令行参数，它是一个String[]数组。
        //这个命令行参数由JVM接收用户输入并传给main方法
        
        for (String arg : args) {//for是循环关键字，String是字符串类型，arg是变量名，args是数组名，:是分隔符，表示遍历数组args中的每个元素，并将其赋值给变量arg
            System.out.println(arg);//输出命令行参数arg的值
        }
        //我们可以利用接收到的命令行参数，根据不同的参数执行不同的代码。例如，实现一个-version参数，打印程序版本号
        for (String arg : args) {
            if ("-version".equals(arg)) {//equals是字符串方法，表示判断两个字符串是否相等，"-version"是字符串常量，arg是变量，表示判断arg是否等于-version
                System.out.println("v 1.0");//输出版本号,内容为v 1.0
                break;
            }
        }
        //上面这个程序必须在命令行执行，我们先编译它
        //然后，执行的时候，给它传递一个-version参数
        //$ java Main -version      这是命令行执行的语句
        //v 1.0     这是终端返回的值
    }
    //单行注释
    /* 
    多行注释 
    */

    /**
     * 另类多行注释方式
     * 写在类和方法的定义上面，通常用于生成文档
     */

    public static void Note_1(String[] args) { //方法定义，note_1是方法名，public是访问修饰符，static是静态的，void是返回类型，表示该方法没有返回值
        System.out.println("这是一个方法"); //输出这是一个方法
        int a = 10; //定义一个整型变量a，赋值为10,不写初始值，默认值为0
        int x = 1_000_000; //定义一个整型变量x，赋值为1000000，使用下划线分隔数字，提高可读性
        long b = 100L; //定义一个长整型变量b，赋值为100L，L表示长整型
        float c = 10.5f; //定义一个单精度浮点型变量c，赋值为10.5f，f表示单精度浮点型
        double d = 10.5; //定义一个双精度浮点型变量d，赋值为10.5
        boolean e = 8 > 9; //定义一个布尔型变量e，赋值为8大于9的比较结果,java中布尔类型只有true和false两种值
        char f = 'A'; //定义一个字符型变量f，赋值为字符A(单字符型)，字符型用单引号表示,可以表示ASCII码表中的字符,也可以表示Unicode码表中的字符
        String g = "Hello"; //定义一个字符串型变量g，赋值为Hello(字符串型)，字符串型用双引号表示,可以表示多个字符组成的字符串
        System.out.println(a); //输出变量a的值
        System.out.println(x); //输出变量x的值
        System.out.println(b); //输出变量b的值
        System.out.println(c); //输出变量c的值
        System.out.println(d); //输出变量d的值
        System.out.println(e); //输出变量e的值
        System.out.println(f); //输出变量f的值
        System.out.println(g); //输出变量g的值
        /*
        整数类型: byte字节,表达范围(-128到127)     short短整型,表达范围(-32768到32767)     int整型,表达范围(-2147483648到2147483647)     long长整型,表达范围(-9223372036854775808到9223372036854775807)
        浮点类型: float单精度浮点型,表达范围(-3.4028235E38到3.4028235E38)    double双精度浮点型,表达范围(-1.7976931348623157E308到1.7976931348623157E308)
        字符类型: char字符型
        布尔类型: boolean布尔型
        */
        final int H = 10; //定义一个常量H，赋值为10，final表示该变量是常量，不能被修改，常量命名通常大写！
        System.out.println(H); //输出变量H的值

        //StringBuilder sb = new StringBuilder();
        var SB = new StringBuilder(); //使用var关键字定义一个变量SB，类型由编译器推断为StringBuilder，var是Java 10引入的关键字，用于局部变量类型推断
    }
    public static void Note_2(String[] args) { //方法定义，note_2是方法名，public是访问修饰符，static是静态的，void是返回类型，表示该方法没有返回值
        int i = (100 + 200) * (99 - 88); //定义一个整型变量i，赋值为(100 + 200) * (99 - 88)，使用括号改变运算顺序
        int y = 12345 % 67; //定义一个整型变量y，赋值为12345 % 67，%是取模运算符，表示取余数
        //运算优先级:()
        //! ~ ++ --
        //* / %
        //+ -
        //<< >> >>>
        //  &
        //  |
        //+= -=  *=  /=  
        //计算结果如果超出范围会得到奇怪的结果
        int n = 10; //定义一个整型变量n，赋值为10
        n++; //自增运算符，表示n = n + 1,也可以写成n += 1
        n--; //自减运算符，表示n = n - 1,也可以写成n -= 1
    }
    public static void Note_3(String[] args) {
        //在运算过程中，如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
        short y = (short)(s + i); //强制类型转换
        
        //强制类型转换，表示将一个类型的变量转换为另一个类型的变量，可能会丢失精度或溢出,例如，将int强制转型为short：
        //int i = 12345;
        //short s = (short) i; 强制类型转换
        //要注意，超出范围的强制转型会得到错误的结果，原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节。因此，强制转型的结果很可能是错的。
        //应该选择合适范围的整型（int或long），没有必要为了节省内存而使用byte和short进行整数运算。


        //浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
        //在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
        //所以，浮点数运算的结果往往是近似值，而不是精确值。（会有误差）
        //由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
        
        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
        // 可以认为相等
        } else {
        // 不相等
        }
        

        //如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
        //需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。例如：
        double d = 1.2 + 24 / 5; // 结果不是 6.0 而是 5.2
        //计算结果为5.2，原因是编译器计算24 / 5这个子表达式时，按两个整数进行运算，结果仍为整数4。
        //要修复这个计算结果，可以将24 / 5改为24.0 / 5。由于24.0是浮点数，因此，计算除法时自动将5提升为浮点数。
        double e = 1.2 + 24.0 / 5; // 结果是 6.0
        
        //整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        //实际用不到，只需了解

        //可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值
        int n1 = (int) 12.3; // 12
        //如果要进行四舍五入，可以对浮点数加上0.5再强制转型

        //对于布尔类型boolean，永远只有true和false两个值。
        //布尔运算是一种关系运算，包括以下几类：
        //比较运算符：>，>=，<，<=，==，!=
        //与运算 &&     两边都真才为真
        //或运算 ||     一边为真就为真
        //非运算 !      取反
        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true
        //关系运算符从低到高的优先级
        // !
        // >，>=，<，<=
        // ==，!=
        // &&
        // ||

        //布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0); // 此处 5 / 0 不会报错
        System.out.println(result);
        //因为false && x的结果总是false，无论x是true还是false，因此，与运算在确定第一个值为false后，不再继续计算，而是直接返回false。

        //java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果。示例
        int n = -100;
        int z = n >= 0 ? n : -n;
        System.out.println(z);
        //上述语句的意思是，判断n >= 0是否成立，如果为true，则返回n，否则返回-n。这实际上是一个求绝对值的表达式。此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一
        
        //和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：
        String q = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
        String s4 = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z     借助转义字符/来表示字符串中包含双引号
        //  \" 表示字符"
        //  \' 表示字符'
        //  \\ 表示字符\
        //  \n 表示换行符
        //  \r 表示回车符
        //  \t 表示Tab
        //  \u1234 表示一个Unicode编码的字符

        //可以使用+连接任意字符串和其他数据类型
        String s7 = "Hello";
        String s8 = "world";
        String s9 = s7 + " " + s8 + "!";
        System.out.println(s9); // Hello world!
        //如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接

        //从Java 13开始，字符串可以用"""..."""表示多行字符串
        String s10 = """
                       这是一个多行字符串
                       可以包含任意数量的行
                       """;
                       //字符串为3行,后面有个\n
        System.out.println(s10);
        String s11 = """
                       这是一个多行字符串
                       可以包含任意数量的行""";
                       //字符串为2行,后面没有\n
        System.out.println(s11);

        //多行字符串前面共同的空格会被去掉
        //如果多行字符串的排版不规则，前面共同的空格会被去掉，剩下的空格会保留      即总是以最短的行首空格为基准。
        //字符串不可变,重新定义的只是引用，原来的字符串对象仍然存在于内存中，直到没有任何引用指向它时，才会被垃圾回收机制回收。

        //引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象
        String s5 = null; // s5是null
        String s6 = s5; // s6也是null
        String a1 = ""; // a1指向空字符串，不是null

        //注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null
    }

    public static void Note_4 (String[] args) {
        int[] ns = new int[5];//定义一个整型数组ns，长度为5，数组的下标从0开始，到4结束
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        //定义一个数组类型的变量，使用数组类型“类型[]”
        //数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组

        //数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
        //数组一旦创建后，大小就不可改变。

        //要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。
        //可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 80,表示将数组ns的第2个元素修改为80。
        int[] na = new int[5];
        System.out.println(ns.length); //输出数组ns的长度，即5

        //数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错

        //也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。
        int[] bs = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns.length); // 编译器自动推算数组大小为5
        int[] qs = { 68, 79, 91, 85, 62 };// 也可以省略new int[]，直接使用{}初始化数组
        
        String[] names = {
        "ABC", "XYZ", "zoo"
        };// 也可以定义一个字符串数组，使用{}初始化数组
    }

    public static void Note_5 (String[] args) {
        //在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。
        //println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()
        System.out.print("Hello, ");//输出Hello
        
        //Java还提供了格式化输出的功能。为什么要格式化输出？因为计算机表示的数据不一定适合人来阅读（按照指定的模板，把数据转换成指定的字符串）
        double d = 12900000;
        System.out.println(d);  // 1.29E7
        //如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式：
        double dc = 3.1415926;
        System.out.printf("%.2f\n", dc); // 显示两位小数3.14
        System.out.printf("%.4f\n", dc); // 显示4位小数3.1416
        //  %d      格式化输出整数
        //  %x      格式化输出16进制整数
        //  %f      格式化输出浮点数
        //  %e      格式化输出科学计数法表示的浮点数
        //  %s      格式化字符串

        //由于%表示占位符，因此，连续两个%%表示一个%字符本身

        //占位符本身还可以有更详细的格式化参数
        }
    

    public static void Note_6 (String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象    scanner是变量名，可改   System.in是标准输入流（键盘输入）   new Scanner()是创建扫描器
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出

        //创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。
        //直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
        //有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
    }
    
    public static void Note_7 (String[] args) {
          int n = 70;
        if (n >= 60) {//if是条件语句，表示如果n大于等于60，则执行大括号内的代码
            System.out.println("及格了");
        }
        System.out.println("END");
        //当if语句块只有一行语句时，可以省略花括号{}：  但不建议

        //if语句还可以编写一个else { ... }，当条件判断为false时，将执行else的语句块：
        if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
        //还可以用多个if ... else if ...串联。
         if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
        //判断浮点数相等用==判断不靠谱
        //正确的方法是利用差值小于某个临界值来判断
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }

        // 在Java中，判断值类型的变量是否相等，可以使用==运算符。
        // 但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
        // 例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();//toLowerCase()是字符串方法，表示将字符串转换为小写字母
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        //要判断引用类型的变量内容是否相等，必须使用equals()方法
        if (s1.equals(s2)) {//equals()是字符串方法，表示判断两个字符串是否相等
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        //注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException
        //要避免NullPointerException错误，可以利用短路运算符&&
        
        //  String s1 = null;
        //  if (s1 != null && s1.equals("hello")) {
        //      System.out.println("hello");
        //  }

        //还可以把一定不是null的对象"hello"放到前面：例如：if ("hello".equals(s)) { ... }

        //switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行
        int option = 1;
        switch (option) {
        case 1:
            System.out.println("Selected 1");
            break;
        case 2:
            System.out.println("Selected 2");
            break;
        case 3:
            System.out.println("Selected 3");
            break;
        default:
            System.out.println("Selected other");
            break;
        }
        //如果option的值没有匹配到任何case，例如option = 99，那么，switch语句不会执行任何语句。这时，可以给switch语句加一个default，当没有匹配到任何case时，执行default
        //使用switch时，注意case语句并没有花括号{}，而且，case语句具有“穿透性”，漏写break将导致意想不到的结果

        //switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”
        String fruit = "apple";
        switch (fruit) {
        case "apple":
            System.out.println("Selected apple");
            break;
        case "pear":
            System.out.println("Selected pear");
            break;
        case "mango":
            System.out.println("Selected mango");
            break;
        default:
            System.out.println("No fruit selected");
            break;
        }
        //switch语句还可以使用枚举类型

        //从Java 12开始，switch语句升级为更简洁的表达式语法，使用类似模式匹配（Pattern Matching）的方法，保证只有一种路径会被执行，并且不需要break语句
        switch (fruit) {
        case "apple" -> System.out.println("Selected apple");
        case "pear" -> System.out.println("Selected pear");
        case "mango" -> {
            System.out.println("Selected mango");
            System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }
        //注意新语法使用->，如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应

        //很多时候，我们还可能用switch语句给某个变量赋值
        int opt;
        switch (fruit) {
            case "apple":
            opt = 1;
            break;
            case "pear":
            case "mango":
            opt = 2;
            break;
            default:
            opt = 0;
            break;
        }

        int opd = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opd = " + opd);

        //如果需要复杂的语句，我们也可以写很多语句，放到{...}里，然后，用yield返回一个值作为switch语句的返回值
        int opa = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch语句返回值
            }
        };  //赋值语句记得加分号
    }

    public static void Note_8 (String[] args) {
        //while循环在每次循环开始前，首先判断条件是否成立。如果计算结果为true，就把循环体内的语句执行一遍，如果计算结果为false，那就直接跳到while循环的末尾，继续往下执行
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            sum = sum + n; // 把n累加到sum中
            n ++; // n自身加1
        }
        System.out.println(sum); // 5050

        //while循环是先判断循环条件，再循环，因此，有可能一次循环都不做
        //对于循环条件判断，以及自增变量的处理，要特别注意边界条件

        //如果循环条件永远满足，那这个循环就变成了死循环。死循环将导致100%的CPU占用，用户会感觉电脑运行缓慢，所以要避免编写死循环代码。
        //如果循环条件的逻辑写得有问题，也会造成意料之外的结果

        //do while循环是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出
        //do while循环会至少循环一次
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);

        //for循环的功能非常强大，它使用计数器实现循环。for循环会先初始化计数器，然后，在每次循环前检测循环条件，在每次循环后更新计数器。计数器变量通常命名为i
        for (int i=1; i<=100; i++) {//
            sum = sum + i;
        }
        System.out.println(sum);

        //for (初始条件; 循环检测条件; 循环后更新计数器) {
        //  执行语句
        //}

        //注意for循环的初始化计数器总是会被执行，并且for循环也可能循环0次
        //使用for循环时，千万不要在循环体内修改计数器！在循环体中修改计数器常常导致莫名其妙的逻辑错误。
        //使用for循环时，计数器变量i要尽量定义在for循环中
        //for循环还可以缺少初始化语句、循环条件和每次循环更新语句
        
        //  for (;;) {
            // 什么都不设置     因为会报错所以注释掉了
        //  }
        
        //通常不推荐这样写，但是，某些情况下，是可以省略for循环的某些语句的

        //Java还提供了另一种for each循环，它可以更简单地遍历数组
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int b : ns) {  //b是数组ns的每个元素，循环会依次把数组ns的每个元素赋值给b，然后执行循环体内的语句
            System.out.println(b);
        }
        //和for循环相比，for each循环的变量n不再是计数器，而是直接对应到数组的每个元素。for each循环的写法也更简洁。但是，for each循环无法指定遍历顺序，也无法获取数组的索引
        //除了数组外，for each循环能够遍历所有“可迭代”的数据类型，包括后面会介绍的List、Map等

        //在循环过程中，可以使用break语句跳出当前循环。
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }// break语句会跳出当前循环，继续执行循环后面的语句
        System.out.println(sum);
        //使用for循环计算从1到100时，我们并没有在for()中设置循环退出的检测条件。但是，在循环内部，我们用if判断，如果i==100，就通过break退出循环。
        //因此，break语句通常都是配合if语句使用。要特别注意，break语句总是跳出自己所在的那一层循环

        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("breaked");
            
            //上面的代码是两个for循环嵌套。因为break语句位于内层的for循环，因此，它会跳出内层for循环，但不会跳出外层for循环

            //break会跳出当前循环，也就是整个循环都不会执行了。而continue则是提前结束本次循环，直接继续执行下次循环
        }
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
                }
            sum = sum + i;
            System.out.println("end i = " + i);
            }
        System.out.println(sum); // 25
        //注意观察continue语句的效果。当i为奇数时，完整地执行了整个循环，因此，会打印begin i=1和end i=1。在i为偶数时，continue语句会提前结束本次循环，因此，会打印begin i=2但不会打印end i=2
        //在多层嵌套的循环中，continue语句同样是结束本次自己所在的循环
    }

    public static void Note_9 (String[] arge) {
        //通过for循环就可以遍历数组。因为数组的每个元素都可以通过索引来访问，因此，使用标准的for循环可以完成一个数组的遍历
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {//ns.length是数组ns的长度，i<ns.length表示循环条件，i++表示每次循环后i自增1
            int n = ns[i];
            System.out.println(n);
        }
        //为了实现for循环遍历，初始条件为i=0，因为索引总是从0开始，继续循环的条件为i<ns.length，因为当i=ns.length时，i已经超出了索引范围（索引范围是0 ~ ns.length-1），每次循环后，i++

        //第二种方式是使用for each循环，直接迭代数组的每个元素
        for (int n : ns) {
            System.out.println(n);
        }
        //注意：在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引。
        //显然for each循环更加简洁。但是，for each循环无法拿到数组的索引，因此，到底用哪一种for循环，取决于我们的需要
        
        //直接打印数组变量，得到的是数组在JVM中的引用地址
        System.out.println(ns); // 类似 [I@7852e922
        //这并没有什么意义，因为我们希望打印的数组的元素内容。因此，使用for each循环来打印它
        for (int n : ns) {
            System.out.print(n + ", ");
        }
        //使用for each循环打印也很麻烦。幸好Java标准库提供了Arrays.toString()，可以快速打印数组内容
        //记得导入java.util.Arrays类
        System.out.println(Arrays.toString(ns)); // 打印内容为 [1, 4, 9, 16, 25]
        
        //使用冒泡排序算法对一个整型数组从小到大进行排序
        
        int[] as = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(as));
        for (int i = 0; i < as.length - 1; i++) {// 外层循环控制排序趟数
            for (int j = 0; j < as.length - i - 1; j++) {// 内层循环控制每一趟排序的比较次数
                if (as[j] > as[j+1]) {
                    // 交换as[j]和as[j+1]:
                    int tmp = as[j];
                    as[j] = as[j+1];
                    as[j+1] = tmp;
                }// 交换后，数组中较大的元素会被“冒泡”到数组的末尾
            }// 内层循环结束后，最大的元素已经被放到数组的末尾，因此，下一趟排序时，可以少比较一次
        }// 外层循环结束后，整个数组已经被排序完成
        // 排序后:
        System.out.println(Arrays.toString(as));
        //冒泡排序的特点是，每一轮循环后，最大的一个数被交换到末尾，因此，下一轮循环就可以“刨除”最后的数，每一轮循环都比上一轮循环的结束位置靠前一位
        //实际上，Java的标准库已经内置了排序功能，我们只需要调用JDK提供的Arrays.sort()就可以排序
        Arrays.sort(as);
        System.out.println(Arrays.toString(as)); // 排序后: [8, 12, 18, 28, 36, 50, 65, 73, 89, 96]
        //必须注意，对数组排序实际上修改了数组本身
    }

    public static void Note_10 (String[] args) {
        //二维数组就是数组的数组。定义一个二维数组如下
        int[][] ns = {//定义一个二维整型数组ns，包含3行4列
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(ns.length); // 3
        //因为ns包含3个数组，因此，ns.length为3

        //如果我们定义一个普通数组arr0，然后把ns[0]赋值给它
        //实际上arr0就获取了ns数组的第0个元素。因为ns数组的每个元素也是一个数组，因此，arr0指向的数组就是{ 1, 2, 3, 4 }
        int[] arr0 = ns[0];
        System.out.println(arr0.length); // 4

        //访问二维数组的某个元素需要使用array[row][col]
        System.out.println(ns[1][2]); // 7

        //二维数组的每个数组元素的长度并不要求相同
        int[][] cs = {
            { 1, 2, 3, 4 },
            { 5, 6 },
            { 7, 8, 9 }
        };

        //要打印一个二维数组，可以使用两层嵌套的for循环
        for (int[] arr : cs) {// 外层循环遍历二维数组的每个一维数组
            for (int n : arr) {// 内层循环遍历一维数组的每个元素
                System.out.print(n);
                System.out.print(',');
            }
            System.out.println();
        }

        //或者使用Java标准库的Arrays.deepToString()    注意，与Arrays.toString()不同，Arrays.deepToString()可以打印多维数组
        System.out.println(Arrays.deepToString(cs)); // [[1, 2, 3, 4], [5, 6], [7, 8, 9]]

        //三维数组就是二维数组的数组。可以这么定义一个三维数组
        int[][][] bs = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11},
                {12, 13}
            },
            {
                {14, 15, 16},
                {17, 18}
            }
        };
        //如果我们要访问三维数组的某个元素，例如，bs[2][0][1]，只需要顺着定位找到对应的最终元素15即可
        //理论上，我们可以定义任意的N维数组。但在实际应用中，除了二维数组在某些时候还能用得上，更高维度的数组很少使用
    }

    public static void Note_11 (String[] args) {
        //Java是一种面向对象的编程语言。面向对象编程，英文是Object-Oriented Programming，简称OOP。
        // 和面向对象编程不同的，是面向过程编程。面向过程编程，是把模型分解成一步一步的过程。比如，老板告诉你，要编写一个TODO任务，必须按照以下步骤一步一步来：
        // 读取文件；
        // 编写TODO；
        // 保存文件。

        //而面向对象编程，顾名思义，你得首先有个对象
        //有了对象后，就可以和对象进行互动
        GirlFriend gf = new GirlFriend();//创建一个GirlFriend对象，gf是对象的引用变量
        gf.name = "Alice";//给对象的name属性赋值为Alice
        gf.send("flowers");//调用对象的send方法，传入参数flowers

        //因此，面向对象编程，是一种通过对象的方式，把现实世界映射到计算机模型的一种编程方法

        //在Java中，创建一个类，例如，给这个类命名为Person，就是定义一个class
        class Person {
            public String name;//定义一个字符串类型的属性name，表示人的名字
            public int age;//定义一个整型属性age，表示人的年龄
        }
        //一个class可以包含多个字段（field），字段用来描述一个类的特征。
        // 上面的Person类，我们定义了两个字段，一个是String类型的字段，命名为name，一个是int类型的字段，命名为age。因此，通过class，把一组数据汇集到一个对象上，实现了数据封装
        //public是用来修饰字段的，它表示这个字段可以被外部访问

        //定义了class，只是定义了对象模版，而要根据对象模版创建出真正的对象实例，必须用new操作符。
        //new操作符可以创建一个实例，然后，我们需要定义一个引用类型的变量来指向这个实例
        
        Person ming = new Person();//创建一个Person对象，ming是对象的引用变量

        //上述代码创建了一个Person类型的实例，并通过变量ming指向它。
        //注意区分Person ming是定义Person类型的变量ming，而new Person()是创建Person实例
        //有了指向这个实例的变量，我们就可以通过这个变量来操作实例。访问实例变量可以用变量.字段
        ming.name = "Xiao Ming"; // 对字段name赋值
        ming.age = 12; // 对字段age赋值
        System.out.println(ming.name); // 访问字段name
        Person hong = new Person();//创建一个Person对象，hong是对象的引用变量
        hong.name = "Xiao Hong";
        hong.age = 15;
        //两个instance拥有class定义的name和age字段，且各自都有一份独立的数据，互不干扰
        //一个Java源文件可以包含多个类的定义，但只能定义一个public类，且public类名必须与文件名一致。如果要定义多个public类，必须拆到多个Java源文件中

        //一个class可以包含多个field
        //但是，直接把field用public暴露给外部可能会破坏封装性

        //直接操作field，容易造成逻辑混乱。为了避免外部代码直接去访问field，我们可以用private修饰field，拒绝外部访问
        //把field从public改成private，外部代码不能访问这些field，那我们定义这些field有什么用？怎么才能给它赋值？怎么才能读取它的值？
        
        //所以我们需要使用方法（method）来让外部代码可以间接修改field

        class Person {
            private String name;
            private int age;

            public String getName() {
                return this.name;
            }//getName()方法是用来获取name字段的值,方法名通常以get开头，后面跟上字段名，首字母大写

            public void setName(String name) {//
                this.name = name;
            }//setName()方法是用来设置name字段的值

            public int getAge() {
            return this.age;//this关键字表示当前对象的引用，this.age表示当前对象的age字段
            }//getAge()方法是用来获取age字段的值

            public void setAge(int age) {
                if (age < 0 || age > 100) {
                    throw new IllegalArgumentException("invalid age value");//抛出异常，表示age的值不合法
                }
                this.age = age;
            }//setAge()方法是用来设置age字段的值，并且对age的值进行合法性检查
        }
        //虽然外部代码不能直接修改private字段，但是，外部代码可以调用方法setName()和setAge()来间接修改private字段
        //在方法内部，我们就有机会检查参数对不对。比如，setAge()就会检查传入的参数，参数超出了范围，直接报错。这样，外部代码就没有任何机会把age设置成不合理的值
        
        //对setName()方法同样可以做检查，例如，不允许传入null和空字符串
        
        // public void setName(String name) {
        //     if (name == null || name.isBlank()) {
        //         throw new IllegalArgumentException("invalid name");
        //     }
        //     this.name = name.strip(); // 去掉首尾空格
        // }

        //同样，外部代码不能直接读取private字段，但可以通过getName()和getAge()间接获取private字段的值
        //所以，一个类通过定义方法，就可以给外部代码暴露一些操作的接口，同时，内部自己保证逻辑一致性
        //调用方法的语法是实例变量.方法名(参数);。一个方法调用就是一个语句，所以不要忘了在末尾加;。例如：ming.setName("Xiao Ming");

        //定义方法的语法是
        // 修饰符 方法返回类型 方法名(方法参数列表) {
        //     若干方法语句;
        //     return 方法返回值;
        // }

        //方法返回值通过return语句实现，如果没有返回值，返回类型设置为void，可以省略return

        //有public方法，自然就有private方法。和private字段一样，private方法不允许外部调用
        //定义private方法的理由是内部方法是可以调用private方法

        class Person {
            private String name;
            private int birth;

            public void setBirth(int birth) {
            this.birth = birth;
            }

            public int getAge() {
                return calcAge(2019); // 调用private方法，private方法可用范围为当前类的所有方法
            }

            // private方法:
            private int calcAge(int currentYear) {// calcAge()方法是用来计算年龄的，传入当前年份作为参数
                return currentYear - this.birth;// calcAge()方法返回当前年份减去出生年份的差值，即年龄
            }
        }
        //calcAge()是一个private方法，外部代码无法调用，但是，内部方法getAge()可以调用
        //此外，我们还注意到，这个Person类只定义了birth字段，没有定义age字段
        // 获取age时，通过方法getAge()返回的是一个实时计算的值，并非存储在某个字段的值。这说明方法可以封装一个类的对外接口，调用方不需要知道也不关心Person实例在内部到底有没有age字段

        //在方法内部，可以使用一个隐含的变量this，它始终指向当前实例(field)。因此，通过this.field就可以访问当前实例的字段
        //如果没有命名冲突，可以省略this
        class Person {
            private String name;

            public String getName() {
                return name; // 相当于this.name
            }
        }
        //但是，如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this

        class Person {
            private String name;

            public void setName(String name) {
                this.name = name; // 前面的this不可少，少了就变成局部变量name了
            }
        }

        //方法可以包含0个或任意个参数。方法参数用于接收传递给方法的变量值。调用方法时，必须严格按照参数的定义一一传递
        class Person {
            //...
            public void setNameAndAge(String name, int age) {// setNameAndAge()方法有两个参数，分别是String类型的name和int类型的age
                //...
            }
        }
        //调用这个setNameAndAge()方法时，必须有两个参数，且第一个参数必须为String，第二个参数必须为int

        Person xing = new Person();
        // xing.setNameAndAge("Xiao Ming");     编译错误：参数个数不对
        // xing.setNameAndAge(12, "Xiao Ming");     编译错误：参数类型不对

        //可变参数用类型...定义，可变参数相当于数组类型

        class Group {
            private String[] names;

            public void setNames(String... names) {// setNames()方法有一个可变参数names，类型为String
                this.names = names;
            }
        }
        //上面的setNames()就定义了一个可变参数。调用时，可以这么写
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
        g.setNames("Xiao Ming"); // 传入1个String
        g.setNames(); // 传入0个String

        //完全可以把可变参数改写为String[]类型
        class Group {
            private String[] names;

            public void setNames(String[] names) {// setNames()方法有一个参数names，类型为String数组
                this.names = names;
            }
        }
        //但是，调用方需要自己先构造String[]，比较麻烦
        Group a = new Group();
        a.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]

        //另一个问题是，调用方可以传入null
        Group b = new Group();
        b.setNames(null);
        //而可变参数可以保证无法传入null，因为传入0个参数时，接收到的实际值是一个空数组而不是null

        //调用方把参数传递给实例方法时，调用时传递的值会按参数位置一一绑定
        class Person {
            private int age;

            public int getAge() {
                return this.age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        Person p = new Person();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20?
    
        //运行代码，从结果可知，修改外部的局部变量n，不影响实例p的age字段，原因是setAge()方法获得的参数，复制了n的值，因此，p.age和局部变量n互不影响

        //结论：基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响

        Person c = new Person();
        String[] fullname = new String[] { "Homer", "Simpson" };//
        c.setName(fullname); // 传入fullname数组
        System.out.println(c.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(c.getName()); // "Homer Simpson"还是"Bart Simpson"?  结果是 "Bart Simpson"
        //运行代码，从结果可知，修改外部的fullname数组，影响了实例

        class Person {
            private String[] name;

            public String getName() {
                return this.name[0] + " " + this.name[1];
            }

            public void setName(String[] name) {
                this.name = name;
            }
        }

        //注意到setName()的参数现在是一个数组。一开始，把fullname数组传进去，然后，修改fullname数组的内容，结果发现，实例p的字段p.name也被修改了！

        //结论：引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）

        Person d = new Person();
        String bob = "Bob";
        d.setName(bob); // 传入bob变量
        System.out.println(d.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(d.getName()); // "Bob"还是"Alice"?   结果是 "Bob"
        //运行代码，从结果可知，修改外部的局部变量bob，不影响实例d的name字段，原因是setName()方法获得的参数，复制了bob的值，因此，d.name和局部变量bob互不影响

        class Person {
            private String name;

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

    }
}


