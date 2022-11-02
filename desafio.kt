// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val listaConteudoEducacionalAndroid = listOf<ConteudoEducacional>(
        ConteudoEducacional("Java", 50, Nivel.INTERMEDIARIO),
        ConteudoEducacional("Kotlin", 60, Nivel.BASICO),
        ConteudoEducacional("JETPACK", 40, Nivel.AVANÇADO),

        )
    val listaConteudoEducacionalBackEnd = listOf<ConteudoEducacional>(
        ConteudoEducacional("Java", 50, Nivel.AVANÇADO),
        ConteudoEducacional("springBoot", 60, Nivel.INTERMEDIARIO),
        ConteudoEducacional("SQL", 20, Nivel.AVANÇADO)

    )

    val android = Formacao("Android", listaConteudoEducacionalAndroid, Nivel.AVANÇADO)
    val backAnd = Formacao("Back End", listaConteudoEducacionalBackEnd, Nivel.INTERMEDIARIO)

    android.matricular(Usuario("Jose", 28))
    android.matricular(Usuario("Joao", 26))
    android.matricular(Usuario("Ana", 21))

    backAnd.matricular(Usuario("Pedro", 27))
    backAnd.matricular(Usuario("Joao", 26))
    backAnd.matricular(Usuario("Maria", 21))

    println("Curso ${android.nome}  com Nivel ${android.nivel}")
    android.conteudos.forEach{
        println("${it.nome} com duração ${it.duracao} minutos com nivel ${it.nivel}")
    }
    android.inscritos.forEach {
        println("${it.nome} está matriculado no curso de ${android.nome}")
    }
    println("-----------------------------------------------------------------------------------")
    println("Curso ${backAnd.nome}  com Nivel ${backAnd.nivel}")
    backAnd.conteudos.forEach{
        println("${it.nome} com duração ${it.duracao} minutos com nivel ${it.nivel}")
    }
    backAnd.inscritos.forEach {
        println("${it.nome} está matriculado no curso de ${backAnd.nome}")
    }


}
