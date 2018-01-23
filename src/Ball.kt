import java.awt.Graphics
import javax.swing.JPanel

class Ball : JPanel()
{
    var xPos = 0
    var yPos = 0

    fun moveBall()
    {
        xPos += 1
        yPos += 1
        repaint()
    }

    override fun paint(g: Graphics?)
    {
        // Call the supermethod
        super.paint(g)

        // Create a filled circle
        g?.fillOval(xPos, yPos, 30, 30)
    }
}