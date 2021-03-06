# -- coding: utf-8 --

""" 
    Практическая работа: 5. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 3. По данному натуральному числу N найдите наибольшую целую степень двойки, не превосходящую N. 
    Выведите показатель степени и саму степень. Операцией возведения в степень пользоваться нельзя!
"""

# Нахождение наибольшей степени числа
def largestDegreeOfNumber(n, i):
    degreeIndicator = i
    degree = 1

    while degreeIndicator * i < n:
        degreeIndicator *= i
        degree += 1
    
    print()
    print("Показатель степени: " + str(degreeIndicator) + ".")
    print("Максимальная степень числа " + str(n) + ": " + str(degree) + ".")

try:
    n = int(input("Введите максимальное число: "))
    i = int(input("Введите число, максимальную степень которого необходимо найти: "))
    largestDegreeOfNumber(n, i)
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")