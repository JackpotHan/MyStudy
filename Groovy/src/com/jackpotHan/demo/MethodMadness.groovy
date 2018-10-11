package com.jackpotHan.Demo

import java.util.function.Consumer

/**
 *
 * @Author: Hanjt
 * @Date: 2018/7/17 20:26
 * @Description:
 *
 *
 */
def repeat(val){
    for(i = 0;i<5;i++){
        println val+i
    }
}

def repeat1(val){
    for(i in 0..<5){
        println val+i
    }
}

def repeat2(val){
    for(i in 0..5){
        println val+i
    }
}

def repeat3(val){
    for(i in 5..<1){
        println val+i
    }
}

repeat('Hello World')
println '------------------------'
repeat1('Hello World')
println '------------------------'
repeat2('Hello World')
println '------------------------'
repeat3('Hello World')
println '------------------------'


def excite = {word->
    println "${word}"
}

excite('hanjt')

println '-----------------------'

def list = ["Rod", "Neeta", "Eric", "Missy"]
def shorts1 = list.findAll({ it.size() <= 4 })
//Groovy中，当函数的最后一个参数是闭包的话，可以省略圆括号
def shorts2 = list.findAll { it.size() <= 4 }
println shorts1 +'----shorts1-----'
println shorts2 +'----shorts2-----'
println shorts1.class
println shorts1.size()
shorts1.each { println it }
println '----------------------'
def  testClosure(int a,String b, Closure closure){
    println a*a
    println '传入的数据是：'+ b +'，数据格式是:'+ b.class
    closure()
}
//调用时可以省略圆括号（最后为闭包）
testClosure 4, "test", {
    println "I am  in closure "
}

println '----------------------'
//Groovy 函数调用如果想传入一个闭包作为参数，就必须使用括号。
def c={a, Closure c->
   c.call("test")+':'+a
}
println c(3) {msg->
    "msg:" + msg
}
println '----------------------'
Consumer<String> con = {s ->println "$s"}
con.accept('I Love You')

//三个引号'''xxx'''中的字符串支持随意换行,且数据输入段落格式与输出格式一致。
//完全可以用于文本框编辑。
def multieLines = '''
      11  - - begin
     line  1 
     line  2
       22 --  ’‘   end  '''
println multieLines
