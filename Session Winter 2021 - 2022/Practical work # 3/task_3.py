# -- coding: utf-8 --

""" 
    Практическая работа: 3. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 3. Даны два целых числа A и В, A > B. Выведите все нечётные числа от A до B включительно, в порядке убывания.
"""

# Нахождение нечетности числа
def oddNumbers(a, b):
    for i in range(a, b - 1, -1):
        if i % 2 != 0:
            print(i)

try:
    a = int(input("Введите первое число: "))
    b = int(input("Введите второе число: "))
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")

if a > b:
    print("Нечетные числа от " + str(a) + " до " + str(b) + ":")
    oddNumbers(a, b)
else:
    print("Первое число " + str(a) + " должно быть больше второго числа " + str(b) + ".")