internal class C() {
    constructor(p: Int) : this() {
        println(staticField1 + staticField2)
    }

    companion object {
        private val staticField1 = 0
        private val staticField2 = 0
    }
}
