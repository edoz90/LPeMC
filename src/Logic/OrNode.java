package Logic;

import Generics.MiniFunLib;
import Generics.Node;
import Type.BoolTypeNode;

/**
 * Classe per la gestione del nodo disgiunzione<br/>
 * ESEMPIO: a || b
 */
public class OrNode extends Node {

    private final Node left;
    private final Node right;

    /**
     * @param l Identifica il primo operatore
     * @param r Identifica il secondo operatore
     */
    public OrNode(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    public String toPrint() {
        return "OrNode"
                + "[" + left.toPrint() + ","
                + right.toPrint() + "]";
    }

    @Override
    public String typeCheck() {
        if ((MiniFunLib.isCompatible(left, new BoolTypeNode()))
                && (MiniFunLib.isCompatible(right, new BoolTypeNode()))) {
            return MiniFunLib.BOOL;
        }
        System.err.println("Type Error " + this.getClass().getSimpleName());
        System.exit(0);
        return "";
    }

    @Override
    public String codeGen() {
        return left.codeGen()
                + right.codeGen()
                + MiniFunLib.ADD;
    }
}
