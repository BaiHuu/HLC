import string
from array import array


def codigoCesar(mensajeSinCifrar,clave):

    mensajeSinCifrar
    desplazamiento = clave


    abecedario = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

    for Letra in mensajeSinCifrar:
        for Letra in abecedario:
            indice = abecedario.index(Letra)
            nuevaLetra = (indice + desplazamiento) % len(abecedario)
            resultado +=

