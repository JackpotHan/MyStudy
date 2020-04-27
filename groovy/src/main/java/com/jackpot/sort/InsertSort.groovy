package com.jackpot.sort

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/30 16:17
 * @Description: 插入排序
 *
 *
 */
def insertSort = { list ->
    def pos = 0
    for(i in pos..<list.size) {
         def tmp = list[i]
        //内层循环控制，比较并插入
        for(def j = i-1;j>=pos ;j--) {
            if(tmp < list[j]) {
                //发现插入的元素要小，交换位置，将后边的元素与前面的元素互换
                list[j+1] = list[j]
                list[j] = tmp
            } else {
                //如果碰到不需要移动的元素，由于是已经排序好是数组，则前面的就不需要再次比较了。
                break
            }
        }
    }
    return list
}

def list = [10,5,7,6,8,4,5]

println '插入排序后:' + insertSort(list)