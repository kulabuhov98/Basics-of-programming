# -- coding: utf-8 --

""" 
    Практическая работа: 3. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 4. Дано несколько чисел. Вычислите их сумму. Сначала вводите количество чисел N, затем вводится ровно N целых чисел. 
    Постройте решение так, чтобы использовалось минимальное количество переменных.
"""

# Нахождение суммы чисел
def sumOfNumbers():
    sum = 0
    
    for i in range(int(input("Введите количество чисел: "))):
        sum += int(input("Введите " + str(i + 1) + " число: "))
    print("Сумма " + str(i + 1) + " чисел = " + str(sum) + ".")

try:
    sumOfNumbers()
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")
except UnboundLocalError:
    print("Critical error! Exception has occurred: UnboundLocalError!")