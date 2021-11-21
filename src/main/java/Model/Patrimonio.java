package Model;

public class Patrimonio {
    private int id;
    private String amount;
    private String default_currency;
    private int idCelebrita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDefault_currency() {
        return default_currency;
    }

    public void setDefault_currency(String default_currency) {
        this.default_currency = default_currency;
    }

    public int getIdCelebrita() {
        return idCelebrita;
    }

    public void setIdCelebrita(int idCelebrita) {
        this.idCelebrita = idCelebrita;
    }
}
