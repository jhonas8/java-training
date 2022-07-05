package desafios.lambda;

public abstract class Produto {
    private String name;
    private double value;
    private double desconto;

    public Produto (String name, double value, double desconto) {
        this.name = name;
        this.value = value;
        this.desconto = desconto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
