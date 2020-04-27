package com.jackpot.sort

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/30 15:29
 * @Description: 快速排序
 *
 *
 */

def division = {list, left, right ->
    // 以最左边的数(left)为基准
    int base = list[left]
    while (left < right) {
        // 从序列右端开始，向左遍历，直到找到小于base的数
        while (left < right && list[right] >= base)
            right--
            // 找到了比base小的元素，将这个元素放到最左边的位置
            list[left] = list[right]
        // 从序列左端开始，向右遍历，直到找到大于base的数
        while (left < right && list[left] <= base)
            left++
            // 找到了比base大的元素，将这个元素放到最右边的位置
            list[right] = list[left]
    }
    // 最后将base放到left位置。此时，left位置的左侧数值应该都比left小；
    // 而left位置的右侧数值应该都比left大。
    list[left] = base
    return left
}

def quickSort1
quickSort1= {list, left, right ->
    // 左下标一定小于右下标，否则就越界了
    if (left < right) {
        // 对数组进行分割，取出下次分割的基准标号
        int base = division(list, left, right)
        System.out.format("base: %d,\t", list[base])
        // 对“基准标号“左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
        quickSort1(list, left, base - 1)
        // 对“基准标号“右侧的一组数值进行递归的切割，以至于将这些数值完整的排序
        quickSort1(list, base + 1, right)

    }
    return list
}

def quickSort2= {list, left, right ->
    // 左下标一定小于右下标，否则就越界了
    if (left < right) {
        // 对数组进行分割，取出下次分割的基准标号
        int base = division(list, left, right)
        System.out.format("base: %d,\t", list[base])
        // 对“基准标号“左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
        call(list, left, base - 1)
        // 对“基准标号“右侧的一组数值进行递归的切割，以至于将这些数值完整的排序
        call(list, base + 1, right)
    }
    return list
}


list1=[10,5,7,6,8,4,5]
list2=[10,5,7,6,8,4,5]

println '快速排序后;' + quickSort1(list1,0,list1.size()-1)
println '---------------------'
println '快速排序后;' + quickSort2(list2,0,list1.size()-1)
