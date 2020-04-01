import core.App
import core.Construct
import core.Stack

class CdkTestStack constructor(val scope: Construct, val id: String) : Stack(scope, id) {
    init {
        val lambda = Function(this, "TestLambda", object : FunctionProps {
            override var runtime: Runtime = Runtime.NODEJS_12_X
            override var code: Code = Code.fromInline("")
            override var handler: String = "index.handler"
        })
    }
}

fun main() {
    val app = App()
    CdkTestStack(app, "CdkTestStack")
}
