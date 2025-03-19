package Module02_ObjectOrientation._12_ClassesAndObjects.Ex007_StudentNotes

class Student(
    val name: String,
    var notes: MutableList<Double> = mutableListOf<Double>()
) {
    fun addNote(note: Double) {
        notes.add(note)
    }
    fun getAverage() {
        val sum = notes.sum()
        val count = notes.size
        if (count > 0) {
            val average = sum / count
            println("Student: $name")
            println("Notes: $notes")
            println("Average: ${"%.1f".format(average)}")
            when {
                average >= 7.0 -> println("$name has PASSED! \uD83C\uDF89")
                else -> println("$name has FAILED! ❌")
            }
        } else {
            println("No notes available for student: $name")
        }
    }
}