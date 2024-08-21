import java.text.DecimalFormat
import kotlin.math.round

fun main() {
    var produto: String
    var precoCusto: Double
    var qtdProdutos: Int
    var impostoProduto: Double
    var margemLucro: Double

    produto = "Batata"
    println("Produto:                $produto")
    precoCusto = 5.21
    println("Preço de custo:         $precoCusto")
    qtdProdutos = 7
    println("Quantidade de produtos: $qtdProdutos")
    impostoProduto = 0.052
    println("Imposto do produto      $impostoProduto")
    margemLucro = 0.2
    println("Margem de lucro:        $margemLucro")
    println()

    var totalSemImpostos = precoCusto * qtdProdutos
    println("Total sem impostos:             $totalSemImpostos")
    var totalComImpostos = totalSemImpostos + totalSemImpostos * impostoProduto
    var precoVenda = totalComImpostos * (1+margemLucro) / qtdProdutos
    println("Preço de venda unitário:        $precoVenda")
    precoVenda = round(precoVenda*100)/100
    println("Preço de venda arredondado:     $precoVenda")
    println("Total com impostos:             $totalComImpostos")
    totalComImpostos = round(totalComImpostos*100)/100
    println("Total com impostos arredondado: $totalComImpostos")

    var formatoValor  = DecimalFormat("R$ ##,#0.00")
    var totalComImpostosFormatado = formatoValor.format(totalComImpostos)
    var precoVendaFormatado = formatoValor.format(precoVenda)

    val mensagemFinal = """ 
        
        O valor total com impostos do produto $produto resultou em $totalComImpostosFormatado.
        No qual, o preço de venda sugerido é $precoVendaFormatado. 
        """.trimIndent()

    println(mensagemFinal)

}