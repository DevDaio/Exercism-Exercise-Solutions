def is_valid(sides):
    return (all(side > 0 for side in sides) and
            sides[0] + sides[1] >= sides[2] and 
            sides[1] + sides[2] >= sides[0] and 
            sides[0] + sides[2] >= sides[1])
    
def equilateral(sides):
    if not is_valid(sides):
        return False
    return sides[0] == sides[1] == sides[2]
    
def isosceles(sides):
    if not is_valid(sides):
        return False
    return sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2]

def scalene(sides):
    if not is_valid(sides):
        return False
    return sides[0] != sides[1] and sides[1] != sides[2] and sides[0] != sides[2]
