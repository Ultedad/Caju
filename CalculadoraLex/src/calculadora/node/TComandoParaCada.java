/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TComandoParaCada extends Token
{
    public TComandoParaCada()
    {
        super.setText("para cada");
    }

    public TComandoParaCada(int line, int pos)
    {
        super.setText("para cada");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComandoParaCada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComandoParaCada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComandoParaCada text.");
    }
}
