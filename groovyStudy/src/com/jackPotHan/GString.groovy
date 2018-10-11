package com.jackPotHan

/**
 *
 * @Author: Hanjt
 * @Date: 2018/8/29 16:09
 * @Description:
 *
 *
 */
def language = 'groovy'
def sentence = "$language is awesome!"
assert sentence == 'groovy is awesome!'
println sentence
def improveSentence = "${language.capitalize()} is awesome!"
assert improveSentence == 'Groovy is awesome!'
println improveSentence


def x = 1
def printx(){
    println x
}