package com.jackpotHan.Sort

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/30 18:17
 * @Description: 闭包的递归
 *
 *
 */
//factorialProperty = { n ->
//    if (n == 0) return 1
//    n * factorialProperty(n - 1) // 使用这个属性的名字进行递归调用
//}
//assert 3628800 == factorialProperty(10)
//println factorialProperty(10)
//
//println '--------------'
def factorialVar // 先定义
factorialVar = { n -> // 再赋值
    if (n == 0) return
    factorialVar(n - 1) // 使用这个局部变量的名字进行递归调用
}
//assert 3628800 == factorialVar(10)
println factorialVar(10)

