package Generics;


public class PrintNode extends Node {

    private Node exp;

    public PrintNode(Node e) {
        exp = e;
    }

    @Override
    public String toPrint() {
        return this.getClass().getSimpleName() +"[" + exp.toPrint() + "]";
    }

    @Override
    public String typeCheck() {
        return exp.typeCheck();
    }

    @Override
    public String codeGen() {
        return exp.codeGen()
                + "print\n";
    }
}
