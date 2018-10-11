package com.jackpotHan.Sort

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/30 10:09
 * @Description: 选择排序
 *
 */

//定义一个闭包select
def selectSort={list->
    //定义swap闭包实现集合元素的交换
    def swap={
        x,y,slist->
            def temp=slist[x]
            slist[x]=slist[y]
            slist[y]=temp
    }
    //定义minmos闭包选取集合中最小元素的坐标
    def minPos={
            //From作为起始坐标,将以From为坐标的元素与集合中的其他元素进行大小比较
        mlist,From ->
            def minPos=From
            def next=From+1
            for (j in next..<mlist.size()){
                //如果有元素比起始坐标的元素小则将坐标进行调换，最终筛选出来的mopos坐标是元素最小的坐标
                if (mlist[j]<mlist[minPos])
                    mopos=j

            }
            return minPos
    }
    //从第一个坐标下的元素开始与其他元素进行比较，依次循环
    for (i in 0..<list.size()){
        def pos=minPos(list,i)
        swap(i,pos,list)
    }
    return list
}

list=[10,5,7,6,8,4,5]
/**
 * 过程：
 *    第一 次： 4 5 7 6 8 10 5
 *    第二次：  4 5 7 6 8 10 5
 *    第三次：  4 5 5 6 8 10 7
 *    第四次：  4 5 5 6 8 10 7
 *    第五次：  4 5 5 6 7 10 8
 *    第六次：  4 5 5 6 7 8 10
 *
 */


println '选择排序后:'+selectSort(list)
