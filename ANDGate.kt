class ANDGate(val intr1: Boolean, val intr2: Boolean, decuplare: Decoupler): LogicGate(decuplare){
    override fun makeGate(){
        decuplare.turnOnGate(intr1, intr2)
    }
}