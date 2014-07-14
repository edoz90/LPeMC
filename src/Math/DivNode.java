package Math;

import Generics.MiniFunLib;
import Generics.Node;
import Type.IntTypeNode;

/**
 * Classe per utilizzare la divisione
 */
public class DivNode extends Node {

    private final Node left;
    private final Node right;

    /**
     * @param l Identifica il primo operatore
     * @param r Identifica il secondo operatore
     */
    public DivNode(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    public String toPrint() {
        return "DivNode"
                + "[" + left.toPrint() + ","
                + right.toPrint() + "]";
    }

    @Override
    public String typeCheck() {
        if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
                && (MiniFunLib.isCompatible(right, new IntTypeNode()))) {
            return MiniFunLib.INT;
        }
        System.err.println("Type Error: " + this.getClass().getSimpleName());
        System.exit(0);
        return "";
    }

    @Override
    public String codeGen() {
        String lab1 = MiniFunLib.newLabel();
        String lab2 = MiniFunLib.newLabel();
        return left.codeGen()
                + right.codeGen()
                + "push 0\n"
                + MiniFunLib.BRANCHEQ + lab1 + "\n"
                + MiniFunLib.DIV
                + "b " + lab2 + "\n"
                + lab1 + ":\n"
                + MiniFunLib.HALT
                + lab2 + ":\n";
    }
}
