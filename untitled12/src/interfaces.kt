fun main() {
    val myPhone = Myphone()
    myPhone.phoneOn()
    myPhone.onClick()
    myPhone.onTouch()
    myPhone.openApp()
    myPhone.closeApp()
    myPhone.brightMax()
    myPhone.something()

}
interface Application {
    var appName: String
    var x1: Int

    fun something()

    fun brightMax() {
        println("Brightness level is on Max!")
    }

    fun openApp() {
        println("$appName is opening!")
    }

    fun phoneOn() {
        println("The phone is ON")
    }

    fun onClick() {
        println("App is running")
    }

    fun closeApp() {
        println("${Myphone.something1.appName} App is closed!")
    }
}

interface Button {
    val x: Int
    var helloMessage: String

    fun brightMax() {
        println("Brightness is on $x")
    }

    fun phoneOn() {
        println("Power on button was pressed!")
    }

    fun onClick()

    fun onTouch() {
        println("The screen was touched!")
    }
}



class Myphone: Button, Application {
    override fun something() {
       println("I want to die")
    }

    object something1 : Application {
        override var x1: Int = 100
        override var appName: String = "Instagram"
        override fun something() {
            println("He wants to die!")
        }

    }

    var x10: Int = 55
    override var x1: Int = 12
    override var appName: String = "Facebook"
    override var x: Int = 100

    override fun phoneOn() {
        super<Application>.phoneOn()
    }

    override fun brightMax() {
        super<Application>.brightMax()
        super<Button>.brightMax()
    }
    override var helloMessage: String = "Hello"

    override fun onClick() {
        super.onClick()
    }
}
