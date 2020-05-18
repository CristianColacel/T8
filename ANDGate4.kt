class ANDGate4 private constructor(
    val intr1: Boolean,
    val intr2: Boolean,
    val intr3: Boolean,
    val intr4: Boolean): Decoupler{
    data class Builder(
        var intr1: Boolean=false,
        var intr2: Boolean=false,
        var intr3: Boolean=false,
        var intr4: Boolean=false){
        fun intrare1(intr1: Boolean)=apply{this.intr1=intr1}
        fun intrare2(intr2: Boolean)=apply{this.intr2=intr2}
        fun intrare3(intr3: Boolean)=apply{this.intr3=intr3}
        fun intrare4(intr4: Boolean)=apply{this.intr4=intr4}
        fun build() = ANDGate4(intr1, intr2, intr3, intr4)
    }

    override fun turnOnGate(): Boolean {
        var rezultat4: Boolean
        var combina1: Boolean
        var combina2: Boolean
        combina1=intr1 and intr2
        combina2=intr3 and intr4
        rezultat4=combina1 and combina2
        return rezultat4
    }
}