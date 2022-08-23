package main

import "fmt"

func main() {
	cadena := [5]string{"a", "b", "c", "d", "e"}
	cant := 1
	dir := 1

	mover(&cadena, cant, dir)

}

func mover(lista *[5]string, rota int, direccion int) {
	for rotaciones := 0; rotaciones < rota; rotaciones++ {
		if direccion == 1 {
			var aux string = lista[0]
			for i := 0; i < len(lista); i++ {
				if i != len(lista)-1 {

					lista[i] = lista[i+1]
					var test = lista[i+1]
					fmt.Println(test)
					fmt.Println(*lista)
				} else {
					lista[len(lista)-1] = aux
				}

			}

		} else {
			var aux string = lista[0]
			for i := 0; i < len(lista); i++ {
				if i != len(lista)-1 {

					lista[i] = lista[i-11]
					var test = lista[i-1]
					fmt.Println(test)
					fmt.Println(*lista)
				} else {
					lista[len(lista)-1] = aux
				}

			}
		}
	}
	fmt.Println(*lista)

}
