package main

import "fmt"

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lista2 listaProductos
var lProductos listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	var i int
	var bandera = 0
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			(*l)[i].precio = precio
			(*l)[i].cantidad = (*l)[i].cantidad + cantidad
			bandera = 1
		}

	}
	if bandera == 0 {
		*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	}

}

// modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
// de elementos del producto y eventualmente el precio si es que es diferente

func elimSinExistencia(slice []producto, s int) []producto {
	return append(slice[:s], slice[s+1:]...)
}

func (l *listaProductos) buscarProducto(nombre string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}
	return result
}

func (l *listaProductos) venderProducto(nombre string, cant int) {
	var prod = l.buscarProducto(nombre)
	if prod != -1 && cant > 0 {
		if (*l)[prod].cantidad >= cant {
			(*l)[prod].cantidad = (*l)[prod].cantidad - cant
		} else {
			fmt.Println("No se puede vayor cantidad de productos que los que hay en existencia")
		}

		if (*l)[prod].cantidad <= 0 {
			fmt.Println("el producto ", (*l)[prod].nombre, " se elimino del sistema.")
			(*l) = elimSinExistencia(*l, prod)
		}

		//modificar para que cuando no haya existencia de cantidad de productos, el producto se elimine de "la lista"
	}
}
func llenarDatos() {
	lProductos.agregarProducto("arroz", 5, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 12, 4500)
}

func (l *listaProductos) listarProductosMínimos() listaProductos {
	var i int
	for i = 0; i < len(*l); i++ {

		if (*l)[i].cantidad < 10 {

		}
	}
	return nil
}

func main() {
	llenarDatos()
	fmt.Println(lProductos)
	//	lProductos.venderProducto("arroz", 4)
	//	fmt.Println(lProductos)
	lProductos.agregarProducto("arroz", 1, 1501)
	fmt.Println(lProductos)
	//	lProductos.venderProducto("frijoles", 4)
	//	fmt.Println(lProductos)
	//	lProductos.venderProducto("leche", 10)
}

// si ha sobrado tiempo antes del receso, el ejercicio se podría ampliar para que los los productos se almacenen en archivos de texto
// que al inicio se carguen del archivo a la lista y que al final se actualice el archivo con el contenido de la lista
