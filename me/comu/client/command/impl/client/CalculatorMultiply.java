package me.comu.client.command.impl.client;

import me.comu.client.command.Argument;
import me.comu.client.command.Command;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public final class CalculatorMultiply extends Command
{
    public CalculatorMultiply()
    {
        super(new String[] {"calcmult","cmult","calculatormultiply","cmul"}, new Argument("x"), new Argument("y"));
    }

    @Override
    public String dispatch() {
        int x = Integer.parseInt(getArgument("x").getValue());
        int y = Integer.parseInt(getArgument("y").getValue());
        int xy = x * y;
        String Stringxy = Integer.toString(xy);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(Stringxy), null);
        return getArgument("x").getValue() + " * " + getArgument("y").getValue() + " = " + Integer.toString(xy);
    }

}
