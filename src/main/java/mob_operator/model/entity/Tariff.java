package mob_operator.model.entity;

import java.util.List;
import java.util.Objects;

public class Tariff {

    private long id;
    private String tariffName;
    private double tariffPrice;
    private List <Opt> optList;

public Tariff() {}

public static class Builder {
    private long id;
    private String tariffName;
    private double tariffPrice;
    private List <Opt> optList;

    public Builder setId(long id) {
        this.id = id;
        return this;
    }

    public Builder setTariffName(String tariffName) {
        this.tariffName = tariffName;
        return this;
    }

    public Builder setTariffPrice(double tariffPrice) {
        this.tariffPrice = tariffPrice;
        return this;
    }

    public Builder setOptList(List<Opt> optList) {
        this.optList = optList;
        return this;
    }

    public Tariff build()

    }


}
