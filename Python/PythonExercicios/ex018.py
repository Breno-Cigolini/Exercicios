from math import sin, cos, tan, radians
a = (float(input('Digite um angulo: ')))
sin = sin(radians(a))
cos = cos(radians(a))
tan = tan(radians(a))
print('O seno, cosseno e a tangente de {} são, respectivante, {:.2f}, {:.2f}, {:.2f}.'.format(a, sin, cos, tan))
