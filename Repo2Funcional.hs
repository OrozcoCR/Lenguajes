module Main (main) where

import Data.List

--Funcion 1
filterString :: String -> [String] -> [String]
filterString str list = filter (isInfixOf str) list

--Funcion2 
func [] _ = True
func lista1 lista2 =

    subconjunto (head lista1) lista2 && func (tail lista1) lista2

subconjunto _ [] = False
subconjunto contenido (x:xs)

    | contenido == x = True

  | otherwise = subconjunto contenido xs




--Funcion #3
func3 lista segmento final
  | (length (segmento)>0) =
    func3 (append lista (head segmento))(tail segmento)final
  | ((length final)>0) =

  func3 lista (head final) (tail final)
  | otherwise =
    lista

append f i = f ++ [i]
aplanar final= func3 [] [] final


--Funcion #4
func4 lista =

    concat(map subconjunto lista)
    where
        subconjunto lista2 = concatenar lista2
concatenar lista =
    concat (map unir lista)
    where
        unir i = [i]


main :: IO ()
main = do
 
