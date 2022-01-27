# -- coding: utf-8 --

""" 
    Практическая работа: 6. Номер зачетной книжки: 21-677.
  
    Автор: Кулабухов Александр Максимович, ЗИТ-21
    Дата: 26.01.2022
"""

# Импорт пакета Tkinter
from tkinter import *
# Импорт модуля Ttk
from tkinter import ttk
# Импорт модуля messagebox
from tkinter import messagebox

# Task # 3. Нахождение наибольшей степени числа - начало
def largestDegreeOfNumber():
    try:
        n = int(firstTabEntryN.get())
        i = int(firstTabEntryI.get())
    except ValueError:
        messagebox.showerror("Task # 3", "Critical error! Exception has occurred: ValueError!")

    degreeIndicator = i
    degree = 1

    while degreeIndicator * i < n:
        degreeIndicator *= i
        degree += 1
    
    messagebox.showinfo("Task # 3", "Показатель степени: " + str(degreeIndicator) + ".")
    messagebox.showinfo("Task # 3", "Максимальная степень числа " + str(n) + ": " + str(degree) + ".")
    
    firstTabEntryN.delete(0, END)
    firstTabEntryI.delete(0, END)

    firstTabEntryN.focus()
# Task # 3. Нахождение наибольшей степени числа - конец

# Task # 4. Нахождение количества дней тренировок - начало
def numberOfTrainingDays():
    try:
        x = float(secondTabEntryX.get())
        y = float(secondTabEntryY.get())
    except ValueError:
        messagebox.showerror("Task # 4", "Critical error! Exception has occurred: ValueError!")
    day = 1

    while x < y:
        x += x * 0.1
        day += 1
    
    messagebox.showinfo("Task # 4", str(y) + " километров пробежал спортсмен за " + str(day) + " дней.")

    secondTabEntryX.delete(0, END)
    secondTabEntryY.delete(0, END)

    secondTabEntryX.focus()
# Task # 4. Нахождение количества дней тренировок - конец

# Объект окна верхнего уровня
window = Tk()
# Заголовок окна
window.title("Tkinter for Practical work # 5. Developed by Kulabuhov98")
# Размер окна
window.geometry("500x250")
# Блокирование возможности изменения размера окна
window.resizable(width=False, height=False)

# Объект управления вкладкой
tabControl = ttk.Notebook(window)
# Упаковка элемента управления вкладкой, для его отображения в окне
tabControl.pack(expand=1, fill="both")

# Объект вкладки Task # 3 с использованием класса Frame
firstTab = ttk.Frame(tabControl)
# Добавление вкладки Task # 3 в элемент управления вкладками
tabControl.add(firstTab, text="Task # 3")

# Объект вкладки Task # 4 с использованием класса Frame
secondTab = ttk.Frame(tabControl)
# Добавление вкладки Task # 4 в элемент управления вкладками
tabControl.add(secondTab, text="Task # 4")

# Объект вкладки Task # 7 с использованием класса Frame
thirdTab = ttk.Frame(tabControl)
# Добавление вкладки Task # 7 в элемент управления вкладками
tabControl.add(thirdTab, text="Task # 7")

# Информирование пользователя о Task # 3 - начало
Label(firstTab, text="Задание 3. По данному натуральному числу N найдите наибольшую целую степень").pack()
Label(firstTab, text="двойки, не превосходящую N. Выведите показатель степени и саму степень.").pack()
Label(firstTab, text="Операцией возведения в степень пользоваться нельзя!").pack()
# Информирование пользователя о Task # 3 - конец

# Информирование пользователя о Task # 4 - начало
Label(secondTab, text="Задание 4. В первый день спортсмен пробежал X километров, а затем он каждый день").pack()
Label(secondTab, text="увеличивал пробег на 10% от предыдущего значения. По данному числу Y определите").pack()
Label(secondTab, text="номер дня, на который пробег спортсмена составит не менее Y километров.").pack()
Label(secondTab, text="Программа получает на вход действительные числа X и Y").pack()
Label(secondTab, text="и должна вывести одно натуральное число.").pack()
# Информирование пользователя о Task # 4 - конец

# Информирование пользователя о Task # 7 - начало
Label(thirdTab, text="Задание 7. Последовательность состоит из натуральных чисел и завершается").pack()
Label(thirdTab, text="числом 0. Определите, сколько элементов этой последовательности").pack()
Label(thirdTab, text="больше предыдущего элемента.").pack()
# Информирование пользователя о Task # 7 - конец

# Формирование основных виджетов к Task # 3 - начало
Label(firstTab, text="Введите максимальное число:").pack(pady=(5,0))
firstTabEntryN = Entry(firstTab, width=70)
firstTabEntryN.pack()

Label(firstTab, text="Введите число, максимальную степень которого необходимо найти:").pack()
firstTabEntryI = Entry(firstTab, width=70)
firstTabEntryI.pack()

Button(firstTab, width=50, text="Запустить", command=largestDegreeOfNumber).pack(pady=(5,0))
# Формирование основных виджетов к Task # 3 - конец

# Формирование основных виджетов к Task # 4 - начало
Label(secondTab, text="Сколько километров спортсмен пробежал в первый день?").pack(pady=(5,0))
secondTabEntryX = Entry(secondTab, width=70)
secondTabEntryX.pack()

Label(secondTab, text="Сколько километров спортсмен пробежал всего?").pack()
secondTabEntryY = Entry(secondTab, width=70)
secondTabEntryY.pack()

Button(secondTab, width=50, text="Запустить", command=numberOfTrainingDays).pack(pady=(5,0))
# Формирование основных виджетов к Task # 4 - конец

# Формирование основных виджетов к Task # 7 - начало
# Формирование основных виджетов к Task # 7 - конец

# Отображение окна, до момента его закрытия
window.mainloop()