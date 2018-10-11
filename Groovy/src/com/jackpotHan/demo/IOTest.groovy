package com.jackpotHan.demo

/**
 *
 * @Author: Hanjt
 * @Date: 2018/7/24 13:55
 * @Description:
 *
 */

File targetFile = new File('test')
targetFile.eachLine {
    String line ->
        println line
}
println '--------------------'
println targetFile.name
println targetFile.getText()

println '-------这是一条华丽的分割线--------'
println '下面是一个copy文件的demo'

def srcFile = new File('test')
def tarFile = new File('test1')
//tarFile.withOutputStream{
//    os-> srcFile.withInputStream {
//        ins->
//            os << ins //利用OutputStream的<<操作符重载，完成从inputstream到OutputStream的输出
//    }
//}

//----->
tarFile.withOutputStream({
    os-> srcFile.withInputStream( {
        ins->
            os << ins //利用OutputStream的<<操作符重载，完成从inputstream到OutputStream的输出
    })
})
