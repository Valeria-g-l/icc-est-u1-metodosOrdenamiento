from sortSelection import SortSelection
def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Estudiante: Valeria Guaman")
    print("original: ", numeros)

    #Instanciar la clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado asendentemente: ", numeros)

    selection.sort_descendente(numeros)
    print("Ordenado descendentemente: ", numeros)

if __name__ == "__main__":
    main()