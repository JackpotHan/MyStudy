package com.jackpotHan.demo

/**
 *
 * @Author: Hanjt
 * @Date: 2018/7/18 14:02
 * @Description:
 *
 *
 */
class MapTest {
    static void main(args) {
//        def coll = [1,2,3,4,'2']
//        println coll.getClass()
//        println coll.join(',')
//        println coll.join(',').class
//        println coll.count(2)
//        println '---------------'
//        coll.each {
//            println it  //$.each用法类似于JQ，it为关键字，指向当前元素。
//            println it.class
//        }
//        println '---------------'
//        coll.each {value ->
//            println value
//        }

//        def map = [name:'java','type':'book']
//        println map.getClass()
//        println map.get('name')
//        println '----------------'
//        map.put('id',10000)
//        map.alias = '别名'
//        map.name = "hanjt"
//        map['description'] = '描述信息'
//        println map.get('id')
//        println map.keySet()+"----获取map中的所有key------"
//        println map.values()+'----获取map中的所有value----'
//        println map.toString()
//        println '-----------------'
//        map.each {key,value->
//            println "${key}:${value}"
//            println key+':'+value
//        }
//        println '--------------'


        def range = 0..4
        println range.class
        assert range instanceof List

    }
}
