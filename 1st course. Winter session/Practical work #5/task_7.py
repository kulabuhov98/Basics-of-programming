# -- coding: utf-8 --

""" 
    Практическая работа: 5. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 7. Последовательность состоит из натуральных чисел и завершается числом 0. 
    Определите, сколько элементов этой последовательности больше предыдущего элемента.
"""

# Нахождение количества наибольших элементов последовательности
def numberOfLargestNumbers(startN):
    numberOfElements = 0

    while startN != 0:
        nextN = int(input())
        if nextN != 0 and startN < nextN:
            numberOfElements += 1
        startN = nextN
    print("Количество элементов последовательность больше предыдущего элемента: " + str(numberOfElements) + ".")

try:
    print("Введите последовательность чисел: ")
    numberOfLargestNumbers(int(input()))
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")