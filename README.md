# Interpolaciondenewton_lagrange
# Interpolación de Lagrange(interpolacionde lagrange .java)
• validacionDatos: Verifica rigurosamente que las matrices no sean nulas, que tengan dimensiones equivalentes y que no existan nodos repetidos en el eje \(X\).
• interpolacionLagrange: Evalúa el polinomio en un punto de interés xEval aplicando la sumatoria ponderada de los coeficientes de Lagrange de manera óptima.
# Interpolación de Newton (interpolación de newton.java)
• calcularDiferenciasDivididas: Construye y retorna la matriz bidimensional de diferencias divididas de orden superior a partir de los datos experimentales.
• evaluarPolinomio: Utiliza los coeficientes de la diagonal superior calculados previamente para evaluar el polinomio de Newton empleando una estrategia similar al método de Horner.
• imprimirTabla: Muestra en la consola la tabla completa de diferencias divididas formateada en columnas de orden secuencial de forma muy limpia.
# Clase Principal (Main)
• Define el set de datos inicial del ejercicio (por ejemplo: (2, 1), (3, 2), (4, 10)).
• Orquesta la ejecución de los métodos, imprime las tablas en la terminal y despliega el valor final estimado para el punto intermedio deseado.
# Resultado del código principal
##TABLA DE DIFERENCIAS DIVIDIDAS ---
x_i      f[x_i]  Orden 1 Orden 2
---------------------------------------------
1.00     2.0000  1.0000  0.8333
2.00     3.0000  3.5000
4.00    10.0000
--- COEFICIENTES DEL POLINOMIO (a_k) ---
a_0 = 2.0000
a_1 = 1.0000
a_2 = 0.8333
--- RESULTADO DE LA INTERPOLACIÓN ---
El valor estimado en x = 3.00 es P(3.00) = 5.6667
# Modificación de interpolación de Lagrange 
• Se agrego la formula faltante para el cálculo  de factores de polinomio base de lagrange(Li(x))para la inter polacion numerica.
   * termino *= (xEval - x[j]) / (x[i] - x[j]);
   * Donde este evalúa a las diferencias divididas con la formula agregada de lagrange
## TABLA DE DIFERENCIAS DIVIDIDAS ---
x_i      f[x_i]  Orden 1 Orden 2
---------------------------------------------
5.00     7.0000 -1.2000  0.2333
10.00    1.0000 -0.5000
8.00     2.0000

--- COEFICIENTES DEL POLINOMIO (a_k) ---
a_0 = 7.0000
a_1 = -1.2000
a_2 = 0.2333

--- RESULTADO DE LA INTERPOLACIÓN ---
El valor estimado en x = 3.00 es P(3.00) = 12.6667
#resultados final con la interpolación de  lagrange
