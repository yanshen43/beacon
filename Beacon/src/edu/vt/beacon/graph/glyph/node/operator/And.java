package edu.vt.beacon.graph.glyph.node.operator;

import edu.vt.beacon.graph.glyph.GlyphType;
import edu.vt.beacon.graph.glyph.node.auxiliary.Label;

public class And extends AbstractOperator
{
    /*
     * document constructor
     */
    public And()
    {
        super (GlyphType.AND);
        
        update();
    }
    
    /*
     * document method
     */
    @Override
    protected void initializeLabel()
    {
        label_ = new Label(this, "AND");
    }
}