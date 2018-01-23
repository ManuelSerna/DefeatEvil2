import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.RenderingHints
import javax.swing.JFrame
import javax.swing.JPanel

class Game : JPanel()
{
    internal var x = 0
    internal var y = 0
    fun moveBall()
    {
        x = x + 1
        y = y + 1
    }

    override fun paint(g: Graphics?)
    {
        super.paint(g)
        g?.fillOval(x, y, 30, 30)
    }
}
fun main(args: Array<String>)
{
    val frame = JFrame("Sample Frame")
    val game = Game()
    frame.add(game)
    frame.setSize(300, 400)
    frame.isVisible = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    while (true)
    {
        game.moveBall()
        game.repaint()
        Thread.sleep(10)
    }
}
