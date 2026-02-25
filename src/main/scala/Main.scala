import calico.*
import calico.html.io.{*, given}
import cats.effect.*
import fs2.concurrent.*
import fs2.dom.*
import calico.frp.given

object Main extends IOWebApp:
  def render =
    SignallingRef[IO]
      .of(0)
      .toResource
      .flatMap: count =>
        div(
          h1("Calico Counter"),
          button(
            "Click me!",
            onClick(count.update(_ + 1))
          ),
          p(count.map(n => s"Count: $n"))
        )
