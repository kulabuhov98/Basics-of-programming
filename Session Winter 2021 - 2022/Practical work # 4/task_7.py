# -- coding: utf-8 --

""" 
    Практическая работа: 4. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022

    Задание 5. Дана строка, в которой буква h встречается минимум два раза. 
    Удалите из этой строки первое и последнее вхождение буквы h, а также все символы, находящиеся между ними.
"""

symbolString = str(input("Введите букву, с которой необходимо выполнить действия: "))
sourceString = str(input("Введите строку, в которой буква " + symbolString + " встречается минимум два раза: "))

def deleteSymbolFromString(symbolString, sourceString):
    initialEntry = sourceString.find(symbolString)
    finalEntry = sourceString.rfind(symbolString)

    print(sourceString[0:initialEntry] + sourceString[finalEntry + 1:])

deleteSymbolFromString(symbolString, sourceString)