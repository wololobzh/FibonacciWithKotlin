/**
 * Suite de Fibonacci en mode récursif.
 */
fun main(args: Array<String>)
{
    //Nombre de termes
    val nombreTermes = 10

    //Pour chaque terme
    for (i in 1..nombreTermes)
    {
        //On calcul la valeur
        println("$i : ${fibonacci(i)}")
    }
}

/**
 * Fonction récursive pour appliquer la suite de Fibonacci.
 */
fun fibonacci(indexTerme: Int): Long
{
    //Si l'index du terme est inférieur ou égal à un,
    //alors on retourne 1 car il n'y a pas assez d'élément pour faire le calcul.
    return if (indexTerme <= 1)
    {
        //L'index du terme est alors retourné. (la valeur '1' normalement)
        indexTerme.toLong()
    }
    else
    {
        //Sinon on aditionne la valeur du dernier terme et avant dernier terme.
        fibonacci(indexTerme - 1) + fibonacci(indexTerme - 2)
    }
}
