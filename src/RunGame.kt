import javax.swing.JFrame

fun main(args: Array<String>)
{
    // Declare our frame and ball object
    val frame = GameFrame()
    val ball = Ball()
    frame.add(ball)

    // Game Loop
    while(true)
    {
        // Move the ball
        ball.moveBall()

        // Delay thread so the movement isn't instantaneous
        Thread.sleep(10)
    }
}
