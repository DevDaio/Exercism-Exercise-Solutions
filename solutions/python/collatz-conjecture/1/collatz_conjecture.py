def steps(number):
    taken_steps = 0
    if number <= 0 or not isinstance(number, int):
        raise ValueError("Only positive integers are allowed")
    while number != 1:
        if number % 2 == 0:
            number //= 2
            taken_steps += 1
            print(number)
        elif number % 2 == 1:
            number *= 3 
            number += 1
            taken_steps += 1
            print(number)
    return taken_steps