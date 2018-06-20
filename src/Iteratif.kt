/**
 * Suite de Fibonacci en mode itératif
 */
fun main(args: Array<String>)
{
    var dernierTerme = 1
    var termeActuel = 1

    var termeSuivant: Int = 0

    //Affiche la valeur du premier terme de la suite de Fibonacci.
    println("$termeActuel ")

    //Condition sur le nombre de lapins
    while (termeActuel < 10)
    {

        println("$termeActuel ");

        termeSuivant = termeActuel + dernierTerme;

        dernierTerme = termeActuel;
        termeActuel = termeSuivant;
    }
}