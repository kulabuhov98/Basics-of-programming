# -- coding: utf-8 --

""" 
    Практическая работа: 1. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 7. Проверьте является ли значение в переменной number - четным.
"""

# Нахождение четности числа
def numberParity(number):
    if number % 2 == 0:
        print("Число " + str(number) + " является четным.")
    else:
        print("Число " + str(number) + " является нечетным.")

try:
    numberParity(int(input("Введите число: ")))
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")