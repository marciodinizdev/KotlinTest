package Module02_ObjectOrientation._12_ClassesAndObjects.Ex007_StudentNotes

fun main() {
    val marcio = Student("Márcio")
    marcio.addNote(8.5)
    marcio.addNote(9.0)
    marcio.addNote(7.8)
    marcio.getAverage()
    println()
    val thays = Student("Thays")
    thays.addNote(6.2)
    thays.addNote(4.0)
    thays.addNote(8.5)
    thays.getAverage()
}