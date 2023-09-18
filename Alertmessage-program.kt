fun main() {
    println(displayAlertMessage("Unknown OS", "user_one@gmail.com"))
    println(displayAlertMessage("Windows", "user_two@gmail.com"))
    println(displayAlertMessage("Mac OS", "user_thre@gmail.com"))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem: String = "Chrome OS", emailId: String ="sample@gmail.com"): String {
    val alertMessage = "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
    return "$alertMessage"
}