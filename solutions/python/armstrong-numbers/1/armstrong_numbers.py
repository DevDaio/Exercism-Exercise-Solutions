def is_armstrong_number(number):
    number = str(number)
    summ=0
    digits = len(str(number))
    for i in number:
        summ += int(i) ** digits
    if summ == int(number):
        return True
    else:
        return False