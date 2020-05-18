class ANDGate8 private constructor(
    val intr1: Boolean,
    val intr2: Boolean,
    val intr3: Boolean,
    val intr4: Boolean,
    val intr5: Boolean,
    val intr6: Boolean,
    val intr7: Boolean,
    val intr8: Boolean): Decoupler{
    data class Builder(
        var intr1: Boolean=false,
        var intr2: Boolean=false,
        var intr3: Boolean=false,
        var intr4: Boolean=false,
        var intr5: Boolean=false,
        var intr6: Boolean=false,
        var intr7: Boolean=false,
        var intr8: Boolean=false){
        fun intrare1(intr1: Boolean)=apply{this.intr1=intr1}
        fun intrare2(intr2: Boolean)=apply{this.intr2=intr2}
        fun intrare3(intr3: Boolean)=apply{this.intr3=intr3}
        fun intrare4(intr4: Boolean)=apply{this.intr4=intr4}
        fun intrare5(intr5: Boolean)=apply{this.intr5=intr5}
        fun intrare6(intr6: Boolean)=apply{this.intr6=intr6}
        fun intrare7(intr7: Boolean)=apply{this.intr7=intr7}
        fun intrare8(intr8: Boolean)=apply{this.intr8=intr8}
        fun build() = ANDGate8(intr1, intr2, intr3, intr4, intr5, intr6, intr7, intr8)
    }

    override fun turnOnGate(): Boolean {
        var rezultat8: Boolean
        var combina1: Boolean
        var combina2: Boolean
        var combina3: Boolean
        var combina4: Boolean
        var part1: Boolean
        var part2: Boolean
        combina1=intr1 and intr2
        combina2=intr3 and intr4
        combina3=intr5 and intr6
        combina4=intr7 and intr8
        part1=combina1 and combina2
        part2=combina3 and combina4
        rezultat8=part1 and part2
        return rezultat8
    }
}