package com.jackpotHan.demo
/**
 *
 * @Author: Hanjt
 * @Date: 2018/7/17 10:22
 * @Description:
 *
 *
 */
class HelloWorld {
   static void main(args) {
       println "Hello World!!Groovy"
       println '------------------'

       def map = [:]

       map."an identifier with a space and double quotes" = "ALLOWED"
       map.'with-dash-signs-and-single-quotes' = "ALLOWED"

       /**
        * assert 断言
        * groovy和java中的作用都是一样的，验证假设条件是否为真。
        * 如果条件为真，不做任何提示
        * 如果条件为假，这抛出java.lang.AssertionError异常。
        */
       assert map."an identifier with a space and double quotes" == "ALLOWED"
       assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"
//
//       assert 1==2: "One is not Two"
//       assert "1==2"=="One is not Two"
       assert new File('HelloWorld.txt')!=new File('Hello.txt')
       println map

       println "----------------------------"
       println "ab"=="a"+"b"
       println "----------------------------"
       println 'ab'=='a'+'b'

       /**
        * 单行字符串可以用单引号或双引号包围，但是两者是有区别的。
        * 单引号包围的表达式，里面的字符串插值是不会被识别的。双引号包围的表达式正好相反。
        */
       def name1 = "LiSir"
       def s1 = 'Hello $name1'//单引号的插入值是不会被识别的
       println s1
       println '----------------------------'
       println name1.class

       def name2 = "LiSir"
       /**
        * 可以在${}内包含任意有效的Groovy表达式，可以是方法调用或变量名。
        * 如果内嵌的变量只是占位符，那么可以省略{}花括号。
        */
//       String s2 = "Hello ${name2}"
       def s2 = "Hello $name2"//双引号的插入值会被识别
       println s2

       /**
        * Groovy中一切皆对象,即使最初我们定义的数据类型为基础数据类型
        */
       println '---------------------'
       println 'Groovy中一切皆对象'
       def han  = 123
       println han.class

       println '---------------------'
       long jin  = 123
       println jin.class

       println '---------------------'
       def tao  = 123L
       println tao.class

       println '---类型判断---'
       println tao.class == jin.class



   }
}
