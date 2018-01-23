import java.awt.Image
import javax.swing.ImageIcon

class Sprite(imageName: String)
{
    init
    {
        val image = ImageIcon(imageName)
    }

    // Helper members
    var dx: Int = 0
    var dy: Int = 0
    var x:Int = 0
    var y:Int = 0

    // Move the Sprite
    fun move()
    {
        x += dx
        y += dy
    }

}