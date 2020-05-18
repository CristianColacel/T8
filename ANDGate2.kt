/*data class AND2Builder(
    val intr1: Boolean=false,
    val intr2: Boolean=false,
    var rezultat: Boolean=false
)*/

class ANDGate2(val intr01: Boolean, val intr02: Boolean): Decoupler{
    //private var Gate2: AND2Builder= AND2Builder(intr1, intr2)
    fun build(): Boolean {
        var rezultat=intr01 and intr02
        //Gate2.rezultat=rezultat
        return rezultat
    }
    override fun turnOnGate(intr1: Boolean, intr2: Boolean): ANDGate{
        println("chestie: " + ANDGate(intr1, intr2, ANDGate2(intr1, intr2)))
    }
}