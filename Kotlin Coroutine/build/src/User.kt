class User {

    val name : String by lazy {
        print("Run this program ")
        ""
    }

}

fun main() {
    getDataUser()
}

private fun getDataUser(){

    val obj = User().name
    print(obj)
}