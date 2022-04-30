# -- coding: utf-8 --

""" 
    Практическая работа: 4. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 3. Дана строка. Разрежьте ее на две равные части (если длина строки — четная, а если длина строки нечетная, 
    то длина первой части должна быть на один символ больше). Переставьте эти две части местами, результат запишите в новую строку и выведите на экран. 
    Решение задачи должно быть выполнено без использования конструкции if и ей подобных.
"""

# Разделение строки и перестановка двух частей местами
def splitAndSwapString(sourceString):
    sizeString = len(sourceString) // 2 + len(sourceString) % 2

    firstPartString = sourceString[0:sizeString]
    secondPartString = sourceString[sizeString:]

    print(secondPartString + " " + firstPartString)

splitAndSwapString(str(input("Введите строку: ")))