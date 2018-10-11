package com.jackpotHan.Sort

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/30 14:37
 * @Description: 冒泡排序
 *
 *
 */

def buddleSort= { list ->
    def pos = 0
    for (i in pos..<list.size) {//对数组进行排序
        for (j in i+1..<list.size) {//对数组进行排序
            if (list[i] > list[j]) {//从大往小里排,最右边最大
                def temps = list[i]
                list[i] = list[j]
                list[j] = temps
            }
        }
    }
    return list
}

def list = [10,5,7,6,8,4,5]

println '冒泡排序后:' + buddleSort(list)
