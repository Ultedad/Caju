/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TExibir extends Token
{
    public TExibir()
    {
        super.setText("exibir");
    }

    public TExibir(int line, int pos)
    {
        super.setText("exibir");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExibir(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExibir(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExibir text.");
    }
}
