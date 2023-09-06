fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val content1 = EducationalContent("Linguagem de Programacao", 60)
    val content2 = EducationalContent("Android Studio", 120)
    val content3 = EducationalContent("Banco de Dados", 160)

    val training1 = Training("Introducao a Kotlin", listOf(content1))
    val training2 = Training("Desenvolvimento Mobile", listOf(content2))
    val training3 = Training("API Rest", listOf(content3))

    val level1 = content1.determineLevel()
    val level2 = content2.determineLevel()
    val level3 = content3.determineLevel()

    println("$training1, $level1")
    println("$training2, $level2")
    println("$training3, $level3")

}

enum class Level { BASICO, INTERMEDIARIO, AVANCADO }

class User

data class EducationalContent(val contentName: String, val duration: Int = 60) {
    fun determineLevel(): Level {
        return when {
            duration <= 60 -> Level.BASICO
            duration <= 120 -> Level.INTERMEDIARIO
            else -> Level.AVANCADO
        }
    }
}

data class Training(val nome: String, var contents: List<EducationalContent>) {
    val subscribed = mutableListOf<User>()

    fun enroll(usuario: User) {
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        subscribed.add(usuario)
    }
    
}
