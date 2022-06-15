# -- coding: utf-8 --

""" 
    Практическая работа: 2. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 3. Дано число n. С начала суток прошло n минут. Определите, сколько часов и минут будут показывать электронные часы в этот момент. 
    Программа должна вывести два числа: количество часов (от 0 до 23) и количество минут (от 0 до 59). 
    Следует предусмотреть случай, когда количество введенных минут больше чем кол-во минут в сутках.
"""

# Определение часов и минут на электронных часах
def timeOnTheClock(n):
    hours = n // 60
    minutes = n % 60
    print("Электронные часы в этот момент будут показывать " + str(hours % 24) + ":" + str(minutes) + ".")

try:
    n = int(input("Введите количество минут, которое прошло с начала суток: "))
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")

if n > 1440:
    print("Количество введенных минут " + str(n) + " больше, чем количество минут в сутках 1440.")
else:
    timeOnTheClock(n)