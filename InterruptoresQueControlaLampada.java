//4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente.
// Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
// Seu objetivo é descobrir qual interruptor controla qual lâmpada.
//
//Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

public class InterruptoresQueControlaLampada {

    /*Para resolver esse problema, podemos seguir este procedimento:

Primeira visita:

Ligue o primeiro interruptor e aguarde alguns minutos.
Depois, desligue-o e ligue o segundo interruptor.
Segunda visita:

Vá até a sala.
Se a lâmpada estiver acesa, o primeiro interruptor controla essa lâmpada.
Se a lâmpada estiver apagada e a lâmpada estiver quente, o segundo interruptor controla essa lâmpada.
Se a lâmpada estiver apagada e a lâmpada estiver fria, o terceiro interruptor controla essa lâmpada.
Explicação:

Na primeira visita, o primeiro interruptor é ligado e desligado. Se ele estava originalmente desligado, ele não terá tempo suficiente para aquecer a lâmpada. O segundo interruptor é ligado e deixado ligado.
Se a lâmpada estiver acesa, o primeiro interruptor controla essa lâmpada. Se estiver apagada e quente, o segundo interruptor controla. Se estiver apagada e fria, o terceiro interruptor controla.
Esse método permite identificar qual interruptor controla cada lâmpada com apenas duas visitas à sala das lâmpadas.

     */
}
