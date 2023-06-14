package patterns.ChainOfResponsibility;

public class Dollar40Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 40) {
            int num = cur.getAmount() / 40;
            int remainder = cur.getAmount() % 40;
            System.out.println("Dispensing " + num + " 40$ note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }
}
