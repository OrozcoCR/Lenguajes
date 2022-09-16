package main

//Josue Orozco
import "fmt"

type curso struct {
	nombre       string
	horario      bool // true mañana, false tarde
	dia          int
	lEstudiante2 []estudiante
}

type listaCursos []curso

var lCurso2 listaCursos

type estudiante struct {
	nombre string
	nota   int
}
type ListaEstudiante []estudiante

var lestudiante2 ListaEstudiante

func main() {

	lenguajes := curso{"lenguajes", true, 3, lestudiante2}
	arqui := curso{"arqui", false, 3, lestudiante2}
	poo := curso{"poo", false, 3, lestudiante2}
	bases := curso{"Bases de Datos", false, 4, lestudiante2}

	lCurso2.agregarCurso(lenguajes)
	lCurso2.agregarCurso(arqui)
	lCurso2.agregarCurso(poo)
	lCurso2.agregarCurso(bases)

	Josue := estudiante{"Josue", 70}
	Pedro := estudiante{"Pedro", 70}
	Maria := estudiante{"Maria", 69}

	agregarEstudiantes(lCurso2, Josue, "lenguajes")
	agregarEstudiantes(lCurso2, Pedro, "lenguajes")
	agregarEstudiantes(lCurso2, Maria, "lenguajes")

	agregarEstudiantes(lCurso2, Josue, "Lenguajes")
	agregarEstudiantes(lCurso2, Pedro, "Lenguajes")
	agregarEstudiantes(lCurso2, Maria, "Lenguajes")

	agregarEstudiantes(lCurso2, Josue, "arqui")
	agregarEstudiantes(lCurso2, Pedro, "arqui")
	agregarEstudiantes(lCurso2, Maria, "arqui")

	agregarEstudiantes(lCurso2, Josue, "poo")
	agregarEstudiantes(lCurso2, Pedro, "poo")
	agregarEstudiantes(lCurso2, Maria, "poo")

	agregarEstudiantes(lCurso2, Josue, "bases")
	agregarEstudiantes(lCurso2, Pedro, "bases")
	agregarEstudiantes(lCurso2, Maria, "bases")

	listAprobado, listQuedado := lCurso2.nota("lenguajes")

	fmt.Println("Aprobados: ", len(listAprobado))

	fmt.Println("Reporbados:", listQuedado)

	sum := Calcularpromedio(lCurso2, "poo")
	fmt.Println("CalcularPromedio curso: ", sum)
}

func reduce[T, M any](s []T, f func(M, T) M, initValue M) M {
	acc := initValue
	for _, v := range s {
		acc = f(acc, v)
	}
	return acc
}

func mapp[C, V any](l []C, f func(C) V) []V {
	mapped := make([]V, len(l))
	for i, e := range l {
		mapped[i] = f(e)
	}
	return mapped
}

func filter[C any](l []C, f func(C) bool) []C {
	filtered := make([]C, 0)
	for _, element := range l {
		if f(element) {
			filtered = append(filtered, element)
		}
	}
	return filtered
}

func verificarCurso(l listaCursos, C curso) bool {
	var verificar bool
	for i := 0; i < len(l); i++ {
		if (l)[i].nombre == C.nombre {
			verificar = true
		} else {
			verificar = false
		}
	}
	return verificar
}
func (l *listaCursos) agregarCurso(C curso) {

	if verificarCurso(*l, C) == true {
		fmt.Println("Curso agregado previamente")
	} else {
		estado := verificar(*l, C)
		if estado == true {
			fmt.Println("El horario choca")
		} else {
			*l = append(*l, C)
			fmt.Println("Curso matriculado")
		}
	}
}

func verificar(l listaCursos, C curso) bool {
	estado := false
	lista := mapp(l, func(cursoExistente curso) bool {
		if (cursoExistente.dia == C.dia) && (cursoExistente.horario == C.horario) {
			return true
		} else {
			return false
		}
	})
	for i := 0; i < len(lista); i++ {
		if lista[i] == true {
			estado = true
		}
	}
	return estado
}

func agregarEstudiantes(listaCursos []curso, est estudiante, nombreC string) {
	for i, curso := range listaCursos {
		if curso.nombre == nombreC {
			listaCursos[i].lEstudiante2 = append(listaCursos[i].lEstudiante2, est)
		}
	}
}

func (l *listaCursos) nota(notaCurso string) (l1 []estudiante, l2 []estudiante) {

	var listaApux []estudiante
	for i := 0; i < len((*l)); i++ {
		if (*l)[i].nombre == notaCurso {
			listaApux = (*l)[i].lEstudiante2
		}
	}
	listaAp := filter(listaApux, func(e estudiante) bool {
		return e.nota >= 70
	})
	listaQ := filter(listaApux, func(e estudiante) bool {
		return e.nota < 70
	})
	return listaAp, listaQ
}

func Calcularpromedio(l listaCursos, notaCurso string) int {
	var listaNota []int
	var ListaEst []estudiante
	for i := 0; i < len(l); i++ {
		if l[i].nombre == notaCurso {
			ListaEst = l[i].lEstudiante2
		}
	}
	listaNota = mapp(ListaEst, func(e estudiante) int {
		return e.nota
	})

	sum := reduce(listaNota, func(acc int, current int) int {
		acc = acc + current
		return acc
	}, 0)

	sum = sum / len(listaNota)
	return sum
}
