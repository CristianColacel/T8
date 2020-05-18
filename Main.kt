fun main(args: Array<String>) {
    val PoartaDe2 = ANDGate(ANDGate2(true, false))
    val PoartaDe3 = ANDGate(ANDGate3(true, false, false))
    PoartaDe2.makeGate()
    PoartaDe3.makeGate()
    print(PoartaDe2.turnOnGate())
}