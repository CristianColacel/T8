class ANDGate3(
    val intr1: Boolean,
    val intr2: Boolean,
    val intr3: Boolean): Decoupler{
    data class Builder(
        var intr1: Boolean=false,
        var intr2: Boolean=false,
        var intr3: Boolean=false){
        fun intrare1(intr1: Boolean)=apply{this.intr1=intr1}
        fun intrare2(intr2: Boolean)=apply{this.intr2=intr2}
        fun intrare3(intr3: Boolean)=apply{this.intr3=intr3}
        fun build() = ANDGate3(intr1, intr2, intr3)
    }

    override fun turnOnGate(): Boolean {
        var rezultat3: Boolean
        var combina: Boolean
        combina=intr1 and intr2
        rezultat3=combina and intr3
        return rezultat3
    }
}