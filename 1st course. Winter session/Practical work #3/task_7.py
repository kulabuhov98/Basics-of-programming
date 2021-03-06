# -- coding: utf-8 --

""" 
    Практическая работа: 3. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 7. По данному натуральном n вычислите сумму 1!+2!+3!+...+n!. В решении этой задачи можно использовать только один цикл. 
    Пользоваться математической библиотекой math в этой задаче запрещено.
"""

# Нахождение сумму факториалов
def sumOfFactorials(n):
    sum = 0
    factorial = 1

    for i in range(1, n + 1):
        factorial = factorial * i
        sum += factorial
        
    print("Сумма 1!+2!+3!+...+" + str(n) + "! = " + str(sum) + ".")

try:
    sumOfFactorials(int(input("Введите число: ")))
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")