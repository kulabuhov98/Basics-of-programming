# -- coding: utf-8 --

""" 
    Практическая работа: 1. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 4. Переменная seconds хранит в себе некоторое количество секунд. Переведите это число в дни:часы:минуты:секунды.
"""

# Представление секунд в формате дни:часы:минуты:секунды
def dateFormat(seconds):
    print(str(seconds // 86400) + ":" + str(seconds % 86400 // 3600) + ":" + str(seconds % 3600 // 60) + ":" + str(seconds % 3600 % 60) + ".")

try:
    seconds = int(input("Введите некоторое количество секунд: "))
    dateFormat(seconds)
except ValueError:
    print("Critical error! Exception has occurred: ValueError!")