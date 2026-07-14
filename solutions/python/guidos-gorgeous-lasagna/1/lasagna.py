"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


# TODO: define your EXPECTED_BAKE_TIME (required) and PREPARATION_TIME (optional) constants below.

EXPECTED_BAKE_TIME = 40       
PREPARATION_TIME = 2     

# TODO: Remove 'pass' and complete the 'bake_time_remaining()' function below.
def bake_time_remaining(already_in):
    """
    Type in how long it is already in the oven
    """
    return EXPECTED_BAKE_TIME - already_in


# TODO: Define the 'preparation_time_in_minutes()' function below.
def preparation_time_in_minutes(number_of_layers):
    """
    Type in the number od layers and the time needed per layer as agruments
    """
    return number_of_layers * PREPARATION_TIME


# TODO: define the 'elapsed_time_in_minutes()' function below.
def elapsed_time_in_minutes(number_of_layers, already_in):
    """
    Gesamtzeit (Vorbereitung + bisherige Ofenzeit) in Minuten.
    """
    prep_time = preparation_time_in_minutes(number_of_layers)
    return prep_time + already_in


# TODO: Remember to go back and add docstrings to all your functions

print(EXPECTED_BAKE_TIME)                
print(bake_time_remaining(10))            
print(preparation_time_in_minutes(8))     
print(elapsed_time_in_minutes(8, 30))  