/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TTipoNumero extends Token
{
    public TTipoNumero()
    {
        super.setText("numero");
    }

    public TTipoNumero(int line, int pos)
    {
        super.setText("numero");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipoNumero(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipoNumero(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipoNumero text.");
    }
}
